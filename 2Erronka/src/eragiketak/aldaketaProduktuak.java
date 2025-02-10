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

public class aldaketaProduktuak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_marka;
	private JTextField txt_modeloa;
	private JTextField txt_memoria;
	private JTextField txt_ram;
	private JTextField txt_prozesagailua;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_tamaina;
	private JLabel lblNewLabel_2_1_4;
	private JTextField txt_sistemaEragilea;
	private JTextField txt_kamara;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2_1_5;
	private JTextField txt_erresoluzioa;
	private JTextField txt_frekuentzia;
	private JLabel lblNewLabel_2_1_6;
	private JTextField txt_kolorea;
	private JTextField textField_11;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_1_4_2;
	private JTextField textField;
	private JLabel lblNewLabel_4;

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
	public aldaketaProduktuak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_marka = new JTextField();
		txt_marka.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_marka.setBounds(80, 87, 106, 20);
		contentPane.add(txt_marka);
		txt_marka.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Marka:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(80, 65, 55, 20);
		contentPane.add(lblNewLabel_1);
		
		txt_modeloa = new JTextField();
		txt_modeloa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_modeloa.setColumns(10);
		txt_modeloa.setBounds(267, 87, 106, 20);
		contentPane.add(txt_modeloa);
		
		JLabel lblNewLabel_2 = new JLabel("Modeloa:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(267, 65, 71, 17);
		contentPane.add(lblNewLabel_2);
		
		txt_memoria = new JTextField();
		txt_memoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_memoria.setColumns(10);
		txt_memoria.setBounds(435, 87, 106, 20);
		contentPane.add(txt_memoria);
		
		JLabel lblNewLabel_2_1 = new JLabel("Memoria:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(435, 70, 78, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txt_ram = new JTextField();
		txt_ram.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_ram.setColumns(10);
		txt_ram.setBounds(608, 87, 106, 20);
		contentPane.add(txt_ram);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("RAM:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(606, 70, 44, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		txt_prozesagailua = new JTextField();
		txt_prozesagailua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_prozesagailua.setColumns(10);
		txt_prozesagailua.setBounds(788, 89, 106, 20);
		contentPane.add(txt_prozesagailua);
		
		lblNewLabel_2_1_2 = new JLabel("Prozesagailua:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(788, 65, 106, 19);
		contentPane.add(lblNewLabel_2_1_2);
		
		lblNewLabel_2_1_3 = new JLabel("Tamaina:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(80, 160, 71, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		txt_tamaina = new JTextField();
		txt_tamaina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_tamaina.setColumns(10);
		txt_tamaina.setBounds(80, 182, 106, 20);
		contentPane.add(txt_tamaina);
		
		lblNewLabel_2_1_4 = new JLabel("Sistema-Eragilea:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(267, 160, 125, 14);
		contentPane.add(lblNewLabel_2_1_4);
		
		txt_sistemaEragilea = new JTextField();
		txt_sistemaEragilea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_sistemaEragilea.setColumns(10);
		txt_sistemaEragilea.setBounds(267, 182, 106, 20);
		contentPane.add(txt_sistemaEragilea);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("Kamara:");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(435, 160, 106, 14);
		contentPane.add(lblNewLabel_2_1_4_1);
		
		txt_kamara = new JTextField();
		txt_kamara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kamara.setColumns(10);
		txt_kamara.setBounds(435, 182, 106, 20);
		contentPane.add(txt_kamara);
		
		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\atzera 2(2).png"));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);
		
		btnNewButton = new JButton("ALDATU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(803, 324, 91, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2_1_5 = new JLabel("Erresoluzioa:");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_5.setBounds(608, 160, 106, 14);
		contentPane.add(lblNewLabel_2_1_5);
		
		txt_erresoluzioa = new JTextField();
		txt_erresoluzioa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_erresoluzioa.setColumns(10);
		txt_erresoluzioa.setBounds(608, 182, 106, 20);
		contentPane.add(txt_erresoluzioa);
		
		txt_frekuentzia = new JTextField();
		txt_frekuentzia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_frekuentzia.setColumns(10);
		txt_frekuentzia.setBounds(788, 182, 106, 20);
		contentPane.add(txt_frekuentzia);
		
		lblNewLabel_2_1_6 = new JLabel("Frekuentzia:");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_6.setBounds(788, 160, 106, 14);
		contentPane.add(lblNewLabel_2_1_6);
		
		txt_kolorea = new JTextField();
		txt_kolorea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kolorea.setColumns(10);
		txt_kolorea.setBounds(267, 277, 106, 20);
		contentPane.add(txt_kolorea);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_11.setColumns(10);
		textField_11.setBounds(435, 277, 106, 20);
		contentPane.add(textField_11);
		
		lblNewLabel_3 = new JLabel("Posta Kodea:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(435, 255, 106, 17);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2_1_4_2 = new JLabel("Kolorea:");
		lblNewLabel_2_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_2.setBounds(267, 256, 71, 14);
		contentPane.add(lblNewLabel_2_1_4_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(608, 279, 106, 20);
		contentPane.add(textField);
		
		lblNewLabel_4 = new JLabel("Stock:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(608, 258, 106, 17);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}
}
