package erronka2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginaMetodok {
	
	
	public Langilea lortuErabiltzailea(Langilea lan) {
		
		Langilea langilea = null;
		
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBKonexioa.konexioaEgin();
			
			String sql = "select * from langilea where erabiltzaileIzena = ? and pasahitza = ?";
			
			pst=conn.prepareStatement(sql);
			
			pst.setString(1, lan.getErabiltzaileIzena());
			pst.setString(2, lan.getPasahitza());
			
			rs=pst.executeQuery();
			
			while(rs.next()) {
				langilea=new Langilea(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
			}
			
		} catch (Exception e) {
			System.out.println("Erabiltzailea lortzeko garaian errore bat gertatu da");
		}
		
		return langilea;
		
	}

}
