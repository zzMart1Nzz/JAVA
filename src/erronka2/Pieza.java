package erronka2;

import java.util.Objects;

public class Pieza {
	
	private int id;
	private int kategoria;
	private String marka;
	private String modeloa;
	private String ezaugarriak;
	private double erosketaPrezioa;
	private boolean stocka;
	
	public Pieza() {
	}

	public Pieza(int id, int kategoria, String marka, String modeloa, String ezaugarriak, double erosketaPrezioa,
			boolean stocka) {
		super();
		this.id = id;
		this.kategoria = kategoria;
		this.marka = marka;
		this.modeloa = modeloa;
		this.ezaugarriak = ezaugarriak;
		this.erosketaPrezioa = erosketaPrezioa;
		this.stocka = stocka;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isStocka() {
		return stocka;
	}

	public void setStocka(boolean stocka) {
		this.stocka = stocka;
	}

	@Override
	public int hashCode() {
		return Objects.hash(erosketaPrezioa, ezaugarriak, id, kategoria, marka, modeloa, stocka);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pieza other = (Pieza) obj;
		return Double.doubleToLongBits(erosketaPrezioa) == Double.doubleToLongBits(other.erosketaPrezioa)
				&& Objects.equals(ezaugarriak, other.ezaugarriak) && id == other.id && kategoria == other.kategoria
				&& Objects.equals(marka, other.marka) && Objects.equals(modeloa, other.modeloa)
				&& stocka == other.stocka;
	}

	@Override
	public String toString() {
		return "Pieza [id=" + id + ", kategoria=" + kategoria + ", marka=" + marka + ", modeloa=" + modeloa
				+ ", ezaugarriak=" + ezaugarriak + ", erosketaPrezioa=" + erosketaPrezioa + ", stocka=" + stocka + "]";
	}
	
	public void piezakIkusi() {
		
	}
	
	public void piezakSartu() {
		
	}
	
	public void piezakEguneratu() {
		
	}
	
	public void piezakEzabatu() {
		
	}
	
}