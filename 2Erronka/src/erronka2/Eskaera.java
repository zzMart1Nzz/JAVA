package erronka2;

import java.sql.Timestamp;

public class Eskaera {

	private int idEskaera;
	private String fraZkia;
	private int Bezeroa_idBezeroa;
	private double totala;
	private String egoera;
	private Timestamp data;
	private String faktura;

	//KONSTRUKTOREAK
	public Eskaera(int idEskaera, String fraZkia, int bezeroa_idBezeroa, double totala, String egoera, Timestamp data,
			String faktura) {
		this.idEskaera = idEskaera;
		this.fraZkia = fraZkia;
		this.Bezeroa_idBezeroa = bezeroa_idBezeroa;
		this.totala = totala;
		this.egoera = egoera;
		this.data = data;
		this.faktura = faktura;
	}


	//GETTERRAK ETA SETTERRAK
	public int getIdEskaera() {
		return idEskaera;
	}

	public void setIdEskaera(int idEskaera) {
		this.idEskaera = idEskaera;
	}

	public String getFraZkia() {
		return fraZkia;
	}

	public void setFraZkia(String fraZkia) {
		this.fraZkia = fraZkia;
	}

	public int getBezeroa_idBezeroa() {
		return Bezeroa_idBezeroa;
	}

	public void setBezeroa_idBezeroa(int bezeroa_idBezeroa) {
		Bezeroa_idBezeroa = bezeroa_idBezeroa;
	}

	public double getTotala() {
		return totala;
	}

	public void setTotala(double totala) {
		this.totala = totala;
	}

	public String getEgoera() {
		return egoera;
	}

	public void setEgoera(String egoera) {
		this.egoera = egoera;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public String getFaktura() {
		return faktura;
	}

	public void setFaktura(String faktura) {
		this.faktura = faktura;
	}




}
