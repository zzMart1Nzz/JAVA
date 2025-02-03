package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class Langilea {

	// EZAUGARRIAK
	private int idLangilea;
	private int idLanpostua;
	private String lanpostua;
	private String nan;
	private String izena;
	private String abizena;
	private String telefonoa;
	private String email;
	private String erabiltzaileIzena;
	private String pasahitza;
	private String helbidea;
	private String postakodea;
	

	// SORTZAILEAK(CONSTRUCTORES)
	public Langilea() {
	}

	public Langilea(int idLangilea, int idLanpostua, String lanpostua, String nan, String izena, String abizena, String telefonoa, String email,
			String erabiltzaileIzena, String pasahitza, String helbidea, String postakodea) {
		super();
		this.idLangilea = idLangilea;
		this.idLanpostua = idLanpostua;
		this.lanpostua = lanpostua;
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
		this.telefonoa = telefonoa;
		this.email = email;
		this.erabiltzaileIzena = erabiltzaileIzena;
		this.pasahitza = pasahitza;
		this.helbidea = helbidea;
		this.postakodea = postakodea;
	}

	// GETTERS eta SETTERS
	public int getIdLangilea() {
		return idLangilea;
	}

	public void setIdLangilea(int idLangilea) {
		this.idLangilea = idLangilea;
	}

	public int getIdLanpostua() {
		return idLanpostua;
	}

	public void setIdLanpostua(int idLanpostua) {
		this.idLanpostua = idLanpostua;
	}

	public String getLanpostua() {
		return lanpostua;
	}

	public void setLanpostua(String lanpostua) {
		this.lanpostua = lanpostua;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getTelefonoa() {
		return telefonoa;
	}

	public void setTelefonoa(String telefonoa) {
		this.telefonoa = telefonoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getErabiltzaileIzena() {
		return erabiltzaileIzena;
	}

	public void setErabiltzaileIzena(String erabiltzaileIzena) {
		this.erabiltzaileIzena = erabiltzaileIzena;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public String getPostakodea() {
		return postakodea;
	}

	public void setPostakodea(String postakodea) {
		this.postakodea = postakodea;
	}
	

	// TO STRING
	@Override
	public String toString() {
		return "Langileak [id=" + idLangilea + ", idLanpostua=" + idLanpostua + ", lanpostua=\" + lanpostua + \", nan=" + nan + ", izena=" + izena + ", abizena="
				+ abizena + ", telefonoa=" + telefonoa + ", email=" + email + ", erabiltzaileIzena=" + erabiltzaileIzena
				+ ", pasahitza=" + pasahitza + ", helbidea=" + helbidea + ", postakodea=" + postakodea + "]";
	}

	// HASHCODE eta EQUALS

	@Override
	public int hashCode() {
		return Objects.hash(abizena, email, erabiltzaileIzena, helbidea, idLangilea, idLanpostua, izena, lanpostua, nan, pasahitza,
				postakodea, telefonoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Langilea other = (Langilea) obj;
		return Objects.equals(abizena, other.abizena) && Objects.equals(email, other.email)
				&& Objects.equals(erabiltzaileIzena, other.erabiltzaileIzena) && Objects.equals(helbidea, other.helbidea)
				&& idLangilea == other.idLangilea && idLanpostua == other.idLanpostua && Objects.equals(izena, other.izena)
				&& Objects.equals(lanpostua, other.lanpostua) && Objects.equals(nan, other.nan)
				&& Objects.equals(pasahitza, other.pasahitza) && Objects.equals(postakodea, other.postakodea)
				&& Objects.equals(telefonoa, other.telefonoa);
	}

	// METODOAK
	// Imprimitu metodoa, produktuen datu guztiak ematen dituena.
	public void langilearenDatuakIkusi() {
		String kontsulta = "SELECT * FROM langileak LIMIT ? OFFSET ?";
		int limit = 5;
		int offset = 0;
		boolean jarraitu = true;
		Scanner sc = new Scanner(System.in);
		DBKonexioa db = new DBKonexioa();
		
		
		try (Connection conn=db.konexioaEgin()) {
			while (jarraitu) {
				try (PreparedStatement deklarazioa = conn.prepareStatement(kontsulta)) {
					deklarazioa.setInt(1, limit);
					deklarazioa.setInt(2, offset);

					try (ResultSet erantzuna = deklarazioa.executeQuery()) {
						if (!erantzuna.isBeforeFirst()) {
							System.out.println("Ez daude langile gehiago erakusteko.");
							break;
						}

						while (erantzuna.next()) {
							int idLangilea = erantzuna.getInt("idLangilea");
							int idlanpostua = erantzuna.getInt("idlanpostua");
							String lanpostua = erantzuna.getString("lanpostua");
							String nan = erantzuna.getString("nan");
							String izena = erantzuna.getString("izena");
							String abizena = erantzuna.getString("abizena");
							String telefonoa = erantzuna.getString("telefonozenbakia");
							String email = erantzuna.getString("postaelektronikoa");
							String erabiltzaileIzena = erantzuna.getString("erabiltzaileIzena");
							String pasahitza = erantzuna.getString("pasahitza");
							String helbidea = erantzuna.getString("helbidea");
							String postakodea = erantzuna.getString("postakodea");
							
							
							System.out.println("IdLangilea: " + idLangilea + "| IdLanpostua: " + idlanpostua + "| Lanpostua: " + lanpostua + "| NAN-a: " + nan + "| Izena: " + izena + "| Abizena: "
									+ abizena + "| Telefonoa: " + telefonoa + "| Posta elektronikoa: " + email
									+ "| Erabiltzaile izena: " + erabiltzaileIzena	+ "| Pasahitza: " + pasahitza +"| Helbidea: " + helbidea + "| Posta kodea: " + postakodea );
						}
					}
				}

				System.out.print("Hurrengo 5 langileak ikusi nahi dituzu?(bai/ez): ");
				String erantzuna = sc.next();
				if (erantzuna.equalsIgnoreCase("bai")) {
					offset += limit;
				} else {
					jarraitu = false;
				}
			}
		} catch (SQLException e) {
			System.out.println("Zerbaitek ez du funtzionatu.");
		}

	}
	public void langileBerriaSartu() {
		
	}
	public void langiearenDatuakEguneratu() {
		
	}
	public void langileaEzabatu() {
		
	}



}
