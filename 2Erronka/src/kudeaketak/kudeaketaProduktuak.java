package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.Produktua;

public class kudeaketaProduktuak {

    public List<Produktua> lortuProduktuak() {
        List<Produktua> lista = new ArrayList<>();
        String sql = "SELECT idProduktua, ProduktuMota_idProduktuMota, marka, modeloa, memoria, ram, prozesagailua, tamaina, " +
                     "sistemaEragilea, kamara, erresoluzioa, frekuentzia, kolorea, salmentaPrezioa, stock " +
                     "FROM produktua ORDER BY idProduktua ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                Produktua p = mapResultSetToProduktua(rs);
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Produktua mapResultSetToProduktua(ResultSet rs) throws SQLException {

        return new Produktua(
            rs.getInt("idProduktua"),
            rs.getInt("ProduktuMota_idProduktuMota"),
            rs.getString("marka"),
            rs.getString("modeloa"),
            rs.getString("memoria"),
            rs.getString("ram"),
            rs.getString("prozesagailua"),
            rs.getString("tamaina"),
            rs.getString("sistemaEragilea"),
            rs.getString("kamara"),
            rs.getString("erresoluzioa"),
            rs.getString("frekuentzia"),
            rs.getString("kolorea"),
            rs.getDouble("salmentaPrezioa"),
            rs.getInt("stock")
        );
    }

    public void sortuProduktua(Produktua produktua) {
        String sql = "INSERT INTO produktua (ProduktuMota_idProduktuMota, marka, modeloa, memoria, ram, prozesagailua, tamaina, sistemaEragilea, kamara, erresoluzioa, frekuentzia, kolorea, salmentaPrezioa, stock) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapProduktuaToPreparedStatement(produktua, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void eguneratuProduktua(Produktua produktua) {
        String sql = "UPDATE produktua SET marka = ?, modeloa = ?, memoria = ?, ram = ?, prozesagailua = ?, tamaina = ?, sistemaEragilea = ?, kamara = ?, erresoluzioa = ?, frekuentzia = ?, kolorea = ?, salmentaPrezioa = ?, stock = ? WHERE idProduktua = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapProduktuaToPreparedStatement(produktua, ps);
            ps.setInt(14, produktua.getId());  // Establecemos el ID para la actualización
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un producto de la base de datos
    public boolean ezabatuProduktua(int idProduktua) {
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

    // Método auxiliar para mapear un Producto a PreparedStatement
    private void mapProduktuaToPreparedStatement(Produktua produktua, PreparedStatement ps) throws SQLException {
    	ps.setInt(1, produktua.getProduktuMotaId());
        ps.setString(2, produktua.getMarka());
        ps.setString(3, produktua.getModeloa());
        ps.setString(4, produktua.getMemoria());
        ps.setString(5, produktua.getRam());
        ps.setString(6, produktua.getProzesagailua());
        ps.setString(7, produktua.getTamaina());
        ps.setString(8, produktua.getSistemaEragilea());
        ps.setString(9, produktua.getKamara());
        ps.setString(10, produktua.getErresoluzioa());
        ps.setString(11, produktua.getFrekuentzia());
        ps.setString(12, produktua.getKolorea());
        ps.setDouble(13, produktua.getSalmentaPrezioa());
        ps.setInt(14, produktua.getStock());
    }
}
