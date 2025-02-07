package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.Langilea;

public class kudeaketaLangileak {

    public List<Langilea> lortuLangilea() {
        List<Langilea> lista = new ArrayList<>();
        String sql = "SELECT idlangilea, lanpostua_idlanpostua, lanpostua, nan, izena, abizena, telefonoZenbakia, postaElektronikoa, erabiltzaileIzena, " +
                "pasahitza, helbidea, postaKodea " +  
                "FROM langilea ORDER BY idlangilea ASC";


        try (Connection conn = DBKonexioa.konexioaEgin(); 
             PreparedStatement pst = conn.prepareStatement(sql); 
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                
                Langilea l = mapResultSetToLangilea(rs);
                lista.add(l);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Langilea mapResultSetToLangilea(ResultSet rs) throws SQLException {
      
    	return new Langilea(
    		    rs.getInt("idlangilea"),
    		    rs.getInt("lanpostua_idlanpostua"),  
    		    rs.getString("lanpostua"),
    		    rs.getString("nan"),
    		    rs.getString("izena"),
    		    rs.getString("abizena"),
    		    rs.getString("telefonoZenbakia"),
    		    rs.getString("postaElektronikoa"),
    		    rs.getString("erabiltzaileIzena"),
    		    rs.getString("pasahitza"),
    		    rs.getString("helbidea"),
    		    rs.getString("postaKodea")
    		);

    }

    public void sortuLangilea (Langilea langilea) {
        String sql = "INSERT INTO langilea (lanpostua, nan, izena, abizena, telefonoZenbakia, postaElektronikoa, erabiltzaileIzena, pasahitza, helbidea, postaKodea) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
        	mapLangileaToPreparedStatement(langilea, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  
    public void eguneratuLangilea(Langilea langilea) {
        String sql = "UPDATE produktua SET lanpostua = ?, nan = ?, izena = ?, abizena = ?, telefonoZenbakia = ?, postaElektronikoa = ?, erabiltzaileIzena = ?, helbidea = ?, postaKodea = ? WHERE idlangilea = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapLangileaToPreparedStatement(langilea, ps);
            ps.setInt(13, langilea.getIdlangilea());  
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void ezabatuLangilea(int idlangilea) {
        String sql = "DELETE FROM langilea WHERE idlangilea = ?";
        
        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idlangilea);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void mapLangileaToPreparedStatement(Langilea langilea, PreparedStatement ps) throws SQLException {
        ps.setString(1, langilea.getLanpostua());
        ps.setString(2, langilea.getNan());
        ps.setString(3, langilea.getIzena());
        ps.setString(4, langilea.getAbizena());
        ps.setString(5, langilea.getTelefonoZenbakia());
        ps.setString(6, langilea.getPostaElektronikoa());
        ps.setString(7, langilea.getErabiltzaileIzena());
        ps.setString(8, langilea.getHelbidea());
        ps.setString(9, langilea.getPostaKodea());
        
    }
}
