package erronka2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import eragiketak.aldaketaProduktuak;
import eragiketak.sartuLangileak;
import eragiketak.sartuProduktuak;
import kudeaketak.kudeaketaProduktuak;
import taulak.ProduktuakTaula;

public class ProduktuakPanela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private kudeaketaProduktuak dao;
    private JTextField txt_id;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    ProduktuakPanela frame = new ProduktuakPanela();
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
    public ProduktuakPanela() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JButton btnAtzera = new JButton("");
        btnAtzera.setBounds(0, 0, 55, 32);
        btnAtzera.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                dispose();
                Printzipala p = new Printzipala();
                p.setVisible(true);
            }
        });
        contentPane.setLayout(null);

        dao = new kudeaketaProduktuak();
        List<Produktua> lista = dao.lortuProduktuak();
        ProduktuakTaula model = new ProduktuakTaula(lista);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 73, 900, 300);
        contentPane.add(scrollPane);

        btnAtzera.setIcon(new ImageIcon(ProduktuakPanela.class.getResource("/media/atzera 2(2).png")));
        btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtzera);

        JButton btnAtera = new JButton("");
        btnAtera.setBounds(956, 0, 32, 32);
        btnAtera.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                Object[] options = {"Bai", "Ez"};
                int erantzuna = JOptionPane.showOptionDialog(null, "Programatik atera nahi duzu?", "Konfirmatu atera nahi duzun",
                                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (erantzuna == JOptionPane.YES_OPTION) {
                    dispose();
                    JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        btnAtera.setIcon(new ImageIcon(ProduktuakPanela.class.getResource("/media/itxi(2).png")));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(new Color(255, 255, 255));
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtera);

        JLabel aldatuIkonoa = new JLabel("");
        aldatuIkonoa.setIcon(new ImageIcon(ProduktuakPanela.class.getResource("/media/editatu(1).png")));
        aldatuIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aldatuIkonoa.setBounds(300, 392, 35, 35);
        contentPane.add(aldatuIkonoa);
        aldatuIkonoa.addMouseListener(new MouseAdapter () {
			@Override
	            public void mouseClicked(MouseEvent e) {
	                // ID-a hartu
	                int idProduktua = Integer.parseInt(txt_id.getText());

	                // Hornitzailea bilatu ID-a erabiliz
	                Produktua produktua = lortuProduktuaIdarekin(idProduktua);

	                if (produktua != null) {
	                    // Hornitzailea aurkitu bada, datuak pasatzea eta AldaketaHornitzaileak erakustea
	                    aldaketaProduktuak ap = new aldaketaProduktuak(produktua);
	                    ap.setVisible(true);  // Erakutsi
	                } else {
	                    // Hornitzailea ez bada aurkitu, errore-mezua erakutsi
	                    JOptionPane.showMessageDialog(null, "Produktuka ez da aurkitu ID honekin: " + idProduktua, "Errorea", JOptionPane.ERROR_MESSAGE);
	                }
	            }
		});



        JLabel lblNewLabel_1 = new JLabel("Administratzailea");
        lblNewLabel_1.setBounds(731, 419, 247, 32);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
        contentPane.add(lblNewLabel_1);

    	 JLabel birkargatuIko = new JLabel("");
         birkargatuIko.setIcon(new ImageIcon(ProduktuakPanela.class.getResource("/media/birkargatu(1).png")));
         birkargatuIko.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         birkargatuIko.setBounds(887, 32, 35, 35);
         contentPane.add(birkargatuIko);
         birkargatuIko.addMouseListener(new MouseAdapter() {
        	    @Override
        	    public void mouseClicked(MouseEvent e) {
        	        List<Produktua> lista = dao.lortuProduktuak();
        	        ProduktuakTaula model = new ProduktuakTaula(lista);
        	        table.setModel(model);  // Taula eguneratu modelo berriarekin
        	    }
        	});


        txt_id = new JTextField();
        txt_id.setBounds(345, 397, 297, 20);
        contentPane.add(txt_id);
        txt_id.setColumns(10);

        JLabel ezabatuIkonoa = new JLabel("");
        ezabatuIkonoa.setIcon(new ImageIcon(ProduktuakPanela.class.getResource("/media/ezabatu(1).png")));
        ezabatuIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ezabatuIkonoa.setBounds(652, 392, 35, 35);
        contentPane.add(ezabatuIkonoa);
        ezabatuIkonoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                	// ID-a hartu
	                int idProduktua = Integer.parseInt(txt_id.getText());

	                // Hornitzailea bilatu ID-a erabiliz
	                Produktua produktua = lortuProduktuaIdarekin(idProduktua);

	                if (produktua != null) {

	                	ezabatuProduktua(idProduktua); // Produktua ezabatu
	                	List<Produktua> lista = dao.lortuProduktuak();
	         	        ProduktuakTaula model = new ProduktuakTaula(lista);
	         	        table.setModel(model);  // Taula eguneratu modelo berriarekin
	                } else {
	                    // Hornitzailea ez bada aurkitu, errore-mezua erakutsi
	                    JOptionPane.showMessageDialog(null, "Produktua ez da aurkitu ID honekin: " + idProduktua, "Errorea", JOptionPane.ERROR_MESSAGE);
	                }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "ID-a zenbaki baliodun bat izan behar du.", "Errorea", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        JLabel gehituIkonoa = new JLabel("");
        gehituIkonoa.setIcon(new ImageIcon(ProduktuakPanela.class.getResource("/media/gehitu(1).png")));
        gehituIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gehituIkonoa.setBounds(65, 27, 35, 35);
        contentPane.add(gehituIkonoa);
        gehituIkonoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	sartuProduktuak spr = new sartuProduktuak();
            	spr.setVisible(true);
            }
        });
        
        
                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.setBounds(0, 0, 988, 445);
                lblNewLabel.setIcon(new ImageIcon(ProduktuakPanela.class.getResource("/media/UTech java fondoa 1(2).png")));
                contentPane.add(lblNewLabel);
    }
        // Hornitzailea ID-a erabiliz bilatzeko metodoa
        private Produktua lortuProduktuaIdarekin(int idProduktua) {
            List<Produktua> produktuak = dao.lortuProduktuak();  // Hornitzaileak lortu
            for (Produktua produktua : produktuak) {
                if (produktua.getId()==idProduktua) {
                    return produktua;  // Aurkitu bada, hornitzailea bueltatzen da
                }
            }
            return null;  // Ez badago, null itzultzen da
        }
        private void ezabatuProduktua(int idProduktua) {
            boolean isDeleted = dao.ezabatuProduktua(idProduktua);  // Deitu `ezabatuProduktua` metodoari

            if (isDeleted) {

                JOptionPane.showMessageDialog(null, "Errore bat gertatu da produktu ezabatu ezin izan delako.", "Errorea", JOptionPane.ERROR_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "Produktua ezabatuta izan da.");

                // Taula berritu
                List<Produktua> lista = dao.lortuProduktuak();
                ProduktuakTaula model = new ProduktuakTaula(lista);
                table.setModel(model);  // Taula eguneratu modelo berriarekin
                txt_id.setText("");
            }
        }

        }


