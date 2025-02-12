package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.PiezaEskaera;

public class kudeaketaPiezaEsk {

    public List<PiezaEskaera> lortuPiezaEsk() {
        List<PiezaEskaera> lista = new ArrayList<>();
        String sql = "SELECT idPiezaEskaera, Hornitzailea_idHornitzailea, Pieza_idPieza, kopurua, data " +
                     "FROM piezaeskaera ORDER BY idPiezaEskaera ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                PiezaEskaera pe = mapResultSetToPiezaEsk(rs);
                lista.add(pe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private PiezaEskaera mapResultSetToPiezaEsk(ResultSet rs) throws SQLException {
        return new PiezaEskaera(
            rs.getInt("idPiezaEskaera"),
            rs.getInt("Hornitzaile_idHornitzailea"),
            rs.getInt("Pieza_idPieza"),
            rs.getInt("kopurua"),
            rs.getTimestamp("data")

        );
    }

    public void sortuPiezaEskaera(PiezaEskaera piezaEskaera) {
        String sql = "INSERT INTO piezaeskaera (Hornitzaile_idHornitzailea, Pieza_idPieza, kopurua, data) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapPiezaEskaeraToPreparedStatement(piezaEskaera, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eguneratuPiezaEskaera(PiezaEskaera piezaEskaera) {
        String sql = "UPDATE piezaeskaera SET Hornitzaile_idHornitzailea = ?, Pieza_idPieza = ?, kopurua = ?, data = ? WHERE idPiezaEskaera = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapPiezaEskaeraToPreparedStatement(piezaEskaera, ps);
            ps.setInt(5, piezaEskaera.getIdPiezaEskaera());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean ezabatuPiezaEskaera(int idProduktua) {
        String sql = "DELETE FROM produktua WHERE idProduktua = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idProduktua);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
    }

    private void mapPiezaEskaeraToPreparedStatement(PiezaEskaera piezaEskaera, PreparedStatement ps) throws SQLException {
        ps.setInt(1, piezaEskaera.getHornitzaile_idHornitzailea());
        ps.setInt(2, piezaEskaera.getPieza_idPieza());
        ps.setInt(3, piezaEskaera.getKopurua());
        ps.setTimestamp(4, piezaEskaera.getData());

    }
}
