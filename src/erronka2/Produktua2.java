package erronka2;

import java.util.Objects;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Produktua2 {

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
	public Produktua2() {
	}

	public Produktua2(int id, int idmota, String marka, String modeloa, String ezaugarriak, double salmentaPrezioa, int stock) {
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
		Produktua2 other = (Produktua2) obj;
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
		String query = "SELECT * FROM Produktua";
		try(Connection con = DBKonexioa.konexioaEgin();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);){
			while(rs.next()) {
				int id = rs.getInt("idProduktua");
				int idmota = rs.getInt("ProduktuMota_idProduktuMota");
				String marka = rs.getString("marka");
				String modeloa = rs.getString("modeloa");
				String ezaugarriak = rs.getString("ezaugarriak");
				double salmentaPrezioa = rs.getDouble("salmentaPrezioa");
				int stock = rs.getInt("stock");
				System.out.println("id: "+ id +"| idmota: "+ idmota +"| marka: "+ marka +"| modeloa: "+ modeloa +"| ezaugarriak: "+ ezaugarriak+"| salmentaPrezioa: "+ salmentaPrezioa +"| Stock-a: "+ stock +".");
						}
		}catch (SQLException e) {
            System.out.println("Error al obtener usuarios");
            e.printStackTrace();
     
        }
	}
}
	
