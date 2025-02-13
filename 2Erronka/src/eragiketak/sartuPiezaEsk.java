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

import erronka2.PiezaEskaera;
import kudeaketak.kudeaketaPiezaEsk;

public class sartuPiezaEsk extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_idHornitzailea;
	private JTextField txt_idPieza;
	private JTextField txt_kopurua;
	private JButton btn_sartu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					sartuPiezaEsk frame = new sartuPiezaEsk();
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
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

		txt_kopurua = new JTextField();
		txt_kopurua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kopurua.setColumns(10);
		txt_kopurua.setBounds(296, 224, 106, 20);
		contentPane.add(txt_kopurua);

		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon(sartuPiezaEsk.class.getResource("/media/atzera 2(2).png")));
		btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);

		btn_sartu = new JButton("");
		btn_sartu.setIcon(new ImageIcon(sartuPiezaEsk.class.getResource("/media/ok(1).png")));
		btn_sartu.setBackground(new Color(255, 255, 255));
		btn_sartu.addActionListener(new ActionListener() {
		    @Override
			public void actionPerformed(ActionEvent e) {
		        try {
		            // 1. Testu-kampoetako datuak lortu
		            int idHornitzailea = Integer.parseInt(txt_idHornitzailea.getText());
		            int idPieza = Integer.parseInt(txt_idPieza.getText());
		            int kopurua = Integer.parseInt(txt_kopurua.getText());
		           

		            // 2. PiezaEskaera objektua sortu
		            PiezaEskaera piezaEskaera = new PiezaEskaera(0, idHornitzailea, idPieza, kopurua, null);

		            // 3. Datu-basean sartu
		            kudeaketaPiezaEsk kudeaketa = new kudeaketaPiezaEsk();
		            kudeaketa.sortuPiezaEskaera(piezaEskaera);

		            // 4. Eraginaren arrakasta adierazi
		       
		            JOptionPane.showMessageDialog(null, "PiezaEskaera ondo sartu da.");
		        } catch (Exception ex) {
		            // Huts-egiteak erakutsi
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null,"Errore bat gertatu da PiezaEskaera sartzerakoan");
		        }
		        garbitu();
		    }
		});

		btn_sartu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sartu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_sartu.setBounds(803, 324, 35, 35);
		contentPane.add(btn_sartu);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(sartuPiezaEsk.class.getResource("/media/UTech java fondoa 1(2).png")));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}
	private void garbitu() {
	    txt_idHornitzailea.setText("");
	    txt_idPieza.setText("");
	    txt_kopurua.setText("");
	    

	}
}
