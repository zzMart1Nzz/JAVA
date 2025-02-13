package eragiketak;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import erronka2.Pieza;
import kudeaketak.kudeaketaPiezak;

public class sartuPiezak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_kategoria;
	private JTextField txt_marka;
	private JTextField txt_modeloa;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_ezaugarriak;
	private JLabel lblNewLabel_2_1_4;
	private JTextField txt_prezioa;
	private JButton btn_aldatu;
	private JTextField txt_stock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					sartuPiezak frame = new sartuPiezak();
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
	public sartuPiezak() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txt_kategoria = new JTextField();
		txt_kategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kategoria.setColumns(10);
		txt_kategoria.setBounds(168, 87, 106, 20);
		contentPane.add(txt_kategoria);

		JLabel lblNewLabel_2 = new JLabel("Kategoria:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(168, 67, 74, 17);
		contentPane.add(lblNewLabel_2);

		txt_marka = new JTextField();
		txt_marka.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_marka.setColumns(10);
		txt_marka.setBounds(430, 87, 106, 20);
		contentPane.add(txt_marka);

		JLabel lblNewLabel_2_1 = new JLabel("Marka:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(430, 68, 65, 14);
		contentPane.add(lblNewLabel_2_1);

		txt_modeloa = new JTextField();
		txt_modeloa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_modeloa.setColumns(10);
		txt_modeloa.setBounds(721, 87, 106, 20);
		contentPane.add(txt_modeloa);

		JLabel lblNewLabel_2_1_1 = new JLabel("Modeloa:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(721, 68, 91, 14);
		contentPane.add(lblNewLabel_2_1_1);

		lblNewLabel_2_1_3 = new JLabel("Ezaugarriak:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(168, 196, 89, 14);
		contentPane.add(lblNewLabel_2_1_3);

		txt_ezaugarriak = new JTextField();
		txt_ezaugarriak.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_ezaugarriak.setColumns(10);
		txt_ezaugarriak.setBounds(168, 221, 106, 20);
		contentPane.add(txt_ezaugarriak);

		lblNewLabel_2_1_4 = new JLabel("Prezioa:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(430, 196, 71, 14);
		contentPane.add(lblNewLabel_2_1_4);

		txt_prezioa = new JTextField();
		txt_prezioa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_prezioa.setColumns(10);
		txt_prezioa.setBounds(430, 221, 106, 20);
		contentPane.add(txt_prezioa);

		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon(sartuPiezak.class.getResource("/media/atzera 2(2).png")));
		btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);

		btn_aldatu = new JButton("");
		btn_aldatu.setIcon(new ImageIcon(sartuPiezak.class.getResource("/media/ok(1).png")));
		btn_aldatu.setBackground(new Color(255, 255, 255));
		btn_aldatu.addActionListener(new ActionListener() {
		    @Override
			public void actionPerformed(ActionEvent e) {
		        // Formularioan dauden datuak jasotzea

		        int kategoria = Integer.parseInt(txt_kategoria.getText());  // Datuak egokitu behar dira
		        String marka = txt_marka.getText();
		        String modeloa = txt_modeloa.getText();
		        String ezaugarriak = txt_ezaugarriak.getText();
		        double erosketaPrezioa = Double.parseDouble(txt_prezioa.getText());
		        int stock = Integer.parseInt(txt_stock.getText()); // Adibide bat, egokitu behar duzu

		        // Pieza objektu bat sortu
		        Pieza pieza = new Pieza(
		        		0,
		        		kategoria,
		        		marka,
		        		modeloa,
		        		ezaugarriak,
		        		erosketaPrezioa,
		        		stock);

		        // kudeaketaPiezak klasea erabili pieza datu-basean sartzeko
		        kudeaketaPiezak kudeaketa = new kudeaketaPiezak();
		        kudeaketa.sortuPieza(pieza);

		        // Mezu bat erakutsi erabiltzaileari
		        JOptionPane.showMessageDialog(null, "Pieza ondo sartu da.");

		        //gabitzeko metodoa
		        garbitu();
		    }
		});

		btn_aldatu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_aldatu.setBounds(803, 324, 35, 35);
		contentPane.add(btn_aldatu);

		txt_stock = new JTextField();
		txt_stock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_stock.setColumns(10);
		txt_stock.setBounds(721, 223, 106, 20);
		contentPane.add(txt_stock);

		JLabel lblNewLabel_2_1_4_1 = new JLabel("Stock:");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(721, 198, 71, 14);
		contentPane.add(lblNewLabel_2_1_4_1);

				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(sartuPiezak.class.getResource("/media/UTech java fondoa 1(2).png")));
				lblNewLabel.setBounds(0, 0, 988, 445);
				contentPane.add(lblNewLabel);
	}

	private void garbitu() {

	    txt_kategoria.setText("");
	    txt_marka.setText("");
	    txt_modeloa.setText("");
	    txt_ezaugarriak.setText("");
	    txt_prezioa.setText("");
	    txt_stock.setText("");
	}
}
