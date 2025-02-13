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

import eragiketak.fakturaEskaera;
import kudeaketak.kudeaketaEskaerak;
import taulak.EskaerakTaula;

public class GEskaeraPanela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private kudeaketaEskaerak dao;
    private JTextField txt_id;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    GEskaeraPanela frame = new GEskaeraPanela();
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
    public GEskaeraPanela() {
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

        dao = new kudeaketaEskaerak();
        List<Eskaera> lista = dao.lortuEskaerak();
        EskaerakTaula model = new EskaerakTaula(lista);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 73, 900, 300);
        contentPane.add(scrollPane);

        btnAtzera.setIcon(new ImageIcon(GEskaeraPanela.class.getResource("/media/atzera 2(2).png")));
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
        btnAtera.setIcon(new ImageIcon(GEskaeraPanela.class.getResource("/media/itxi(2).png")));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(new Color(255, 255, 255));
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtera);

        JLabel okIkonoa = new JLabel("");
        okIkonoa.setIcon(new ImageIcon(GEskaeraPanela.class.getResource("/media/ok(1).png")));
        okIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        okIkonoa.setBounds(300, 392, 35, 35);
        contentPane.add(okIkonoa);
        okIkonoa.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] opzioak = {"Bai", "Ez"};
				int konfirmazioa = JOptionPane.showOptionDialog(null, "Eskaera bidalita dago?", "BAIEZTATU", JOptionPane.YES_NO_OPTION,
						+ JOptionPane.QUESTION_MESSAGE, null, opzioak, opzioak[0]);
				if(konfirmazioa == JOptionPane.YES_OPTION) {
					int idEskaera =Integer.parseInt(txt_id.getText());
					kudeaketaEskaerak kudeaketa = new kudeaketaEskaerak();
					kudeaketa.bidaliEskaera(idEskaera);
					fakturaEskaera faktura = new fakturaEskaera();
					faktura.sortuFaktura(idEskaera);
					List<Eskaera> lista = dao.lortuEskaerak();
	     	        EskaerakTaula model = new EskaerakTaula(lista);
	     	        table.setModel(model);  // Taula eguneratu modelo berriarekin
	     	        txt_id.setText("");
				}else {}
			}
		});



        JLabel lblNewLabel_1 = new JLabel("Administratzailea");
        lblNewLabel_1.setBounds(731, 419, 247, 32);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
        contentPane.add(lblNewLabel_1);

    	 JLabel birkargatuIko = new JLabel("");
         birkargatuIko.setIcon(new ImageIcon(GEskaeraPanela.class.getResource("/media/birkargatu(1).png")));
         birkargatuIko.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         birkargatuIko.setBounds(887, 32, 35, 35);
         contentPane.add(birkargatuIko);
         birkargatuIko.addMouseListener(new MouseAdapter() {
     	    @Override
     	    public void mouseClicked(MouseEvent e) {
     	        List<Eskaera> lista = dao.lortuEskaerak();
     	        EskaerakTaula model = new EskaerakTaula(lista);
     	        table.setModel(model);  // Taula eguneratu modelo berriarekin
     	    }
     	});

        txt_id = new JTextField();
        txt_id.setBounds(345, 397, 297, 20);
        contentPane.add(txt_id);
        txt_id.setColumns(10);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 988, 445);
        lblNewLabel.setIcon(new ImageIcon(GEskaeraPanela.class.getResource("/media/UTech java fondoa 1(2).png")));
        contentPane.add(lblNewLabel);
    }
}