package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.Balorazioa;
import erronka2.DBKonexioa;

public class kudeaketaBalorazioak {

    public List<Balorazioa> lortuBalorazioak() {
        List<Balorazioa> lista = new ArrayList<>();
        String sql = "SELECT idBalorazioa, Bezeroa_idBezeroa, Produktua_idProduktua, balorazioa, data " +
                     "FROM balorazioa ORDER BY idBalorazioa ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Balorazioa bl = mapResultSetToBalorazioa(rs);
                lista.add(bl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Balorazioa mapResultSetToBalorazioa(ResultSet rs) throws SQLException {
        return new Balorazioa(
            rs.getInt("idBalorazioa"),
            rs.getInt("Bezeroa_idBezeroa"),
            rs.getInt("Produktua_idProduktua"),
            rs.getString("balorazioa"),
            rs.getTimestamp("data")
        );
    }

    public void sortuBalorazioa(Balorazioa balorazioa) {
        String sql = "INSERT INTO balorazioa (idBalorazioa, Bezeroa_idBezeroa, Produktua_idProduktua, balorazioa, data) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapBalorazioaToPreparedStatement(balorazioa, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eguneratuBalorazioa(Balorazioa balorazioa) {
        String sql = "UPDATE balorazioa SET Bezeroa_idBezeroa = ?, Produktua_idProduktua = ?, balorazioa = ?, data = ? WHERE idBalorazioa = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapBalorazioaToPreparedStatement(balorazioa, ps);
            ps.setInt(5, balorazioa.getIdBalorazioa());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean ezabatuBalorazioa(int idBalorazioa) {
        String sql = "DELETE FROM balorazioa WHERE idBalorazioa = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idBalorazioa);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }return false;
    }

    private void mapBalorazioaToPreparedStatement(Balorazioa balorazioa, PreparedStatement ps) throws SQLException {
        ps.setInt(1, balorazioa.getBezeroa_idBezeroa());
        ps.setInt(2, balorazioa.getProduktua_idProduktua());
        ps.setString(3, balorazioa.getBalorazioa());
        ps.setTimestamp(4, balorazioa.getData());
    }
}
