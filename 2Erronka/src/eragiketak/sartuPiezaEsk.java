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

public class sartuPiezaEsk extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_idHornitzailea;
	private JTextField txt_idPieza;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_kopurua;
	private JTextField txt_data;
	private JButton btn_sartu;

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
	public sartuPiezaEsk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_idHornitzailea = new JTextField();
		txt_idHornitzailea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_idHornitzailea.setBounds(296, 87, 106, 20);
		contentPane.add(txt_idHornitzailea);
		txt_idHornitzailea.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("idHornitzailea:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(296, 65, 106, 20);
		contentPane.add(lblNewLabel_1);
		
		txt_idPieza = new JTextField();
		txt_idPieza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_idPieza.setColumns(10);
		txt_idPieza.setBounds(589, 87, 106, 20);
		contentPane.add(txt_idPieza);
		
		JLabel lblNewLabel_2 = new JLabel("idPieza:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(589, 67, 63, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Kopurua:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(296, 198, 71, 14);
		contentPane.add(lblNewLabel_2_1);
		
		lblNewLabel_2_1_3 = new JLabel("Data:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(589, 195, 44, 20);
		contentPane.add(lblNewLabel_2_1_3);
		
		txt_kopurua = new JTextField();
		txt_kopurua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kopurua.setColumns(10);
		txt_kopurua.setBounds(296, 224, 106, 20);
		contentPane.add(txt_kopurua);
		
		txt_data = new JTextField();
		txt_data.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_data.setColumns(10);
		txt_data.setBounds(589, 224, 106, 20);
		contentPane.add(txt_data);
		
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
		
		btn_sartu = new JButton("SARTU");
		btn_sartu.setBackground(new Color(255, 255, 255));
		btn_sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_sartu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sartu.setBounds(803, 324, 91, 23);
		contentPane.add(btn_sartu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}
}
