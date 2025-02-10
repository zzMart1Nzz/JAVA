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

public class aldaketaPiezenEsk extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_id;
	private JTextField txt_nif;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_helbidea;
	private JTextField txt_herria;
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
	public aldaketaPiezenEsk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_id.setBounds(296, 87, 106, 20);
		contentPane.add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(296, 65, 44, 20);
		contentPane.add(lblNewLabel_1);
		
		txt_nif = new JTextField();
		txt_nif.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_nif.setColumns(10);
		txt_nif.setBounds(589, 87, 106, 20);
		contentPane.add(txt_nif);
		
		JLabel lblNewLabel_2 = new JLabel("idHornitzailea:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(589, 67, 106, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("idPieza:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(296, 198, 71, 14);
		contentPane.add(lblNewLabel_2_1);
		
		lblNewLabel_2_1_3 = new JLabel("Kopurua:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(589, 195, 89, 20);
		contentPane.add(lblNewLabel_2_1_3);
		
		txt_helbidea = new JTextField();
		txt_helbidea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_helbidea.setColumns(10);
		txt_helbidea.setBounds(296, 224, 106, 20);
		contentPane.add(txt_helbidea);
		
		txt_herria = new JTextField();
		txt_herria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_herria.setColumns(10);
		txt_herria.setBounds(589, 224, 106, 20);
		contentPane.add(txt_herria);
		
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
