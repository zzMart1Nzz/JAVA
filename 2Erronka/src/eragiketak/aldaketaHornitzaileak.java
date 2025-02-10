package eragiketak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aldaketaHornitzaileak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nif;
	private JTextField txt_izena;
	private JTextField txt_telefonoa;
	private JTextField txt_email;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_helbidea;
	private JLabel lblNewLabel_2_1_4;
	private JTextField txt_herria;
	private JTextField txt_postaKodea;
	private JButton btn_aldatu;

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
	public aldaketaHornitzaileak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_nif = new JTextField();
		txt_nif.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_nif.setColumns(10);
		txt_nif.setBounds(146, 87, 106, 20);
		contentPane.add(txt_nif);
		
		JLabel lblNewLabel_2 = new JLabel("NIF:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(146, 69, 50, 17);
		contentPane.add(lblNewLabel_2);
		
		txt_izena = new JTextField();
		txt_izena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_izena.setColumns(10);
		txt_izena.setBounds(337, 87, 106, 20);
		contentPane.add(txt_izena);
		
		JLabel lblNewLabel_2_1 = new JLabel("Izena:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(337, 70, 65, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txt_telefonoa = new JTextField();
		txt_telefonoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_telefonoa.setColumns(10);
		txt_telefonoa.setBounds(529, 87, 106, 20);
		contentPane.add(txt_telefonoa);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Telefonoa:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(529, 70, 91, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		txt_email = new JTextField();
		txt_email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_email.setColumns(10);
		txt_email.setBounds(741, 87, 106, 20);
		contentPane.add(txt_email);
		
		lblNewLabel_2_1_2 = new JLabel("Email:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(741, 70, 71, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		lblNewLabel_2_1_3 = new JLabel("Helbidea:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(267, 199, 71, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		txt_helbidea = new JTextField();
		txt_helbidea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_helbidea.setColumns(10);
		txt_helbidea.setBounds(267, 221, 106, 20);
		contentPane.add(txt_helbidea);
		
		lblNewLabel_2_1_4 = new JLabel("Herria:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(435, 199, 71, 14);
		contentPane.add(lblNewLabel_2_1_4);
		
		txt_herria = new JTextField();
		txt_herria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_herria.setColumns(10);
		txt_herria.setBounds(435, 221, 106, 20);
		contentPane.add(txt_herria);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("Posta-kodea:");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(608, 201, 106, 14);
		contentPane.add(lblNewLabel_2_1_4_1);
		
		txt_postaKodea = new JTextField();
		txt_postaKodea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_postaKodea.setColumns(10);
		txt_postaKodea.setBounds(608, 223, 106, 20);
		contentPane.add(txt_postaKodea);
		
		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\atzera 2(2).png"));
		btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);
		
		btn_aldatu = new JButton("ALDATU");
		btn_aldatu.setBackground(new Color(255, 255, 255));
		btn_aldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_aldatu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_aldatu.setBounds(803, 324, 91, 23);
		contentPane.add(btn_aldatu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}
}
