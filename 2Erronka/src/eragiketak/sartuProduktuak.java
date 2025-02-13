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

import erronka2.Produktua;
import kudeaketak.kudeaketaProduktuak;

public class sartuProduktuak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_marka;
	private JTextField txt_modeloa;
	private JTextField txt_memoria;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_1_3;
	private JTextField txt_ram;
	private JLabel lblNewLabel_2_1_4;
	private JTextField txt_prozesagailua;
	private JTextField txt_tamaina;
	private JButton btn_sartu;
	private JLabel lblNewLabel_2_1_5;
	private JTextField txt_sistemaEragilea;
	private JTextField txt_kamara;
	private JLabel lblNewLabel_2_1_6;
	private JTextField txt_erresoluzioa;
	private JTextField txt_frekuentzia;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_1_4_2;
	private JTextField txt_idProduktuMota;
	private JLabel lblNewLabel_1;
	private JTextField txt_kolorea;
	private JTextField txt_prezioa;
	private JTextField txt_stock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					sartuProduktuak frame = new sartuProduktuak();
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
	public sartuProduktuak() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txt_marka = new JTextField();
		txt_marka.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_marka.setColumns(10);
		txt_marka.setBounds(267, 84, 106, 20);
		contentPane.add(txt_marka);

		JLabel lblNewLabel_2_1 = new JLabel("Marka:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(267, 62, 78, 14);
		contentPane.add(lblNewLabel_2_1);

		txt_modeloa = new JTextField();
		txt_modeloa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_modeloa.setColumns(10);
		txt_modeloa.setBounds(435, 84, 106, 20);
		contentPane.add(txt_modeloa);

		JLabel lblNewLabel_2_1_1 = new JLabel("Modeloa:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(435, 62, 91, 14);
		contentPane.add(lblNewLabel_2_1_1);

		txt_memoria = new JTextField();
		txt_memoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_memoria.setColumns(10);
		txt_memoria.setBounds(608, 84, 106, 20);
		contentPane.add(txt_memoria);

		lblNewLabel_2_1_2 = new JLabel("Memoria:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(608, 62, 71, 14);
		contentPane.add(lblNewLabel_2_1_2);

		lblNewLabel_2_1_3 = new JLabel("RAM:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(788, 62, 71, 14);
		contentPane.add(lblNewLabel_2_1_3);

		txt_ram = new JTextField();
		txt_ram.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_ram.setColumns(10);
		txt_ram.setBounds(788, 84, 106, 20);
		contentPane.add(txt_ram);

		lblNewLabel_2_1_4 = new JLabel("Prozesagailua:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(80, 137, 106, 14);
		contentPane.add(lblNewLabel_2_1_4);

		txt_prozesagailua = new JTextField();
		txt_prozesagailua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_prozesagailua.setColumns(10);
		txt_prozesagailua.setBounds(80, 162, 106, 20);
		contentPane.add(txt_prozesagailua);

		JLabel lblNewLabel_2_1_4_1 = new JLabel("Tamaina:");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(267, 137, 106, 14);
		contentPane.add(lblNewLabel_2_1_4_1);

		txt_tamaina = new JTextField();
		txt_tamaina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_tamaina.setColumns(10);
		txt_tamaina.setBounds(267, 162, 106, 20);
		contentPane.add(txt_tamaina);

		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtzera.setIcon(new ImageIcon(sartuProduktuak.class.getResource("/media/atzera 2(2).png")));
		btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);

		btn_sartu = new JButton("");
		btn_sartu.setIcon(new ImageIcon(sartuProduktuak.class.getResource("/media/ok(1).png")));
		btn_sartu.setBackground(new Color(255, 255, 255));
		btn_sartu.addActionListener(new ActionListener() {
		    @Override
			public void actionPerformed(ActionEvent e) {

		        Object[] options = {"Bai", "Ez"};
                int erantzuna = JOptionPane.showOptionDialog(null, "Datuak ondo sartuta daude?", "KONFIRMATU",
                                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (erantzuna == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Produktua sartu da.", "SARTU DA",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Formularioan dauden datuak jaso
    		    	int idProduktuMota = Integer.parseInt(txt_idProduktuMota.getText());
    		        String marka = txt_marka.getText();
    		        String modeloa = txt_modeloa.getText();
    		        String memoria = txt_memoria.getText();
    		        String ram = txt_ram.getText();
    		        String preozesagailua = txt_prozesagailua.getText();
    		        String tamaina = txt_tamaina.getText();
    		        String sistemaEragilea = txt_sistemaEragilea.getText();
    		        String kamara = txt_kamara.getText();
    		        String erresoluzioa = txt_erresoluzioa.getText();
    		        String frekuentzia = txt_frekuentzia.getText();
    		        String kolorea = txt_kolorea.getText();
    		        Double prezioa = Double.parseDouble(txt_prezioa.getText());
    		        int stock = Integer.parseInt(txt_stock.getText());


    		        // Langilea objektua sortu
    		        Produktua produktua = new Produktua(
    		            0,  // Id automatikoa (0 utzi daiteke, datu-baseak automatikoki sortuko du)
    		            idProduktuMota,  // lanpostua_idlanpostua, beharrezkoa bada, honek ere jaso beharko da
    		            marka,
    		            modeloa,
    		            memoria,
    		            ram,
    		            preozesagailua,
    		            tamaina,
    		            sistemaEragilea,
    		            kamara,
    		            erresoluzioa,
    		            frekuentzia,
    		            kolorea,
    		            prezioa,
    		            stock

    		        );

    		        // kudeaketaLangileak klasea erabili langilea datu-basean sartzeko
    		        kudeaketaProduktuak kudeaketa = new kudeaketaProduktuak();
    		        kudeaketa.sortuProduktua(produktua);


    		        // Formularioa garbitzea (hautazkoa)
    		        garbitu();
                }else {}
		    }
		});



		btn_sartu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sartu.setBounds(803, 324, 35, 35);
		contentPane.add(btn_sartu);

		lblNewLabel_2_1_5 = new JLabel("Sistema Eragilea");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_5.setBounds(435, 137, 135, 14);
		contentPane.add(lblNewLabel_2_1_5);

		txt_sistemaEragilea = new JTextField();
		txt_sistemaEragilea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_sistemaEragilea.setColumns(10);
		txt_sistemaEragilea.setBounds(435, 162, 106, 20);
		contentPane.add(txt_sistemaEragilea);

		txt_kamara = new JTextField();
		txt_kamara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kamara.setColumns(10);
		txt_kamara.setBounds(608, 162, 106, 20);
		contentPane.add(txt_kamara);

		lblNewLabel_2_1_6 = new JLabel("Kamara:");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_6.setBounds(608, 137, 106, 14);
		contentPane.add(lblNewLabel_2_1_6);

		txt_erresoluzioa = new JTextField();
		txt_erresoluzioa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_erresoluzioa.setColumns(10);
		txt_erresoluzioa.setBounds(788, 162, 106, 20);
		contentPane.add(txt_erresoluzioa);

		txt_frekuentzia = new JTextField();
		txt_frekuentzia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_frekuentzia.setColumns(10);
		txt_frekuentzia.setBounds(80, 235, 106, 20);
		contentPane.add(txt_frekuentzia);

		lblNewLabel_3 = new JLabel("Frekuentzia:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(80, 207, 106, 17);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_2_1_4_2 = new JLabel("Erresoluzioa:");
		lblNewLabel_2_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_2.setBounds(790, 137, 104, 14);
		contentPane.add(lblNewLabel_2_1_4_2);

		txt_idProduktuMota = new JTextField();
		txt_idProduktuMota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_idProduktuMota.setColumns(10);
		txt_idProduktuMota.setBounds(80, 86, 106, 20);
		contentPane.add(txt_idProduktuMota);

		JLabel lblNewLabel_2_1_7 = new JLabel("idProduktuMota:");
		lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_7.setBounds(80, 64, 106, 14);
		contentPane.add(lblNewLabel_2_1_7);

		lblNewLabel_1 = new JLabel("Kolorea:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(267, 210, 106, 17);
		contentPane.add(lblNewLabel_1);

		txt_kolorea = new JTextField();
		txt_kolorea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_kolorea.setColumns(10);
		txt_kolorea.setBounds(267, 237, 106, 20);
		contentPane.add(txt_kolorea);

		JLabel lblNewLabel_1_1 = new JLabel("Prezioa:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(435, 210, 106, 17);
		contentPane.add(lblNewLabel_1_1);

		txt_prezioa = new JTextField();
		txt_prezioa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_prezioa.setColumns(10);
		txt_prezioa.setBounds(435, 237, 106, 20);
		contentPane.add(txt_prezioa);

		JLabel lblNewLabel_1_1_1 = new JLabel("Stock");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(608, 210, 106, 17);
		contentPane.add(lblNewLabel_1_1_1);

		txt_stock = new JTextField();
		txt_stock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_stock.setColumns(10);
		txt_stock.setBounds(608, 237, 106, 20);
		contentPane.add(txt_stock);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(sartuProduktuak.class.getResource("/media/UTech java fondoa 1(2).png")));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}

	private void garbitu() {
	txt_idProduktuMota.setText("");
    txt_marka.setText("");
    txt_modeloa.setText("");
    txt_memoria.setText("");
    txt_ram.setText("");
    txt_prozesagailua.setText("");
    txt_tamaina.setText("");
    txt_sistemaEragilea.setText("");
    txt_kamara.setText("");
    txt_erresoluzioa.setText("");
    txt_frekuentzia.setText("");
}
}
