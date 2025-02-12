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

import kudeaketak.kudeaketaProdPrest;
import taulak.ProdPrestTaula;


public class LProdPrestPanela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private kudeaketaProdPrest dao;
    private JTextField txt_id;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    LProdPrestPanela frame = new LProdPrestPanela();
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
    public LProdPrestPanela() {
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
                PrintzipalaLangilea pl = new PrintzipalaLangilea();
                pl.setVisible(true);
            }
        });
        contentPane.setLayout(null);

        dao = new kudeaketaProdPrest();
        List<ProduktuaPrestakuntzan> lista = dao.lortuProduktuakPrestakuntzan();
        ProdPrestTaula model = new ProdPrestTaula(lista);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setForeground(new Color(176, 224, 230));
        scrollPane.setBounds(50, 73, 900, 300);
        contentPane.add(scrollPane);

        JLabel birkargatuIko = new JLabel("");
        birkargatuIko.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\birkargatu(1).png"));
        birkargatuIko.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        birkargatuIko.setBounds(887, 32, 35, 35);
        contentPane.add(birkargatuIko);
        birkargatuIko.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {

				List<ProduktuaPrestakuntzan> lista = dao.lortuProduktuakPrestakuntzan();
		        ProdPrestTaula model = new ProdPrestTaula(lista);

			}
		});

        btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\atzera 2(2).png"));
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
        btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\itxi(2).png"));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(new Color(255, 255, 255));
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtera);

        JLabel lblNewLabel_1 = new JLabel("Administratzailea");
        lblNewLabel_1.setBounds(731, 419, 247, 32);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
        contentPane.add(lblNewLabel_1);

        txt_id = new JTextField();
        txt_id.setBounds(345, 397, 297, 20);
        contentPane.add(txt_id);
        txt_id.setColumns(10);

        JLabel okIkonoa = new JLabel("");
        okIkonoa.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\ok(1).png"));
        okIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        okIkonoa.setBounds(652, 392, 35, 35);
        contentPane.add(okIkonoa);
        okIkonoa.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] opzioak = {"Bai", "Ez"};
				int konfirmazioa = JOptionPane.showOptionDialog(null, "Produktua prestatuta dago?", "BAIEZTATU", JOptionPane.YES_NO_OPTION,
						+ JOptionPane.QUESTION_MESSAGE, null, opzioak, opzioak[0]);
				if(konfirmazioa == JOptionPane.YES_OPTION) {

				}else {}
			}
		});

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 988, 445);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\UTech java fondoa 1(2).png"));
        contentPane.add(lblNewLabel);
    }
}
