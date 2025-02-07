package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class Bezeroa {

	// EZAUGARRIAK
	private int idBezeroa;
	private String nanEdoNif;
	private String izena;
	private String abizena;
	private String telefonoZenbakia;
	private String postaElektronikoa;
	private String helbidea;
	private String herria;
	private String postakodea;
	private String pasahitza;
	
	
	//KONSTRUKTOREAK
	public Bezeroa(int idBezeroa, String nanEdoNif, String izena, String abizena, String telefonoZenbakia,
			String postaElektronikoa, String helbidea, String herria, String postakodea, String pasahitza) {
		this.idBezeroa = idBezeroa;
		this.nanEdoNif = nanEdoNif;
		this.izena = izena;
		this.abizena = abizena;
		this.telefonoZenbakia = telefonoZenbakia;
		this.postaElektronikoa = postaElektronikoa;
		this.helbidea = helbidea;
		this.herria = herria;
		this.postakodea = postakodea;
		this.pasahitza = pasahitza;
	}

	
	
	//GETTERRAK ETA SETTERRAK
	public int getIdBezeroa() {
		return idBezeroa;
	}


	public void setIdBezeroa(int idBezeroa) {
		this.idBezeroa = idBezeroa;
	}


	public String getNanEdoNif() {
		return nanEdoNif;
	}


	public void setNanEdoNif(String nanEdoNif) {
		this.nanEdoNif = nanEdoNif;
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


	public String getHelbidea() {
		return helbidea;
	}


	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}


	public String getHerria() {
		return herria;
	}


	public void setHerria(String herria) {
		this.herria = herria;
	}


	public String getPostakodea() {
		return postakodea;
	}


	public void setPostakodea(String postakodea) {
		this.postakodea = postakodea;
	}


	public String getPasahitza() {
		return pasahitza;
	}


	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	

}