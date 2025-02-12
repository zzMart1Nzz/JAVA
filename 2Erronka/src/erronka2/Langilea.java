package erronka2;

public class Langilea {

	// EZAUGARRIAK
	private int idlangilea;
	private int lanpostua_idlanpostua;
	private String lanpostua;
	private String nan;
	private String izena;
	private String abizena;
	private String telefonoZenbakia;
	private String postaElektronikoa;
	private String erabiltzaileIzena;
	private String pasahitza;
	private String helbidea;
	private String postaKodea;

	//KONSTRUKTOREAK
	public Langilea(int idlangilea, int lanpostua_idlanpostua, String lanpostua, String nan, String izena,
			String abizena, String telefonoZenbakia, String postaElektronikoa, String erabiltzaileIzena,
			String pasahitza, String helbidea, String postaKodea) {
		this.idlangilea = idlangilea;
		this.lanpostua_idlanpostua = lanpostua_idlanpostua;
		this.lanpostua = lanpostua;
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
		this.telefonoZenbakia = telefonoZenbakia;
		this.postaElektronikoa = postaElektronikoa;
		this.erabiltzaileIzena = erabiltzaileIzena;
		this.pasahitza = pasahitza;
		this.helbidea = helbidea;
		this.postaKodea = postaKodea;
	}

	public Langilea() {
		// TODO Auto-generated constructor stub
	}

	public int getIdlangilea() {
		return idlangilea;
	}

	public void setIdlangilea(int idlangilea) {
		this.idlangilea = idlangilea;
	}

	public int getLanpostua_idlanpostua() {
		return lanpostua_idlanpostua;
	}

	public void setLanpostua_idlanpostua(int lanpostua_idlanpostua) {
		this.lanpostua_idlanpostua = lanpostua_idlanpostua;
	}

	public String getLanpostua() {
		return lanpostua;
	}

	public void setLanpostua(String lanpostua) {
		this.lanpostua = lanpostua;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getTelefonoZenbakia() {
		return telefonoZenbakia;
	}

	public void setTelefonoZenbakia(String telefonoZenbakia) {
		this.telefonoZenbakia = telefonoZenbakia;
	}

	public String getPostaElektronikoa() {
		return postaElektronikoa;
	}

	public void setPostaElektronikoa(String postaElektronikoa) {
		this.postaElektronikoa = postaElektronikoa;
	}

	public String getErabiltzaileIzena() {
		return erabiltzaileIzena;
	}

	public void setErabiltzaileIzena(String erabiltzaileIzena) {
		this.erabiltzaileIzena = erabiltzaileIzena;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public String getPostaKodea() {
		return postaKodea;
	}

	public void setPostaKodea(String postaKodea) {
		this.postaKodea = postaKodea;
	}


}