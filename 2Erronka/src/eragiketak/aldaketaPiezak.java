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

public class aldaketaPiezak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_kategoria;
	private JTextField txt_marka;
	private JTextField txt_modeloa;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_ezaugarriak;
	private JLabel lblNewLabel_2_1_4;
	private JTextField txt_prezioa;
	private JTextField txt_stock;
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
	public aldaketaPiezak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_kategoria = new JTextField();
		txt_kategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kategoria.setColumns(10);
		txt_kategoria.setBounds(267, 95, 106, 20);
		contentPane.add(txt_kategoria);
		
		JLabel lblNewLabel_2 = new JLabel("Kategoria:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(267, 67, 74, 17);
		contentPane.add(lblNewLabel_2);
		
		txt_marka = new JTextField();
		txt_marka.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_marka.setColumns(10);
		txt_marka.setBounds(435, 95, 106, 20);
		contentPane.add(txt_marka);
		
		JLabel lblNewLabel_2_1 = new JLabel("Marka:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(435, 68, 65, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txt_modeloa = new JTextField();
		txt_modeloa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_modeloa.setColumns(10);
		txt_modeloa.setBounds(608, 95, 106, 20);
		contentPane.add(txt_modeloa);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Modeloa:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(608, 68, 91, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		lblNewLabel_2_1_3 = new JLabel("Ezaugarriak:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(267, 199, 89, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		txt_ezaugarriak = new JTextField();
		txt_ezaugarriak.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_ezaugarriak.setColumns(10);
		txt_ezaugarriak.setBounds(267, 221, 106, 20);
		contentPane.add(txt_ezaugarriak);
		
		lblNewLabel_2_1_4 = new JLabel("Prezioa:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(435, 199, 71, 14);
		contentPane.add(lblNewLabel_2_1_4);
		
		txt_prezioa = new JTextField();
		txt_prezioa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_prezioa.setColumns(10);
		txt_prezioa.setBounds(435, 221, 106, 20);
		contentPane.add(txt_prezioa);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("Stock:");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(608, 201, 106, 14);
		contentPane.add(lblNewLabel_2_1_4_1);
		
		txt_stock = new JTextField();
		txt_stock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_stock.setColumns(10);
		txt_stock.setBounds(608, 223, 106, 20);
		contentPane.add(txt_stock);
		
		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\atzera 2(2).png"));
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}
}
