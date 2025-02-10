package eragiketak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sartuLangileak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_lanpostua;
	private JTextField txt_nan;
	private JTextField txt_izena;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_abizena;
	private JLabel lblNewLabel_2_1_4;
	private JTextField txt_telefonoa;
	private JTextField txt_email;
	private JButton btn_sartu;
	private JLabel lblNewLabel_2_1_5;
	private JTextField txt_erabiltzailea;
	private JTextField txt_pasahitza;
	private JLabel lblNewLabel_2_1_6;
	private JTextField txt_helbidea;
	private JTextField txt_postaKodea;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_1_4_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aldaketaHornitzaileak frame = new aldaketaHornitzaileak();
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
	public sartuLangileak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_lanpostua = new JTextField();
		txt_lanpostua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_lanpostua.setColumns(10);
		txt_lanpostua.setBounds(80, 84, 106, 20);
		contentPane.add(txt_lanpostua);
		
		JLabel lblNewLabel_2_1 = new JLabel("Lanpostua:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(80, 62, 78, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txt_nan = new JTextField();
		txt_nan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_nan.setColumns(10);
		txt_nan.setBounds(267, 84, 106, 20);
		contentPane.add(txt_nan);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("NAN:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(267, 62, 44, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		txt_izena = new JTextField();
		txt_izena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_izena.setColumns(10);
		txt_izena.setBounds(435, 84, 106, 20);
		contentPane.add(txt_izena);
		
		lblNewLabel_2_1_2 = new JLabel("Izena:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(435, 62, 71, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		lblNewLabel_2_1_3 = new JLabel("Abizena:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(608, 62, 71, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		txt_abizena = new JTextField();
		txt_abizena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_abizena.setColumns(10);
		txt_abizena.setBounds(608, 84, 106, 20);
		contentPane.add(txt_abizena);
		
		lblNewLabel_2_1_4 = new JLabel("Telefonoa:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(788, 62, 91, 14);
		contentPane.add(lblNewLabel_2_1_4);
		
		txt_telefonoa = new JTextField();
		txt_telefonoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_telefonoa.setColumns(10);
		txt_telefonoa.setBounds(788, 84, 106, 20);
		contentPane.add(txt_telefonoa);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("Email:");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(80, 157, 106, 14);
		contentPane.add(lblNewLabel_2_1_4_1);
		
		txt_email = new JTextField();
		txt_email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_email.setColumns(10);
		txt_email.setBounds(80, 182, 106, 20);
		contentPane.add(txt_email);
		
		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\atzera 2(2).png"));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);
		
		btn_sartu = new JButton("SARTU");
		btn_sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_sartu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sartu.setBounds(803, 324, 91, 23);
		contentPane.add(btn_sartu);
		
		lblNewLabel_2_1_5 = new JLabel("Erabiltzailea:");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_5.setBounds(267, 157, 106, 14);
		contentPane.add(lblNewLabel_2_1_5);
		
		txt_erabiltzailea = new JTextField();
		txt_erabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_erabiltzailea.setColumns(10);
		txt_erabiltzailea.setBounds(267, 182, 106, 20);
		contentPane.add(txt_erabiltzailea);
		
		txt_pasahitza = new JTextField();
		txt_pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_pasahitza.setColumns(10);
		txt_pasahitza.setBounds(435, 182, 106, 20);
		contentPane.add(txt_pasahitza);
		
		lblNewLabel_2_1_6 = new JLabel("Pasahitza:");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_6.setBounds(435, 157, 106, 14);
		contentPane.add(lblNewLabel_2_1_6);
		
		txt_helbidea = new JTextField();
		txt_helbidea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_helbidea.setColumns(10);
		txt_helbidea.setBounds(608, 182, 106, 20);
		contentPane.add(txt_helbidea);
		
		txt_postaKodea = new JTextField();
		txt_postaKodea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_postaKodea.setColumns(10);
		txt_postaKodea.setBounds(788, 182, 106, 20);
		contentPane.add(txt_postaKodea);
		
		lblNewLabel_3 = new JLabel("Posta Kodea:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(788, 156, 106, 17);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2_1_4_2 = new JLabel("Helbidea:");
		lblNewLabel_2_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_2.setBounds(608, 157, 91, 14);
		contentPane.add(lblNewLabel_2_1_4_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}
}
