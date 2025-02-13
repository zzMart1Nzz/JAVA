
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
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import kudeaketak.kudeaketaPiezaEsk;
import taulak.PiezaEskTaula;

public class LPiezaEskPanela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private kudeaketaPiezaEsk dao;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    LPiezaEskPanela frame = new LPiezaEskPanela();
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
    public LPiezaEskPanela() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        dao = new kudeaketaPiezaEsk();
        List<PiezaEskaera> lista = dao.lortuPiezaEsk();
        PiezaEskTaula model = new PiezaEskTaula(lista);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 73, 900, 300);
        contentPane.add(scrollPane);

        JButton btnAtzera = new JButton("");
        btnAtzera.setBounds(0, 0, 55, 32);
        btnAtzera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PrintzipalaLangilea pl = new PrintzipalaLangilea();
                pl.setVisible(true);
            }
        });
        btnAtzera.setIcon(new ImageIcon(LPiezaEskPanela.class.getResource("/media/atzera 2(2).png")));
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
        btnAtera.setIcon(new ImageIcon(LPiezaEskPanela.class.getResource("/media/itxi(2).png")));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(new Color(255, 255, 255));
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtera);

        JLabel birkargatuIko = new JLabel("");
        birkargatuIko.setIcon(new ImageIcon(LPiezaEskPanela.class.getResource("/media/birkargatu(1).png")));
        birkargatuIko.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        birkargatuIko.setBounds(887, 32, 35, 35);
        contentPane.add(birkargatuIko);
        birkargatuIko.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                List<PiezaEskaera> lista = dao.lortuPiezaEsk();
                PiezaEskTaula model = new PiezaEskTaula(lista);
                table.setModel(model);
            }
        });

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 988, 445);
        lblNewLabel.setIcon(new ImageIcon(LPiezaEskPanela.class.getResource("/media/UTech java fondoa 1(2).png")));
        contentPane.add(lblNewLabel);
    }

    private PiezaEskaera lortuPiezaEskIdarekin(int idPiezaEsk) {
        List<PiezaEskaera> piezaEska = dao.lortuPiezaEsk();
        for (PiezaEskaera piezaEsk : piezaEska) {
            if (piezaEsk.getIdPiezaEskaera() == idPiezaEsk) {
                return piezaEsk;
            }
        }
        return null;
    }

    private void ezabatuPiezaEskaera(int idPiezaEsk) {
        boolean isDeleted = dao.ezabatuPiezaEskaera(idPiezaEsk);  // Deitu `ezabatuProduktua` metodoari

        if (!isDeleted) {
            JOptionPane.showMessageDialog(null, "Errore bat gertatu da produktu ezabatu ezin izan delako.", "Errorea", JOptionPane.ERROR_MESSAGE);
        } else {

            // Taula berritu
            List<PiezaEskaera> lista = dao.lortuPiezaEsk();
            PiezaEskTaula model = new PiezaEskTaula(lista);
            table.setModel(model);  // Taula eguneratu modelo berriarekin


            JOptionPane.showMessageDialog(null, "Produktua ezabatuta izan da.");
        }
    }
}
