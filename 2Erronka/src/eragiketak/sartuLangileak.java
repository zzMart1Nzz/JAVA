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

import erronka2.Langilea;
import kudeaketak.kudeaketaLangileak;

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
	private JTextField txt_lanpostuaIdLanpostua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					sartuLangileak frame = new sartuLangileak();
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
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txt_lanpostua = new JTextField();
		txt_lanpostua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_lanpostua.setColumns(10);
		txt_lanpostua.setBounds(267, 84, 106, 20);
		contentPane.add(txt_lanpostua);

		JLabel lblNewLabel_2_1 = new JLabel("Lanpostua:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(267, 62, 78, 14);
		contentPane.add(lblNewLabel_2_1);

		txt_nan = new JTextField();
		txt_nan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_nan.setColumns(10);
		txt_nan.setBounds(435, 84, 106, 20);
		contentPane.add(txt_nan);

		JLabel lblNewLabel_2_1_1 = new JLabel("NAN:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(435, 62, 44, 14);
		contentPane.add(lblNewLabel_2_1_1);

		txt_izena = new JTextField();
		txt_izena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_izena.setColumns(10);
		txt_izena.setBounds(608, 84, 106, 20);
		contentPane.add(txt_izena);

		lblNewLabel_2_1_2 = new JLabel("Izena:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(608, 62, 71, 14);
		contentPane.add(lblNewLabel_2_1_2);

		lblNewLabel_2_1_3 = new JLabel("Abizena:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(788, 62, 71, 14);
		contentPane.add(lblNewLabel_2_1_3);

		txt_abizena = new JTextField();
		txt_abizena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_abizena.setColumns(10);
		txt_abizena.setBounds(788, 84, 106, 20);
		contentPane.add(txt_abizena);

		lblNewLabel_2_1_4 = new JLabel("Telefonoa:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(80, 157, 91, 14);
		contentPane.add(lblNewLabel_2_1_4);

		txt_telefonoa = new JTextField();
		txt_telefonoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_telefonoa.setColumns(10);
		txt_telefonoa.setBounds(80, 182, 106, 20);
		contentPane.add(txt_telefonoa);

		JLabel lblNewLabel_2_1_4_1 = new JLabel("Email:");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(267, 157, 106, 14);
		contentPane.add(lblNewLabel_2_1_4_1);

		txt_email = new JTextField();
		txt_email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_email.setColumns(10);
		txt_email.setBounds(267, 182, 106, 20);
		contentPane.add(txt_email);

		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon(sartuLangileak.class.getResource("/media/atzera 2(2).png")));
		btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);

		btn_sartu = new JButton("");
		btn_sartu.setIcon(new ImageIcon(sartuLangileak.class.getResource("/media/ok(1).png")));
		btn_sartu.addActionListener(new ActionListener() {
		    @Override
			public void actionPerformed(ActionEvent e) {

		        Object[] options = {"Bai", "Ez"};
                int erantzuna = JOptionPane.showOptionDialog(null, "Datuak ondo sartuta daude?", "KONFIRMATU",
                                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (erantzuna == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Erabiltzailea sartu da.", "SARTU DA",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Formularioan dauden datuak jaso
    		    	int lanpostua_idlanpostua = Integer.parseInt(txt_lanpostuaIdLanpostua.getText());
    		        String lanpostua = txt_lanpostua.getText();
    		        String nan = txt_nan.getText();
    		        String izena = txt_izena.getText();
    		        String abizena = txt_abizena.getText();
    		        String telefonoa = txt_telefonoa.getText();
    		        String email = txt_email.getText();
    		        String erabiltzailea = txt_erabiltzailea.getText();
    		        String pasahitza = txt_pasahitza.getText();
    		        String helbidea = txt_helbidea.getText();
    		        String postaKodea = txt_postaKodea.getText();


    		        // Langilea objektua sortu
    		        Langilea langilea = new Langilea(
    		            0,  // Id automatikoa (0 utzi daiteke, datu-baseak automatikoki sortuko du)
    		            lanpostua_idlanpostua,  // lanpostua_idlanpostua, beharrezkoa bada, honek ere jaso beharko da
    		            lanpostua,
    		            nan,
    		            izena,
    		            abizena,
    		            telefonoa,
    		            email,
    		            erabiltzailea,
    		            pasahitza,
    		            helbidea,
    		            postaKodea

    		        );

    		        // kudeaketaLangileak klasea erabili langilea datu-basean sartzeko
    		        kudeaketaLangileak kudeaketa = new kudeaketaLangileak();
    		        kudeaketa.sortuLangilea(langilea);


    		        // Formularioa garbitzea (hautazkoa)
    		        garbitu();
                }else {}
		    }
		});



		btn_sartu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sartu.setBounds(803, 324, 35, 35);
		contentPane.add(btn_sartu);

		lblNewLabel_2_1_5 = new JLabel("Erabiltzailea:");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_5.setBounds(435, 157, 106, 14);
		contentPane.add(lblNewLabel_2_1_5);

		txt_erabiltzailea = new JTextField();
		txt_erabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_erabiltzailea.setColumns(10);
		txt_erabiltzailea.setBounds(435, 182, 106, 20);
		contentPane.add(txt_erabiltzailea);

		txt_pasahitza = new JTextField();
		txt_pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_pasahitza.setColumns(10);
		txt_pasahitza.setBounds(608, 182, 106, 20);
		contentPane.add(txt_pasahitza);

		lblNewLabel_2_1_6 = new JLabel("Pasahitza:");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_6.setBounds(608, 157, 106, 14);
		contentPane.add(lblNewLabel_2_1_6);

		txt_helbidea = new JTextField();
		txt_helbidea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_helbidea.setColumns(10);
		txt_helbidea.setBounds(788, 182, 106, 20);
		contentPane.add(txt_helbidea);

		txt_postaKodea = new JTextField();
		txt_postaKodea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_postaKodea.setColumns(10);
		txt_postaKodea.setBounds(80, 297, 106, 20);
		contentPane.add(txt_postaKodea);

		lblNewLabel_3 = new JLabel("Posta Kodea:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(80, 267, 106, 17);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_2_1_4_2 = new JLabel("Helbidea:");
		lblNewLabel_2_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_2.setBounds(788, 157, 91, 14);
		contentPane.add(lblNewLabel_2_1_4_2);

		txt_lanpostuaIdLanpostua = new JTextField();
		txt_lanpostuaIdLanpostua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_lanpostuaIdLanpostua.setColumns(10);
		txt_lanpostuaIdLanpostua.setBounds(80, 86, 106, 20);
		contentPane.add(txt_lanpostuaIdLanpostua);

		JLabel lblNewLabel_2_1_7 = new JLabel("idLanpostua:");
		lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_7.setBounds(80, 64, 106, 14);
		contentPane.add(lblNewLabel_2_1_7);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(sartuLangileak.class.getResource("/media/UTech java fondoa 1(2).png")));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}

	private void garbitu() {
	txt_lanpostuaIdLanpostua.setText("");
    txt_lanpostua.setText("");
    txt_nan.setText("");
    txt_izena.setText("");
    txt_abizena.setText("");
    txt_telefonoa.setText("");
    txt_email.setText("");
    txt_erabiltzailea.setText("");
    txt_pasahitza.setText("");
    txt_helbidea.setText("");
    txt_postaKodea.setText("");
}
}
