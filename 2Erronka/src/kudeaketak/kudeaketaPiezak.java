package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.Pieza;

public class kudeaketaPiezak {

    public List<Pieza> lortuPiezak() {
        List<Pieza> lista = new ArrayList<>();
        String sql = "SELECT idPieza, kategoria, marka, modeloa, ezaugarriak, erosketaPrezioa, stock " +
                     "FROM pieza ORDER BY idPieza ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Pieza pi = mapResultSetToPieza(rs);
                lista.add(pi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Pieza mapResultSetToPieza(ResultSet rs) throws SQLException {
        return new Pieza(
            rs.getInt("idPieza"),
            rs.getInt("kategoria"),
            rs.getString("marka"),
            rs.getString("modeloa"),
            rs.getString("ezaugarriak"),
            rs.getDouble("erosketaPrezioa"),
            rs.getInt("Stock")
        );
    }

    public void sortuPieza(Pieza pieza) {
        String sql = "INSERT INTO pieza (kategoria, marka, modeloa, ezaugarriak, erosketaPrezioa, stock) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapPiezaToPreparedStatement(pieza, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eguneratuPieza(Pieza pieza) {
        String sql = "UPDATE pieza SET kategoria = ?, marka = ?, modeloa = ?, ezaugarriak = ?, erosketaPrezioa = ?, Stock = ? WHERE idPieza = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapPiezaToPreparedStatement(pieza, ps);
            ps.setInt(6, pieza.getIdPieza());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean ezabatuPieza(int idPieza) {
        String sql = "DELETE FROM pieza WHERE idPieza = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idPieza);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } return false;
    }

    private void mapPiezaToPreparedStatement(Pieza pieza, PreparedStatement ps) throws SQLException {
    	ps.setInt(1, pieza.getKategoria());
        ps.setString(2, pieza.getMarka());
        ps.setString(3, pieza.getModeloa());
        ps.setString(4, pieza.getEzaugarriak());
        ps.setDouble(5, pieza.getErosketaPrezioa());
        ps.setInt(6, pieza.getStock());
    }
}
