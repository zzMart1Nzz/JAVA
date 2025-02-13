package erronka2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
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

import kudeaketak.kudeaketaBalorazioak;
import taulak.BalorazioakTaula;

public class GBalorazioakPanela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private kudeaketaBalorazioak dao;
    private JTextField txt_id;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    GBalorazioakPanela frame = new GBalorazioakPanela();
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
    public GBalorazioakPanela() {
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
                PrintzipalaGerentea pg = new PrintzipalaGerentea();
                pg.setVisible(true);
            }
        });
        contentPane.setLayout(null);

        dao = new kudeaketaBalorazioak();
        List<Balorazioa> lista = dao.lortuBalorazioak();
        BalorazioakTaula model = new BalorazioakTaula(lista);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 73, 900, 300);
        contentPane.add(scrollPane);

        btnAtzera.setIcon(new ImageIcon(GBalorazioakPanela.class.getResource("/media/atzera 2(2).png")));
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
        btnAtera.setIcon(new ImageIcon(GBalorazioakPanela.class.getResource("/media/itxi(2).png")));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(new Color(255, 255, 255));
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtera);

    	 JLabel birkargatuIko = new JLabel("");
         birkargatuIko.setIcon(new ImageIcon(GBalorazioakPanela.class.getResource("/media/birkargatu(1).png")));
         birkargatuIko.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         birkargatuIko.setBounds(887, 32, 35, 35);
         contentPane.add(birkargatuIko);
         birkargatuIko.addMouseListener(new MouseAdapter() {
        	    @Override
        	    public void mouseClicked(MouseEvent e) {
        	        List<Balorazioa> lista = dao.lortuBalorazioak();
        	        BalorazioakTaula model = new BalorazioakTaula(lista);
        	        table.setModel(model);  // Taula eguneratu modelo berriarekin
        	    }
        	});


        txt_id = new JTextField();
        txt_id.setBounds(345, 397, 297, 20);
        contentPane.add(txt_id);
        txt_id.setColumns(10);

        JLabel ezabatuIkonoa = new JLabel("");
        ezabatuIkonoa.setIcon(new ImageIcon(GBalorazioakPanela.class.getResource("/media/ezabatu(1).png")));
        ezabatuIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ezabatuIkonoa.setBounds(652, 392, 35, 35);
        contentPane.add(ezabatuIkonoa);
        ezabatuIkonoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                	// ID-a hartu
	                int idBalorazioa = Integer.parseInt(txt_id.getText());

	                // Hornitzailea bilatu ID-a erabiliz
	                Balorazioa balorazioa = lortuBalorazioaIdarekin(idBalorazioa);

	                if (balorazioa != null) {

	                	ezabatuBalorazioa(idBalorazioa); // Produktua ezabatu
	                	List<Balorazioa> lista = dao.lortuBalorazioak();
	         	        BalorazioakTaula model = new BalorazioakTaula(lista);
	         	        table.setModel(model);  // Taula eguneratu modelo berriarekin
	                } else {
	                    // Hornitzailea ez bada aurkitu, errore-mezua erakutsi
	                    JOptionPane.showMessageDialog(null, "Bezeroa ez da aurkitu ID honekin: " + idBalorazioa, "Errorea", JOptionPane.ERROR_MESSAGE);
	                }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "ID-a zenbaki baliodun bat izan behar du.", "Errorea", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.setBounds(0, 0, 988, 445);
                lblNewLabel.setIcon(new ImageIcon(GBalorazioakPanela.class.getResource("/media/UTech java fondoa 1(2).png")));
                contentPane.add(lblNewLabel);
    }
        // Hornitzailea ID-a erabiliz bilatzeko metodoa
        private Balorazioa lortuBalorazioaIdarekin(int idBalorazioa) {
            List<Balorazioa> balorazioak = dao.lortuBalorazioak();  // Hornitzaileak lortu
            for (Balorazioa balorazioa : balorazioak) {
                if (balorazioa.getIdBalorazioa()==idBalorazioa) {
                    return balorazioa;  // Aurkitu bada, hornitzailea bueltatzen da
                }
            }
            return null;  // Ez badago, null itzultzen da
        }
        private void ezabatuBalorazioa(int idBalorazioa) {
            boolean isDeleted = dao.ezabatuBalorazioa(idBalorazioa);  // Deitu `ezabatuProduktua` metodoari

            if (isDeleted) {

                JOptionPane.showMessageDialog(null, "Errore bat gertatu da produktu ezabatu ezin izan delako.", "Errorea", JOptionPane.ERROR_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "Produktua ezabatuta izan da.");

                // Taula berritu
                List<Balorazioa> lista = dao.lortuBalorazioak();
                BalorazioakTaula model = new BalorazioakTaula(lista);
                table.setModel(model);  // Taula eguneratu modelo berriarekin
                txt_id.setText("");
            }
        }

        }
