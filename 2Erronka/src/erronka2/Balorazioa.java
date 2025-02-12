package erronka2;

import java.sql.Timestamp;

public class Balorazioa {

	private int idBalorazioa;
	private int Bezeroa_idBezeroa;
	private int Produktua_idProduktua;
	private String balorazioa;
	private Timestamp data;

	//KONSTRUKTOREAK
	public Balorazioa(int idBalorazioa, int bezeroa_idBezeroa, int produktua_idProduktua, String balorazioa,
			Timestamp data) {
		this.idBalorazioa = idBalorazioa;
		this.Bezeroa_idBezeroa = bezeroa_idBezeroa;
		this.Produktua_idProduktua = produktua_idProduktua;
		this.balorazioa = balorazioa;
		this.data = data;
	}

	//GETTERRAK ETA SETTERRAK
	public int getIdBalorazioa() {
		return idBalorazioa;
	}


	public void setIdBalorazioa(int idBalorazioa) {
		this.idBalorazioa = idBalorazioa;
	}


	public int getBezeroa_idBezeroa() {
		return Bezeroa_idBezeroa;
	}


	public void setBezeroa_idBezeroa(int bezeroa_idBezeroa) {
		Bezeroa_idBezeroa = bezeroa_idBezeroa;
	}


	public int getProduktua_idProduktua() {
		return Produktua_idProduktua;
	}


	public void setProduktua_idProduktua(int produktua_idProduktua) {
		Produktua_idProduktua = produktua_idProduktua;
	}


	public String getBalorazioa() {
		return balorazioa;
	}


	public void setBalorazioa(String balorazioa) {
		this.balorazioa = balorazioa;
	}


	public Timestamp getData() {
		return data;
	}


	public void setData(Timestamp data) {
		this.data = data;
	}

}
