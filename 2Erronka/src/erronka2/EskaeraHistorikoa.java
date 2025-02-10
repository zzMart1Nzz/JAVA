package erronka2;

import java.util.Objects;

public class EskaeraHistorikoa {
	
	private int idEskaeraHistorikoa;
	private int idBezeroa;
	private int idProduktua;
	private int kopurua;
	private double prezioa;
	private String egoera;
	
	//KONSTRUKTOREAK
	public EskaeraHistorikoa(int idEskaeraHistorikoa, int idBezeroa, int idProduktua, int kopurua, double prezioa,
			String egoera) {
		this.idEskaeraHistorikoa = idEskaeraHistorikoa;
		this.idBezeroa = idBezeroa;
		this.idProduktua = idProduktua;
		this.kopurua = kopurua;
		this.prezioa = prezioa;
		this.egoera = egoera;
	}

	
	//GETTERRAK ETA SETTERRAK
	public int getIdEskaeraHistorikoa() {
		return idEskaeraHistorikoa;
	}

	public void setIdEskaeraHistorikoa(int idEskaeraHistorikoa) {
		this.idEskaeraHistorikoa = idEskaeraHistorikoa;
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
		return Objects.hash(idBezeroa, idEskaeraHistorikoa, idProduktua, kopurua, prezioa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EskaeraHistorikoa other = (EskaeraHistorikoa) obj;
		return idBezeroa == other.idBezeroa && idEskaeraHistorikoa == other.idEskaeraHistorikoa
				&& idProduktua == other.idProduktua && kopurua == other.kopurua
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	
	//ESKAEREN HISTORIKOA IKUSTEKO
	public void eskaeraHistorikoaIkusi() {
		
	}
	
	
	
	

}
