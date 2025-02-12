package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.ProduktuaPrestakuntzan;

public class kudeaketaProdPrest {

    public List<ProduktuaPrestakuntzan> lortuProduktuakPrestakuntzan() {
        List<ProduktuaPrestakuntzan> lista = new ArrayList<>();
        String sql = "SELECT * FROM prodprest ORDER BY idProdPrest ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                ProduktuaPrestakuntzan ppp = mapResultSetToProduktua(rs);
                lista.add(ppp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private ProduktuaPrestakuntzan mapResultSetToProduktua(ResultSet rs) throws SQLException {

        return new ProduktuaPrestakuntzan(
            rs.getInt("idProdPrest"),
            rs.getInt("ProduktuMota_idProduktuMota"),
            rs.getInt("Bezeroa_idBezeroa"),
            rs.getString("marka"),
            rs.getString("modeloa"),
            rs.getString("ezaugarriak"),
            rs.getString("egoera")
        );
    }

    public void sortuProduktuaPrest(ProduktuaPrestakuntzan prodprest) {
        String sql = "INSERT INTO prodprest (idProdPrest, ProduktuMota_idProduktuMota, Bezeroa_idBezeroa, marka, modeloa, ezaugarriak, egoera) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapProduktuaToPreparedStatement(prodprest, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void eguneratuProduktuaPrest(ProduktuaPrestakuntzan prodprest) {
        String sql = "UPDATE prodprest SET marka = ?, modeloa = ?, memoria = ?, ram = ?, prozesagailua = ?, tamaina = ?, sistemaEragilea = ?, kamara = ?, erresoluzioa = ?, frekuentzia = ?, kolorea = ?, salmentaPrezioa = ?, stock = ? WHERE idProduktua = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapProduktuaToPreparedStatement(prodprest, ps);
            ps.setInt(13, prodprest.getIdProdPrest());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean ezabatuProduktuaPrest(int idProdPrest) {
        String sql = "DELETE FROM prodprest WHERE idProdPrest = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idProdPrest);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } return false;
    }


    private void mapProduktuaToPreparedStatement(ProduktuaPrestakuntzan prodprest, PreparedStatement ps) throws SQLException {
        ps.setString(1, prodprest.getMarka());
        ps.setString(2, prodprest.getModeloa());
        ps.setString(3, prodprest.getEzaugarriak());
        ps.setString(4, prodprest.getEgoera());

    }
}