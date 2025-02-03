package erronka2;

import java.util.Objects;

public class PiezaEskaera {

		private int idpiezaeskaera;
		private int idhornitzailea;
		private int idPieza;
		private int kopurua;
		
		public PiezaEskaera() {
			super();
		}

		public PiezaEskaera(int idpiezaeskaera, int idhornitzailea, int idPieza, int kopurua) {
			super();
			this.idpiezaeskaera = idpiezaeskaera;
			this.idhornitzailea = idhornitzailea;
			this.idPieza = idPieza;
			this.kopurua = kopurua;
		}

		public int getIdpiezaeskaera() {
			return idpiezaeskaera;
		}

		public void setIdpiezaeskaera(int idpiezaeskaera) {
			this.idpiezaeskaera = idpiezaeskaera;
		}

		public int getIdhornitzailea() {
			return idhornitzailea;
		}

		public void setIdhornitzailea(int idhornitzailea) {
			this.idhornitzailea = idhornitzailea;
		}

		public int getIdPieza() {
			return idPieza;
		}

		public void setIdPieza(int idPieza) {
			this.idPieza = idPieza;
		}

		public int getKopurua() {
			return kopurua;
		}

		public void setKopurua(int kopurua) {
			this.kopurua = kopurua;
		}

		@Override
		public String toString() {
			return "PiezaEskaera [idpiezaeskaera=" + idpiezaeskaera + ", idhornitzailea=" + idhornitzailea
					+ ", idPieza=" + idPieza + ", kopurua=" + kopurua + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(idPieza, idhornitzailea, idpiezaeskaera, kopurua);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PiezaEskaera other = (PiezaEskaera) obj;
			return idPieza == other.idPieza && idhornitzailea == other.idhornitzailea
					&& idpiezaeskaera == other.idpiezaeskaera && kopurua == other.kopurua;
		}
		
		public void piezaEskaerakkIkusi() {
			
		}
		
		public void piezaEskaerakSartu() {
			
		}
		
		public void piezaEskaerakEguneratu() {
			
		}
		
		public void piezaEskaerakEzabatu() {
			
		}
		
}
