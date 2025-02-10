package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.Eskaera;
import erronka2.DBKonexioa;

public class kudeaketaEskaerak {

    public List<Eskaera> lortuEskaerak() {
        List<Eskaera> lista = new ArrayList<>();
        String sql = "SELECT idEskaera, fraZkia, Bezeroa_idBezeroa, totala, egoera, data, faktura " + 
                     "FROM eskaera ORDER BY idEskaera ASC";  
        
        try (Connection conn = DBKonexioa.konexioaEgin(); 
             PreparedStatement pst = conn.prepareStatement(sql); 
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Eskaera es = mapResultSetToEskaera(rs);
                lista.add(es);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Eskaera mapResultSetToEskaera(ResultSet rs) throws SQLException {
        return new Eskaera(
            rs.getInt("idEskaera"),
            rs.getString("fraZkia"),
            rs.getInt("Bezeroa_idBezeroa"),
            rs.getDouble("totala"),
            rs.getString("egoera"),
            rs.getTimestamp("data"),
            rs.getString("faktura")
        );
    }

    public void sortuEskaera(Eskaera eskaera) {
        String sql = "INSERT INTO eskaera (fraZkia, Bezeroa_idBezeroa, totala, egoera, data, faktura) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapEskaeraToPreparedStatement(eskaera, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eguneratuEskaera(Eskaera eskaera) {
        String sql = "UPDATE eskaera SET fraZkia = ?, Bezeroa_idBezeroa = ?, totala = ?, egoera = ?, data = ?, faktura = ? WHERE idEskaera = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapEskaeraToPreparedStatement(eskaera, ps);
            ps.setInt(5, eskaera.getIdEskaera());  
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ezabatuEskaera(int idEskaera) {
        String sql = "DELETE FROM eskaera WHERE idEskaera = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEskaera);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mapEskaeraToPreparedStatement(Eskaera eskaera, PreparedStatement ps) throws SQLException {
        ps.setString(1, eskaera.getFraZkia());
        ps.setInt(2, eskaera.getBezeroa_idBezeroa());
        ps.setDouble(3, eskaera.getTotala());
        ps.setString(4, eskaera.getEgoera());
        ps.setTimestamp(5, eskaera.getData());
        ps.setString(6, eskaera.getFaktura());
        
    
    }
}
