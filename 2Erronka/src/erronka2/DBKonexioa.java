package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  DBKonexioa {
	private static final String ERABILTZAILEA = "java";
	private static final String PASAHITZA = "1mg3";
	private static final String DB = "2erronka";
	private static final String URL = "jdbc:mysql://172.16.242.138:3306/"+DB;

	//private static Connection conn;
	//private static Statement st_= null;

	public DBKonexioa() {

	}
	public static  Connection konexioaEgin() throws SQLException {
		return DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);

	}

}

