package erronka2;

import java.util.Objects;

public class Pieza {
	
	private int idPieza;
	private int kategoria;
	private String marka;
	private String modeloa;
	private String ezaugarriak;
	private double erosketaPrezioa;
	private int stock;
	
	public Pieza() {
	}

	public Pieza(int idPieza, int kategoria, String marka, String modeloa, String ezaugarriak, double erosketaPrezioa,
			int stock) {
		this.idPieza = idPieza;
		this.kategoria = kategoria;
		this.marka = marka;
		this.modeloa = modeloa;
		this.ezaugarriak = ezaugarriak;
		this.erosketaPrezioa = erosketaPrezioa;
		this.stock = stock;
	}

	public int getIdPieza() {
		return idPieza;
	}

	public void setIdPieza(int idPieza) {
		this.idPieza = idPieza;
	}

	public int getKategoria() {
		return kategoria;
	}

	public void setKategoria(int kategoria) {
		this.kategoria = kategoria;
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

	public double getErosketaPrezioa() {
		return erosketaPrezioa;
	}

	public void setErosketaPrezioa(double erosketaPrezioa) {
		this.erosketaPrezioa = erosketaPrezioa;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}