package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.Produktua;
import erronka2.DBKonexioa;

public class kudeaketaProduktuak {

    public List<Produktua> lortuProduktuak() {
        List<Produktua> lista = new ArrayList<>();
        String sql = "SELECT idProduktua, ProduktuMota_idProduktuMota, marka, modeloa, memoria, ram, prozesagailua, tamaina, " +
                     "sistemaEragilea, kamara, erresoluzioa, frekuentzia, kolorea, salmentaPrezioa, stock " +
                     "FROM produktua ORDER BY idProduktua ASC";  // Ordena por idProduktua

        try (Connection conn = DBKonexioa.konexioaEgin(); 
             PreparedStatement pst = conn.prepareStatement(sql); 
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                // Mapeo de los resultados del ResultSet
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
        String sql = "INSERT INTO produktua (marka, modeloa, memoria, ram, prozesagailua, tamaina, sistemaEragilea, kamara, erresoluzioa, frekuentzia, kolorea, salmentaPrezioa, stock) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapProduktuaToPreparedStatement(produktua, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar un producto en la base de datos
    public void eguneratuProduktua(Produktua produktua) {
        String sql = "UPDATE produktua SET marka = ?, modeloa = ?, memoria = ?, ram = ?, prozesagailua = ?, tamaina = ?, sistemaEragilea = ?, kamara = ?, erresoluzioa = ?, frekuentzia = ?, kolorea = ?, salmentaPrezioa = ?, stock = ? WHERE idProduktua = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapProduktuaToPreparedStatement(produktua, ps);
            ps.setInt(13, produktua.getId());  // Establecemos el ID para la actualización
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un producto de la base de datos
    public void ezabatuProduktua(int idProduktua) {
        String sql = "DELETE FROM produktua WHERE idProduktua = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idProduktua);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método auxiliar para mapear un Producto a PreparedStatement
    private void mapProduktuaToPreparedStatement(Produktua produktua, PreparedStatement ps) throws SQLException {
        ps.setString(1, produktua.getMarka());
        ps.setString(2, produktua.getModeloa());
        ps.setString(3, produktua.getMemoria());
        ps.setString(4, produktua.getRam());
        ps.setString(5, produktua.getProzesagailua());
        ps.setString(6, produktua.getTamaina());
        ps.setString(7, produktua.getSistemaEragilea());
        ps.setString(8, produktua.getKamara());
        ps.setString(9, produktua.getErresoluzioa());
        ps.setString(10, produktua.getFrekuentzia());
        ps.setString(11, produktua.getKolorea());
        ps.setDouble(12, produktua.getSalmentaPrezioa());
        ps.setInt(13, produktua.getStock());
    }
}
