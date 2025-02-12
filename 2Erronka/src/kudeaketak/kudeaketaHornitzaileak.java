package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.Hornitzailea;

public class kudeaketaHornitzaileak {

    public List<Hornitzailea> lortuHornitzaileak() {
        List<Hornitzailea> lista = new ArrayList<>();
        String sql = "SELECT idHornitzailea, nif, izena, telefonoZenbakia, postaElektronikoa, helbidea, herria, " +
                     "postakodea " +
                     "FROM hornitzailea ORDER BY idHornitzailea ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                Hornitzailea h = mapResultSetToHornitzailea(rs);
                lista.add(h);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Hornitzailea mapResultSetToHornitzailea(ResultSet rs) throws SQLException {

        return new Hornitzailea(
            rs.getInt("idHornitzailea"),
            rs.getString("nif"),
            rs.getString("izena"),
            rs.getString("telefonoZenbakia"),
            rs.getString("postaElektronikoa"),
            rs.getString("helbidea"),
            rs.getString("herria"),
            rs.getString("postakodea")
        );
    }

    public void sortuHornitzailea(Hornitzailea hornitzailea) {
        String sql = "INSERT INTO hornitzailea (nif, izena, telefonoZenbakia, postaElektronikoa, helbidea, herria, postakodea) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapHornitzaileaToPreparedStatement(hornitzailea, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eguneratuHornitzailea (Hornitzailea hornitzailea) {
        String sql = "UPDATE hornitzailea SET nif = ?, izena = ?, telefonoZenbakia = ?, postaElektronikoa = ?, helbidea = ?, herria = ?, postakodea = ? WHERE idHornitzailea = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapHornitzaileaToPreparedStatement(hornitzailea, ps);
            ps.setInt(8, hornitzailea.getIdHornitzailea());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void ezabatuHornitzailea(int idHornitzailea) {
        String sql = "DELETE FROM hornitzailea WHERE idHornitzailea = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idHornitzailea);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void mapHornitzaileaToPreparedStatement(Hornitzailea hornitzailea, PreparedStatement ps) throws SQLException {
        ps.setString(1, hornitzailea.getNif());
        ps.setString(2, hornitzailea.getIzena());
        ps.setString(3, hornitzailea.getTelefonoZenbakia());
        ps.setString(4, hornitzailea.getPostaElektronikoa());
        ps.setString(5, hornitzailea.getHelbidea());
        ps.setString(6, hornitzailea.getHerria());
        ps.setString(7, hornitzailea.getPostakodea());


    }
}

