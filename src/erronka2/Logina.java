package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Logina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtErabiltzailea;
	private JPasswordField jpassPasahitza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logina frame = new Logina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Logina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 978, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAtera = new JButton("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Bai", "Ez"}; //Bai edo ez izateko aukerak ematen ditu
				int erantzuna = JOptionPane.showOptionDialog(null, "Programatik atera nahi duzu?", "Konfirmatu atera nahi duzun", JOptionPane.YES_NO_OPTION, //Yes no optionekin, konfirmatzeko edo kantzelatzeko aukerak ematen ditu
						+ JOptionPane.QUESTION_MESSAGE, null, options, options[0]);//optionsetik arrayak hartzen ditu eta horrela euskeraz azaldu dezan
				if(erantzuna == JOptionPane.YES_OPTION) { //Erantzuna baiezkoa bada lehioa ixten du, eta atera egin zarela adierazten du
				dispose();
				JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				}else {}//Ezezkoa esaten badiozu ez du itxiko
			}
		});
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setForeground(Color.WHITE);
		btnAtera.setBackground(new Color(255, 255, 255));
		btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Honen gainean dagoenean eskuan bihurtzen da kursorea(HAND_CURSOR)
		btnAtera.setBounds(946, 0, 32, 32);
		panel.add(btnAtera);
		
		JLabel lblNewLabel = new JLabel("Saioa hasi");
		lblNewLabel.setBackground(new Color(102, 153, 255));
		lblNewLabel.setBounds(375, 105, 222, 60);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Erabiltzailea:");
		lblNewLabel_1.setBounds(102, 196, 192, 35);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pasahitza: ");
		lblNewLabel_2.setBounds(133, 265, 161, 35);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 29));
		panel.add(lblNewLabel_2);
		
		txtErabiltzailea = new JTextField();
		txtErabiltzailea.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));//Honen gainean dagoenean idazteko kursorean bihurtzen da. (TEXT_CURSOR)
		txtErabiltzailea.setBounds(315, 196, 358, 35);
		txtErabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 29));
		panel.add(txtErabiltzailea);
		txtErabiltzailea.setColumns(10);
		
		jpassPasahitza = new JPasswordField();
		jpassPasahitza.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		jpassPasahitza.setBounds(315, 265, 358, 35);
		jpassPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 29));
		panel.add(jpassPasahitza);
		
		JButton btnNewButton = new JButton("Sartu");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(449, 352, 91, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] pasahitza = jpassPasahitza.getPassword();//jpassPasahitzan sartzen den balorea pasahitza arrayan gordetzen da
				String pasahitzaFinala = new String (pasahitza);//pasahitza finalan gordetzen da arraya string baten bihurtuz
				String erabiltzailea =txtErabiltzailea.getText();
				
				LoginaMetodok konprobazioa = new LoginaMetodok();
				
				Langilea langilea2 = new Langilea();
				langilea2.setErabiltzaileIzena(erabiltzailea);
				langilea2.setPasahitza(pasahitzaFinala);
				
				Langilea lan = konprobazioa.lortuErabiltzailea(langilea2);
				
				if(lan!=null) {
		
				//ADMINAREN MENUAN SARTZEKO
				if(erabiltzailea.equals("Admin") && pasahitzaFinala.equals("utopi")) {
					dispose(); //lehioa ixten du
					JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System administratzailearen programara", "SARTU ZARA",
							JOptionPane.INFORMATION_MESSAGE); //Panel bat irekitzen du sartu zarela adierazten
					
					Printzipala p = new Printzipala(); //Printzipala interfaza definitzen du
					p.setVisible(true); // Printzipala interfazan sartzen du, bisiblea eginez
				}//GARRAIOAREN MENUAN SARTZEKO
				else if(txtErabiltzailea.getText().equals("Garraio") && pasahitzaFinala.equals("utopi")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System garraiolarientzako programara", "SARTU ZARA",
							JOptionPane.INFORMATION_MESSAGE);
					
					PrintzipalaGarraioa pg = new PrintzipalaGarraioa();
					pg.setVisible(true); // Garraioen printzipalan sartzen du
				}//GERENTEAREN MENUAN SARTZEKO
				else if(txtErabiltzailea.getText().equals("Gerente") && pasahitzaFinala.equals("utopi")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System gerententzako programara", "SARTU ZARA",
							JOptionPane.INFORMATION_MESSAGE);
					
					PrintzipalaGerentea pgr = new PrintzipalaGerentea();
					pgr.setVisible(true); //Gerentearen printzipalan sartzen du
				}//LANGILEAREN MENUAN SARTZEKO
				else if(txtErabiltzailea.getText().equals("Langile") && pasahitzaFinala.equals("utopi")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System langilearentzako programara", "SARTU ZARA",
							JOptionPane.INFORMATION_MESSAGE);
					
					PrintzipalaLangilea pla = new PrintzipalaLangilea();
					pla.setVisible(true);//Langilearen printzipalan sartzen du, bisiblea eginez.
				
				}else {
					JOptionPane.showMessageDialog(null, "Erabiltzailea edo pasahitza ez dira zuzenak", "ERROREA!",
							JOptionPane.ERROR_MESSAGE);//ERROR_MESSAGE-arekin erabiltzailea edo pasahitza zuzenak ez badira mezu bat bidaltzen du
					txtErabiltzailea.setText("");//Erabiltzailean idatzitakoa borratzeko
					jpassPasahitza.setText("");//Pasahitzan idatzitakoa borratzeko
					txtErabiltzailea.requestFocus();//Erabiltzailearen text arean sartzen da direktamente
				}
			}else {
				JOptionPane.showMessageDialog(null, "Konexioa ez da ondo egin!", "ERROREA!",
						JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JLabel lblFondoa = new JLabel("");
		lblFondoa.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(1).png"));
		lblFondoa.setBounds(-11, -11, 979, 434);
		panel.add(lblFondoa);
	}
}
