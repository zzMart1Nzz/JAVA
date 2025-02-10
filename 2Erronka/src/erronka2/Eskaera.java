package erronka2;

import java.util.Objects;

public class Eskaera {

	private int idEskaera;
	private int idBezeroa;
	private int idProduktua;
	private int kopurua;
	private double prezioa;
	private String egoera;
	
	//KONSTRUKTOREAK
	public Eskaera(int idEskaera, int idBezeroa, int idProduktua, int kopurua, double prezioa, String egoera) {
		this.idEskaera = idEskaera;
		this.idBezeroa = idBezeroa;
		this.idProduktua = idProduktua;
		this.kopurua = kopurua;
		this.prezioa = prezioa;
		this.egoera = egoera;
	}
	
	//GETTERRAK ETA SETTERRAK
	public int getIdEskaera() {
		return idEskaera;
	}

	public void setIdEskaera(int idEskaera) {
		this.idEskaera = idEskaera;
	}

	public int getIdBezeroa() {
		return idBezeroa;
	}

	public void setIdBezeroa(int idBezeroa) {
		this.idBezeroa = idBezeroa;
	}

	public int getIdProduktua() {
		return idProduktua;
	}

	public void setIdProduktua(int idProduktua) {
		this.idProduktua = idProduktua;
	}

	public int getKopurua() {
		return kopurua;
	}

	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	public String getEgoera() {
		return egoera;
	}

	public void setEgoera(String egoera) {
		this.egoera = egoera;
	}
	
	//HASHCODE ETA EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(idBezeroa, idEskaera, idProduktua, kopurua, prezioa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eskaera other = (Eskaera) obj;
		return idBezeroa == other.idBezeroa && idEskaera == other.idEskaera && idProduktua == other.idProduktua
				&& kopurua == other.kopurua
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	
	//ESKAERA GUZTIAK IKUSTEKO
	public void eskaerakIkusi() {
		
		} 
	
	//ESKAEREI UPDATE EGITEKO
	public void eskaeraEguneratu() {
		
	}
	
	//ESKAERAK EZABATZEKO
	public void eskaeraEzabatu() {
		
	}
}
