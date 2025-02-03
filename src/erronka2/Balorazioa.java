package erronka2;

import java.util.Objects;

public class Balorazioa {
	
	private int idBalorazioa;
	private int idBezeroa;
	private int idProduktua;
	private String balorazioa;
	
	//KONSTRUKTOREAK
	public Balorazioa(int idBalorazioa, int idBezeroa, int idProduktua, String balorazioa) {
		this.idBalorazioa = idBalorazioa;
		this.idBezeroa = idBezeroa;
		this.idProduktua = idProduktua;
		this.balorazioa = balorazioa;
	}

	//GETTERRAK ETA SETTERRAK
	public int getIdBalorazioa() {
		return idBalorazioa;
	}


	public void setIdBalorazioa(int idBalorazioa) {
		this.idBalorazioa = idBalorazioa;
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


	public String getBalorazioa() {
		return balorazioa;
	}


	public void setBalorazioa(String balorazioa) {
		this.balorazioa = balorazioa;
	}

	//HASHCODE ETA EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(idBalorazioa, idBezeroa, idProduktua);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balorazioa other = (Balorazioa) obj;
		return idBalorazioa == other.idBalorazioa && idBezeroa == other.idBezeroa && idProduktua == other.idProduktua;
	}

	//BALORAZIOAK IKUSTEKO ERABILIKO DUGUN METODOA
	public void  balorazioakIkusi() {
		

	}
	
	

}
