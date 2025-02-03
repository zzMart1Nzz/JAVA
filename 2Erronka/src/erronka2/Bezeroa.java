package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class Bezeroa {

	// EZAUGARRIAK
	private int id;
	private String nan;
	private String izena;
	private String abizena;
	private String telefonoa;
	private String email;
	private String helbidea;
	private String herria;
	private String postakodea;
	private String pasahitza;
	
	private static final String URL = "jdbc:mysql://172.16.242.107:3306/1.erronka";
	private static final String ERABILTZAILEA = "administratzailea";
	private static final String PASAHITZA = "1erronka";

	// SORTZAILEAK(CONSTRUCTORES)
	public Bezeroa() {
	}

	
	public Bezeroa(int id, String nan, String izena, String abizena, String telefonoa, String email, String helbidea,
			String herria, String postakodea, String pasahitza) {
		super();
		this.id = id;
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
		this.telefonoa = telefonoa;
		this.email = email;
		this.helbidea = helbidea;
		this.herria = herria;
		this.postakodea = postakodea;
		this.pasahitza = pasahitza;
	}



	// GETTERS eta SETTERS
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getHelbidea() {
		return helbidea;
	}


	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}


	public String getHerria() {
		return herria;
	}


	public void setHerria(String herria) {
		this.herria = herria;
	}


	public String getPostakodea() {
		return postakodea;
	}


	public void setPostakodea(String postakodea) {
		this.postakodea = postakodea;
	}
	
	public String getPasahitza() {
		return pasahitza;
	}


	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}


	// TO STRING
	
	@Override
	public String toString() {
		return "Bezeroak [id=" + id + ", nan=" + nan + ", izena=" + izena + ", abizena=" + abizena + ", telefonoa="
				+ telefonoa + ", email=" + email + ", helbidea=" + helbidea + ", herria=" + herria + ", postakodea="
				+ postakodea + ", pasahitza=" + pasahitza + "]";
	}


	// HASHCODE eta EQUALS
	

	@Override
	public int hashCode() {
		return Objects.hash(abizena, pasahitza, email, helbidea, herria, id, izena, nan, postakodea, telefonoa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(abizena, other.abizena) && pasahitza == other.pasahitza && Objects.equals(email, other.email)
				&& Objects.equals(helbidea, other.helbidea) && Objects.equals(herria, other.herria) && id == other.id
				&& Objects.equals(izena, other.izena) && Objects.equals(nan, other.nan)
				&& Objects.equals(postakodea, other.postakodea) && Objects.equals(telefonoa, other.telefonoa);
	}


	// METODOAK
	public void bezeroakIkusi() {
		String kontsulta = "SELECT * FROM bezeroak LIMIT ? OFFSET ?";
		int limit = 5;
		int offset = 0;
		boolean jarraitu = true;
		Scanner sc = new Scanner(System.in);

		try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA)) {
			while (jarraitu) {
				try (PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {
					deklarazioa.setInt(1, limit);
					deklarazioa.setInt(2, offset);

					try (ResultSet erantzuna = deklarazioa.executeQuery()) {
						if (!erantzuna.isBeforeFirst()) {
							System.out.println("Ez daude bezero gehiago erakusteko.");
							break;
						}

						while (erantzuna.next()) {
							int id = erantzuna.getInt("id");
							String nan = erantzuna.getString("nanedonif");
							String izena = erantzuna.getString("izena");
							String abizena = erantzuna.getString("abizena");
							String telefonoa = erantzuna.getString("telefonozenbakia");
							String email = erantzuna.getString("postaelektronikoa");
							String helbidea = erantzuna.getString("helbidea");
							String herria = erantzuna.getString("herria");
							String postakodea = erantzuna.getString("postakodea");
							String pasahitza = erantzuna.getString("pasahitza");
							
							
							
							System.out.println("ID: " + id + "| NAN-a: " + nan + "| Izena: " + izena + "| Abizena: "
									+ abizena + "| Telefonoa: " + telefonoa + "| Posta elektronikoa: " + email
									+ "| Helbidea: " + helbidea + "| Herria: " + herria + "| Posta Kodea: " + postakodea + "| Pasahitza: " + pasahitza);
						}
					}
				}

				System.out.print("Hurrengo 5 bezeroak ikusi nahi dituzu?(bai/ez): ");
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
	public void bezeroakEzabatu() {
		
	}


}
