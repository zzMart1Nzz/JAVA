package erronka2;

import java.util.Objects;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produktua {

	// EZAUGARRIAK
	private int id;
	private int idmota;
	private String marka;
	private String modeloa;
	private String ezaugarriak;
	private String kolorea;
	private double salmentaPrezioa;
	private int stock;

	// Datu basearekin konektatzeko datuak
	private static final String URL = "jdbc:mysql://172.16.242.107:3306/1.erronka";
	private static final String ERABILTZAILEA = "administratzailea";
	private static final String PASAHITZA = "1erronka";

	// SORTZAILEAK(CONSTRUCTORES)
	public Produktua() {
	}

	public Produktua(int id, int idmota, String marka, String modeloa, String ezaugarriak, double salmentaPrezioa, int stock) {
		super();
		this.id = id;
		this.idmota = idmota;
		this.marka = marka;
		this.modeloa = modeloa;
		this.ezaugarriak = ezaugarriak;
		this.salmentaPrezioa = salmentaPrezioa;
		this.stock = stock;
	}

	// GETTERS eta SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getidMota() {
		return idmota;
	}

	public void setMota(int idmota) {
		this.idmota = idmota;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModeloa() {
		return modeloa;
	}

	public void setModeloa(String modeloa) {
		this.modeloa = modeloa;
	}

	public String getEzaugarriak() {
		return ezaugarriak;
	}

	public void setEzaugarriak(String ezaugarriak) {
		this.ezaugarriak = ezaugarriak;
	}

	public double getSalmentaPrezioa() {
		return salmentaPrezioa;
	}

	public void setSalmentaPrezioa(double salmentaPrezioa) {
		this.salmentaPrezioa = salmentaPrezioa;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Produktuak [id=" + id + ", mota=" + idmota + ", marka=" + marka + ", modeloa=" + modeloa + ", ezaugarriak="
				+ ezaugarriak + ", salmentaPrezioa="+ salmentaPrezioa + ", stock=" + stock + "]";
	}

	// HASHCODE eta EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(ezaugarriak, id, idmota, kolorea, marka, modeloa, salmentaPrezioa, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produktua other = (Produktua) obj;
		return Objects.equals(ezaugarriak, other.ezaugarriak) && id == other.id && idmota == other.idmota
				&& Objects.equals(kolorea, other.kolorea) && Objects.equals(marka, other.marka)
				&& Objects.equals(modeloa, other.modeloa)
				&& Double.doubleToLongBits(salmentaPrezioa) == Double.doubleToLongBits(other.salmentaPrezioa)
				&& stock == other.stock;
	}

	

	// METODOAK
	// Imprimitu metodoa, produktuen datu guztiak ematen dituena.
	public void inprimitu() {
		System.out.println("Hau da produktuaren informazioa: \n id kodea: " + id + "\n Mota: " + idmota + "\n Marka: "
				+ marka + "\n Modeloa: " + modeloa + "\n Salmenta prezioa: " + salmentaPrezioa + "\n Stock-a: " + stock);
	}

	
	public void produktuakIkusi() {
		String kontsulta = "SELECT * FROM produktuak LIMIT ? OFFSET ?";
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
							System.out.println("Ez daude produktu gehiago erakusteko.");
							break;
						}

						while (erantzuna.next()) {
							int id = erantzuna.getInt("id");
							int idmota = erantzuna.getInt("idmota");
							String marka = erantzuna.getString("marka");
							String modeloa = erantzuna.getString("modeloa");
							//String ezaugarriak = erantzuna.getString("ezaugarriak");
							double salmentaPrezioa = erantzuna.getDouble("salmentaPrezioa");
							int stocka = erantzuna.getInt("stocka");

							System.out.println("ID: " + id + "| Mota: " + idmota + "| Marka: " + marka + "| Modeloa: "
									+ modeloa + "| Ezaugarriak: " + ezaugarriak + "| Salmenta Prezioa: " + salmentaPrezioa + 
									"| Stocka: " + stocka);
						}
					}
				}

				System.out.print("Hurrengo 5 produktuak ikusi nahi dituzu?(bai/ez): ");
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

	public void produktuakSartu() {
		String kontsulta = "INSERT INTO produktuak (mota, marka, modeloa, memoria, prozesagailua, tamaina, sistemaEragilea, kamara, resoluzioa, frekuentzia, kolorea, erosketaPrezioa, salmentaPrezioa, stocka) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Scanner scanner = new Scanner(System.in);

		try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);
				PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {

			// Solicitar datos del usuario
			System.out.print("Sartu produktuaren mota: ");
			int idmota = scanner.nextInt();

			System.out.print("Sartu produktuaren marka: ");
			String marka = scanner.nextLine();

			System.out.print("Sartu produktuaren modeloa: ");
			String modeloa = scanner.nextLine();
			
			System.out.print("Sartu produktuaren ezaugarriak: ");
			String ezaugarriak = scanner.nextLine();

			System.out.print("Sartu produktuaren salmenta prezioa: ");
			double salmentaPrezioa = scanner.nextDouble();

			System.out.print("Zenbat unitate dituzu?: ");
			int stock = scanner.nextInt();

			// Configurar los parámetros en la consulta
			deklarazioa.setInt(1, idmota);
			deklarazioa.setString(2, marka);
			deklarazioa.setString(3, modeloa);
			deklarazioa.setString(4, ezaugarriak);
			deklarazioa.setDouble(5, salmentaPrezioa);
			deklarazioa.setInt(6, stock);

			// Ejecuta la inserción
			int lerroak = deklarazioa.executeUpdate();
			System.out.println("Ongi sartu dituzu datuak. Sartutako lerroak: " + lerroak);
		} catch (SQLException e) {
			System.out.println("Zerbaitek ez du funtzionatu.");
		}
	}

public void produktuakEguneratu() {
	String kontsulta = "UPDATE produktuak SET mota=?, marka=?, modeloa=?, ezaugarriak=?, salmentaPrezioa=?, stocka=? WHERE id=?";
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Sartu aldatu nahi duzun produktuaren id-a:");
	int id= scanner.nextInt();
	scanner.nextLine();

	try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);
			PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {

		// Solicitar datos del usuario
			
		System.out.print("Sartu produktuaren mota: ");
		int idmota = scanner.nextInt();

		System.out.print("Sartu produktuaren marka: ");
		String marka = scanner.nextLine();

		System.out.print("Sartu produktuaren modeloa: ");
		String modeloa = scanner.nextLine();
		
		System.out.print("Sartu produktuaren ezaugarriak: ");
		String ezaugarriak = scanner.nextLine();

		System.out.print("Sartu produktuaren salmenta prezioa: ");
		double salmentaPrezioa = scanner.nextDouble();

		System.out.print("Stocka dago? (true/false): ");
		int stock = scanner.nextInt();

		// Configurar los parámetros en la consulta
		deklarazioa.setInt(1, idmota);
		deklarazioa.setString(2, marka);
		deklarazioa.setString(3, modeloa);
		deklarazioa.setString(4, ezaugarriak);
		deklarazioa.setDouble(5, salmentaPrezioa);
		deklarazioa.setInt(6, stock);
		deklarazioa.setInt(7, id);

		// Ejecuta la inserción
		int lerroak = deklarazioa.executeUpdate();
		System.out.println("Ongi sartu dituzu datuak. Sartutako lerroak: " + lerroak);
	} catch (SQLException e) {
		System.out.println("Zerbaitek ez du funtzionatu.");
	}
}

public void produktuakEzabatu() {
	String kontsulta = "DELETE FROM produktuak WHERE id=?";
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Sartu ezabatu nahi duzun produktuaren id-a:");
	int id= scanner.nextInt();
	scanner.nextLine();

	try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);
			PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {

		// Solicitar datos del usuario
			
		
		deklarazioa.setInt(1, id);

		// Ejecuta la inserción
		int lerroak = deklarazioa.executeUpdate();
		System.out.println("Ongi ezabatu dira datuak. Ezabatutako lerroak: " + lerroak);
	} catch (SQLException e) {
		System.out.println("Zerbaitek ez du funtzionatu.");
	}
}
}
