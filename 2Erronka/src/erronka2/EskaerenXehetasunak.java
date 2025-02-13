package erronka2;

import java.sql.Timestamp;
import java.util.Objects;

public class EskaerenXehetasunak {

	private int idEskaeraproduktua;
	private String fraZkia;
	private int idProduktua;
	private int kopurua;
	private double prezioa;
	private Timestamp data;
	private int idBezeroa;
	
	
	//KONSTRUKTOREAK
	public EskaerenXehetasunak(int idEskaeraproduktua, String fraZkia, int idProduktua, int kopurua, double prezioa,
			Timestamp data, int idBezeroa) {
		this.idEskaeraproduktua = idEskaeraproduktua;
		this.fraZkia = fraZkia;
		this.idProduktua = idProduktua;
		this.kopurua = kopurua;
		this.prezioa = prezioa;
		this.data = data;
		this.idBezeroa = idBezeroa;
	}

	//GETTERRAK ETA SETTERRAK
	public int getIdEskaeraproduktua() {
		return idEskaeraproduktua;
	}


	public void setIdEskaeraproduktua(int idEskaeraproduktua) {
		this.idEskaeraproduktua = idEskaeraproduktua;
	}


	public String getFraZkia() {
		return fraZkia;
	}


	public void setFraZkia(String fraZkia) {
		this.fraZkia = fraZkia;
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


	public Timestamp getData() {
		return data;
	}


	public void setData(Timestamp data) {
		this.data = data;
	}


	public int getIdBezeroa() {
		return idBezeroa;
	}


	public void setIdBezeroa(int idBezeroa) {
		this.idBezeroa = idBezeroa;
	}

}