package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.Bezeroa;
import erronka2.DBKonexioa;

public class kudeaketaBezeroak {

    public List<Bezeroa> lortuBezeroak() {
        List<Bezeroa> lista = new ArrayList<>();
        String sql = "SELECT idBezeroa, nanEdoNif, izena, abizena, telefonoZenbakia, postaElektronikoa, helbidea, herria, " +
                     "postakodea, pasahitza " +
                     "FROM bezeroa ORDER BY idBezeroa ASC";  
        
        try (Connection conn = DBKonexioa.konexioaEgin(); 
             PreparedStatement pst = conn.prepareStatement(sql); 
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
               
                Bezeroa b = mapResultSetToBezeroa(rs);
                lista.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Bezeroa mapResultSetToBezeroa(ResultSet rs) throws SQLException {
      
        return new Bezeroa(
            rs.getInt("idBezeroa"),
            rs.getString("nanEdoNif"),
            rs.getString("izena"),
            rs.getString("abizena"),
            rs.getString("telefonoZenbakia"),
            rs.getString("postaElektronikoa"),
            rs.getString("helbidea"),
            rs.getString("herria"),
            rs.getString("postakodea"),
            rs.getString("pasahitza")
        );
    }

    public void sortuBezeroa(Bezeroa bezeroa) {
        String sql = "INSERT INTO bezeroa (nanEdoNif, izena, abizena, telefonoZenbakia, postaElektronikoa, helbidea, herria, postakodea, pasahitza) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapBezeroaToPreparedStatement(bezeroa, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eguneratuBezeroa(Bezeroa bezeroa) {
        String sql = "UPDATE bezeroa SET nanEdoNif = ?, izena = ?, abizena = ?, telefonoZenbakia = ?, postaElektronikoa = ?, helbidea = ?, herria = ?, postakodea = ?, pasahitza = ? WHERE idBezeroa = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapBezeroaToPreparedStatement(bezeroa, ps);
            ps.setInt(13, bezeroa.getIdBezeroa());  
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void ezabatuBezeroa(int idBezeroa) {
        String sql = "DELETE FROM bezeroa WHERE idBezeroa = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idBezeroa);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void mapBezeroaToPreparedStatement(Bezeroa bezeroa, PreparedStatement ps) throws SQLException {
        ps.setString(1, bezeroa.getNanEdoNif());
        ps.setString(2, bezeroa.getIzena());
        ps.setString(3, bezeroa.getAbizena());
        ps.setString(4, bezeroa.getTelefonoZenbakia());
        ps.setString(5, bezeroa.getPostaElektronikoa());
        ps.setString(6, bezeroa.getHelbidea());
        ps.setString(7, bezeroa.getHerria());
        ps.setString(8, bezeroa.getPostakodea());
        ps.setString(9, bezeroa.getPasahitza());
   
    }
}
