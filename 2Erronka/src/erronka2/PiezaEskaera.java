package erronka2;

import java.sql.Timestamp;
import java.util.Objects;

public class PiezaEskaera {

		private int idPiezaEskaera;
		private int Hornitzaile_idHornitzailea;
		private int Pieza_idPieza;
		private int kopurua;
		private Timestamp data;
		
		public PiezaEskaera() {
			
		}
		
		//KONSTRUKTOREAK
		public PiezaEskaera(int idPiezaEskaera, int hornitzaile_idHornitzailea, int pieza_idPieza, int kopurua,
				Timestamp data) {
			this.idPiezaEskaera = idPiezaEskaera;
			this.Hornitzaile_idHornitzailea = hornitzaile_idHornitzailea;
			this.Pieza_idPieza = pieza_idPieza;
			this.kopurua = kopurua;
			this.data = data;
		}
		
		
		//GETTERRAK ETA SETTERRAK
		public int getIdPiezaEskaera() {
			return idPiezaEskaera;
		}


		public void setIdPiezaEskaera(int idPiezaEskaera) {
			this.idPiezaEskaera = idPiezaEskaera;
		}


		public int getHornitzaile_idHornitzailea() {
			return Hornitzaile_idHornitzailea;
		}


		public void setHornitzaile_idHornitzailea(int hornitzaile_idHornitzailea) {
			Hornitzaile_idHornitzailea = hornitzaile_idHornitzailea;
		}


		public int getPieza_idPieza() {
			return Pieza_idPieza;
		}


		public void setPieza_idPieza(int pieza_idPieza) {
			Pieza_idPieza = pieza_idPieza;
		}


		public int getKopurua() {
			return kopurua;
		}


		public void setKopurua(int kopurua) {
			this.kopurua = kopurua;
		}


		public Timestamp getData() {
			return data;
		}


		public void setData(Timestamp data) {
			this.data = data;
		}

		public static PiezaEskaera get(int rowIndex) {
		
			return null;
		}


	
		
		
		
	
}