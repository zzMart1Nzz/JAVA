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

import eragiketak.aldaketaHornitzaileak;
import kudeaketak.kudeaketaHornitzaileak;
import taulak.HornitzaileakTaula;

public class HornitzailePanela extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private kudeaketaHornitzaileak dao;
    private JTextField txt_id;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    HornitzailePanela frame = new HornitzailePanela();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public HornitzailePanela() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        dao = new kudeaketaHornitzaileak();  // Hornitzaileak kudeatzeko logika
        List<Hornitzailea> lista = dao.lortuHornitzaileak();  // Hornitzaileen zerrenda
        HornitzaileakTaula model = new HornitzaileakTaula(lista);  // Taula modeloa
        contentPane.setLayout(null);

        table = new JTable(model);  // Taula erakutsi
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 73, 900, 300);
        contentPane.add(scrollPane);

        JLabel lblNewLabel_1 = new JLabel("Administratzailea");
        lblNewLabel_1.setBounds(640, 216, 84, 14);
        contentPane.add(lblNewLabel_1);

        // ID-a idazteko testu-kampo
        txt_id = new JTextField();
        txt_id.setBounds(345, 396, 297, 20);
        contentPane.add(txt_id);
        txt_id.setColumns(10);

        // Editatzeko ikonoa
        JLabel aldatuIkonoa = new JLabel("");
        aldatuIkonoa.setIcon(new ImageIcon(HornitzailePanela.class.getResource("/media/editatu(1).png")));
        aldatuIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aldatuIkonoa.setBounds(300, 392, 35, 35);
        contentPane.add(aldatuIkonoa);

        JButton btnAtzera = new JButton("");
        btnAtzera.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		 dispose();
                 Printzipala p = new Printzipala();
                 p.setVisible(true);
        	}
        });
        btnAtzera.setIcon(new ImageIcon(HornitzailePanela.class.getResource("/media/atzera 2(2).png")));
        btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAtzera.setBounds(0, 0, 55, 32);
        contentPane.add(btnAtzera);

        JButton btnAtera = new JButton("");
        btnAtera.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnAtera.setIcon(new ImageIcon(HornitzailePanela.class.getResource("/media/itxi(2).png")));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(Color.WHITE);
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAtera.setBounds(956, 0, 32, 32);
        contentPane.add(btnAtera);

        JLabel birkargatuIko = new JLabel("");
        birkargatuIko.setIcon(new ImageIcon(HornitzailePanela.class.getResource("/media/birkargatu(1).png")));
        birkargatuIko.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        birkargatuIko.setBounds(888, 27, 35, 35);
        contentPane.add(birkargatuIko);
        birkargatuIko.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                List<Hornitzailea> lista = dao.lortuHornitzaileak();
                HornitzaileakTaula model = new HornitzaileakTaula(lista);
                table.setModel(model);
            }
        });

        JLabel ezabatuIkonoa = new JLabel("");
        ezabatuIkonoa.setIcon(new ImageIcon(HornitzailePanela.class.getResource("/media/ezabatu(1).png")));
        ezabatuIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ezabatuIkonoa.setBounds(652, 392, 35, 35);
        contentPane.add(ezabatuIkonoa);
        ezabatuIkonoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                	// ID-a hartu
	                int idHornitzailea = Integer.parseInt(txt_id.getText());

	                // Hornitzailea bilatu ID-a erabiliz
	                Hornitzailea hornitzailea = lortuHornitzaileaIdarekin(idHornitzailea);

	                if (hornitzailea != null) {

	                	ezabatuHornitzailea(idHornitzailea); // Produktua ezabatu
	                	List<Hornitzailea> lista = dao.lortuHornitzaileak();
	         	        HornitzaileakTaula model = new HornitzaileakTaula(lista);
	         	        table.setModel(model);  // Taula eguneratu modelo berriarekin
	                } else {
	                    // Hornitzailea ez bada aurkitu, errore-mezua erakutsi
	                    JOptionPane.showMessageDialog(null, "Produktua ez da aurkitu ID honekin: " + idHornitzailea, "Errorea", JOptionPane.ERROR_MESSAGE);
	                }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "ID-a zenbaki baliodun bat izan behar du.", "Errorea", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

                JLabel label = new JLabel("");
                label.setIcon(new ImageIcon(HornitzailePanela.class.getResource("/media/UTech java fondoa 1(2).png")));
                label.setBounds(0, 0, 988, 445);
                contentPane.add(label);

        // Editatzeko ikonoan klik egin eta hornitzailea pasatzea
        aldatuIkonoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // ID-a hartu
                int idHornitzailea = Integer.parseInt(txt_id.getText());

                // Hornitzailea bilatu ID-a erabiliz
                Hornitzailea hornitzailea = lortuHornitzaileaIdarekin(idHornitzailea);

                if (hornitzailea != null) {
                    // Hornitzailea aurkitu bada, datuak pasatzea eta AldaketaHornitzaileak erakustea
                    aldaketaHornitzaileak ap = new aldaketaHornitzaileak(hornitzailea);
                    ap.setVisible(true);  // Erakutsi
                } else {
                    // Hornitzailea ez bada aurkitu, errore-mezua erakutsi
                    JOptionPane.showMessageDialog(null, "Hornitzailea ez da aurkitu ID honekin: " + idHornitzailea, "Errorea", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Hornitzailea ID-a erabiliz bilatzeko metodoa
    private Hornitzailea lortuHornitzaileaIdarekin(int idHornitzailea) {
        List<Hornitzailea> hornitzaileak = dao.lortuHornitzaileak();  // Hornitzaileak lortu
        for (Hornitzailea hornitzailea : hornitzaileak) {
            if (hornitzailea.getIdHornitzailea()==idHornitzailea) {
                return hornitzailea;  // Aurkitu bada, hornitzailea bueltatzen da
            }
        }
        return null;  // Ez badago, null itzultzen da
    }
    private void ezabatuHornitzailea(int idHornitzailea) {
        boolean isDeleted = dao.ezabatuHornitzailea(idHornitzailea);  // Deitu `ezabatuProduktua` metodoari

        if (isDeleted) {

            JOptionPane.showMessageDialog(null, "Errore bat gertatu da produktu ezabatu ezin izan delako.", "Errorea", JOptionPane.ERROR_MESSAGE);
        } else {
            // Taula berritu
            List<Hornitzailea> lista = dao.lortuHornitzaileak();
            HornitzaileakTaula model = new HornitzaileakTaula(lista);
            table.setModel(model);  // Taula eguneratu modelo berriarekin
            txt_id.setText("");
            JOptionPane.showMessageDialog(null, "Produktua ezabatuta izan da.");
        }
    }
}