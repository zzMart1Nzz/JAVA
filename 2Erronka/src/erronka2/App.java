package erronka2;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import erronka2.Produktua;
import erronka2.Hornitzailea;
import erronka2.Bezeroa;
import erronka2.Langilea;


public class App {

	public static void main(String[] args) {
		//DBKonexioa konexioa = new DBKonexioa();
		//konexioa.konexioaEgin();
		Scanner sc = new Scanner(System.in);
		String erabiltzaileaAdmin = "admin";
		String pasahitzaAdmin = "1234";
		String erabiltzaileaLang = "lang";
		String pasahitzaLang = "5678";
		String erabiltzailea1 = "";
		String pasahitza1 = "";
		int saiakerak = 3;
		while (saiakerak > 0) {
			System.out.print("Mesedez, sartu zure erabiltzailea:");
			erabiltzailea1 = sc.next();
			System.out.print("Mesedez, sartu zure pasahitza:");
			pasahitza1 = sc.next();
			if (erabiltzailea1.equals(erabiltzaileaAdmin) && pasahitza1.equals(pasahitzaAdmin)) {
				System.out.println("Saioa arrakastaz hasi da!");
				break;
			} else if (erabiltzailea1.equals(erabiltzaileaLang) && pasahitza1.equals(pasahitzaLang)) {
				System.out.println("Saioa arrakastaz hasi da!");
				break;
			} else {
				System.out.println("Erabiltzaile izena edo pasahitza okerrak dira.");
			}
			saiakerak--;
		}
		if (saiakerak == 0) {
			System.out.println("Kontua blokeatuta. Saiakera gehiegi");
			return;
		}

		int zerrendaAukera = -1;

		if (erabiltzailea1.equals(erabiltzaileaLang)) {
			do {
				System.out.println("Aukeratu ikusi nahi duzun zerrenda:");
				System.out.print("1. Langileak |");
				System.out.print("2. Produktuak |");
				System.out.print("3. Hornitzaileak |");
				System.out.print("4. Bezeroak |");
				System.out.print("Saioa ixteko sakatu 0.");
				zerrendaAukera = sc.nextInt();

				switch (zerrendaAukera) {
				case 1:
					System.out.println("Ez dituzu aukera honetara sartzeko baimenak.");
					break;
				case 2:
					int akzioa;
					do {
						System.out.println("Zer egin nahi duzu?");
						System.out.print("1. Datuak ikusi |");
						System.out.print("2. Datuak aldatu |");
						System.out.print("3. Datuak sartu |");
						System.out.print("Atzera joateko sakatu 0.");
						akzioa = sc.nextInt();
						

						switch (akzioa) {
						case 1:
							System.out.println("Hemen duzu Produktuen zerrenda:");
							Produktua produktuak = new Produktua();
							produktuak.produktuakIkusi();
							break;
						case 2:
							Produktua produktuak2 = new Produktua();
							produktuak2.produktuakEguneratu();
							break;
						case 3:
							Produktua produktuak3 = new Produktua();
							produktuak3.produktuakSartu();
							break;
						case 0:
							System.out.println("Atzera");
							break;
						default:
							System.out.println("Aukera ez da zuzena");
							break;

						}
					} while (akzioa != 0);

					break;
				case 3:
					System.out.println("Hemen duzu Hornitzaileen zerrenda:");
					Hornitzailea hornitzaileak = new Hornitzailea();
					hornitzaileak.hornitzailearenDatuakIkusi();
					break;
				case 4:
					System.out.println("Hemen duzu Bezeroen zerrenda:");
					Bezeroa bezeroak1 = new Bezeroa();
					bezeroak1.bezeroakIkusi();
					break;
				case 0:
					System.out.println("Saioa itxita.");
					break;
				default:
					System.out.println("Aukera ez da zuzena");
					break;
				}
			} while (zerrendaAukera != 0);

		} else {
			do {
				System.out.println("Aukeratu ikusi nahi duzun zerrenda:");
				System.out.print("1. Langileak |");
				System.out.print("2. Produktuak |");
				System.out.print("3. Hornitzaileak |");
				System.out.print("4. Bezeroak |");
				System.out.println("Saioa ixteko sakatu 0.");
				zerrendaAukera = sc.nextInt();

				switch (zerrendaAukera) {
				case 1:
					System.out.println("Hemen duzu Langileen zerrenda:");
					Langilea langileak = new Langilea();
					langileak.langilearenDatuakIkusi();
					break;
				case 2:
					int akzioa;
					do {
						System.out.println("Zer egin nahi duzu?");
						System.out.print("1. Datuak ikusi |");
						System.out.print("2. Datuak aldatu |");
						System.out.print("3. Datuak sartu |");
						System.out.print("4. Datuak ezabatu |");
						System.out.print("Atzera joateko sakatu 0.");
						akzioa = sc.nextInt();

						switch (akzioa) {
						case 1:
							System.out.println("Hemen duzu Produktuen zerrenda:");
							Produktua2 produktuak = new Produktua2();
							produktuak.produktuakIkusi();
							break;
						case 2:
							Produktua produktuak2 = new Produktua();
							produktuak2.produktuakEguneratu();
							break;
						case 3:
							Produktua produktuak3 = new Produktua();
							produktuak3.produktuakSartu();
							break;
						case 4:
							Produktua produktuak4 = new Produktua();
							produktuak4.produktuakEzabatu();
							break;
						case 0:
							System.out.println("Atzera");
							break;
						default:
							System.out.println("Aukera ez da zuzena");
							break;

						}
					} while (akzioa != 0);
					break;
				case 3:
					System.out.println("Hemen duzu Hornitzaileen zerrenda:");
					Hornitzailea hornitzaileak = new Hornitzailea();
					hornitzaileak.hornitzailearenDatuakIkusi();
					break;
				case 4:
					System.out.println("Hemen duzu Bezeroen zerrenda:");
					Bezeroa bezeroak1 = new Bezeroa();
					bezeroak1.bezeroakIkusi();
					break;
				case 0:
					System.out.println("Saioa itxita.");
					break;
				default:
					System.out.println("Aukera ez da zuzena");
					break;
				}
			} while (zerrendaAukera != 0);
		}sc.close();
	}
		
	}