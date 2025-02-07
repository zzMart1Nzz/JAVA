package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class Hornitzailea {

	// EZAUGARRIAK
	private int idHornitzailea;
	private String nif;
	private String izena;
	private String telefonoZenbakia;
	private String postaElektronikoa;
	private String helbidea;
	private String herria;
	private String postakodea;
	
	
	//KONSTRUKOTREA
	public Hornitzailea(int idHornitzailea, String nif, String izena, String telefonoZenbakia, String postaElektronikoa,
			String helbidea, String herria, String postakodea) {
		this.idHornitzailea = idHornitzailea;
		this.nif = nif;
		this.izena = izena;
		this.telefonoZenbakia = telefonoZenbakia;
		this.postaElektronikoa = postaElektronikoa;
		this.helbidea = helbidea;
		this.herria = herria;
		this.postakodea = postakodea;
	}


	public int getIdHornitzailea() {
		return idHornitzailea;
	}


	public void setIdHornitzailea(int idHornitzailea) {
		this.idHornitzailea = idHornitzailea;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getIzena() {
		return izena;
	}


	public void setIzena(String izena) {
		this.izena = izena;
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
	
	
	
	
	

}