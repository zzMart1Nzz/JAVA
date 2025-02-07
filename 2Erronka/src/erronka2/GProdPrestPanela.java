package erronka2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import kudeaketak.kudeaketaProdPrest;
import taulak.ProdPrestTaula;


public class GProdPrestPanela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private kudeaketaProdPrest dao;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProdPrestPanela frame = new ProdPrestPanela();
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
    public GProdPrestPanela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JButton btnAtzera = new JButton("");
        btnAtzera.setBounds(0, 0, 55, 32);
        btnAtzera.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PrintzipalaGerentea pg = new PrintzipalaGerentea();
                pg.setVisible(true);
            }
        });
        contentPane.setLayout(null);
        
        dao = new kudeaketaProdPrest();
        List<ProduktuaPrestakuntzan> lista = dao.lortuProduktuakPrestakuntzan();
        ProdPrestTaula model = new ProdPrestTaula(lista);
        
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 73, 900, 300);  
        contentPane.add(scrollPane);
        
        btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\atzera 2(2).png"));
        btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtzera);
        
        JButton btnAtera = new JButton("");
        btnAtera.setBounds(956, 0, 32, 32);
        btnAtera.addActionListener(new ActionListener() {
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
        btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(new Color(255, 255, 255));
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPane.add(btnAtera);
        
        JLabel lblNewLabel_1 = new JLabel("Administratzailea");
        lblNewLabel_1.setBounds(731, 419, 247, 32);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 988, 445);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
        contentPane.add(lblNewLabel);
    }
}
