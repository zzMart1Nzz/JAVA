package erronka2;

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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Logina extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtErabiltzailea;
    private JPasswordField jpassPasahitza;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    Logina frame = new Logina();
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
    public Logina() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1007, 479);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(10, 11, 978, 434);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnAtera = new JButton("");
        btnAtera.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                Object[] options = {"Bai", "Ez"}; //Bai edo ez izateko aukerak ematen ditu
                int erantzuna = JOptionPane.showOptionDialog(null, "Programatik atera nahi duzu?", "Konfirmatu atera nahi duzun", JOptionPane.YES_NO_OPTION,
                        + JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if(erantzuna == JOptionPane.YES_OPTION) {
                    dispose();
                    JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Usando el método getResource para cargar la imagen desde el classpath
        btnAtera.setIcon(new ImageIcon(getClass().getResource("/media/itxi(2).png")));
        btnAtera.setForeground(Color.WHITE);
        btnAtera.setBackground(new Color(255, 255, 255));
        btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAtera.setBounds(946, 0, 32, 32);
        panel.add(btnAtera);

        JLabel lblNewLabel = new JLabel("Saioa hasi");
        lblNewLabel.setBackground(new Color(102, 153, 255));
        lblNewLabel.setBounds(375, 105, 222, 60);
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 42));
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Erabiltzailea:");
        lblNewLabel_1.setBounds(102, 196, 192, 35);
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Pasahitza: ");
        lblNewLabel_2.setBounds(133, 265, 161, 35);
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 29));
        panel.add(lblNewLabel_2);

        txtErabiltzailea = new JTextField();
        txtErabiltzailea.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtErabiltzailea.setBounds(315, 196, 358, 35);
        txtErabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 29));
        panel.add(txtErabiltzailea);
        txtErabiltzailea.setColumns(10);

        jpassPasahitza = new JPasswordField();
        jpassPasahitza.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        jpassPasahitza.setBounds(315, 265, 358, 35);
        jpassPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 29));
        panel.add(jpassPasahitza);

        JButton btnNewButton = new JButton("Sartu");
        btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnNewButton.setBounds(449, 352, 91, 23);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                char[] pasahitza = jpassPasahitza.getPassword();
                String pasahitzaFinala = new String(pasahitza);
                String erabiltzailea = txtErabiltzailea.getText();

                LoginaMetodok konprobazioa = new LoginaMetodok();

                Langilea langilea2 = new Langilea();
                langilea2.setErabiltzaileIzena(erabiltzailea);
                langilea2.setPasahitza(pasahitzaFinala);

                Langilea lan = konprobazioa.lortuErabiltzailea(langilea2);

                int id = 0;
                if (lan != null) {
                    id = lan.getLanpostua_idlanpostua();
                }

                int aukerak = 0;

                switch(id) {
                    case 1:
                        dispose();
                        JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System administratzailearen programara, "+lan.getIzena()+".", "SARTU ZARA",
                                JOptionPane.INFORMATION_MESSAGE);
                        Printzipala p = new Printzipala();
                        p.setVisible(true);
                        break;
                    case 2:
                        dispose();
                        JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System gerententzako programara, "+lan.getIzena()+".", "SARTU ZARA",
                                JOptionPane.INFORMATION_MESSAGE);
                        PrintzipalaGerentea pgr = new PrintzipalaGerentea();
                        pgr.setVisible(true);
                        break;
                    case 3:
                        dispose();
                        JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System langilearentzako programara, "+lan.getIzena()+".", "SARTU ZARA",
                                JOptionPane.INFORMATION_MESSAGE);
                        PrintzipalaLangilea pla = new PrintzipalaLangilea();
                        pla.setVisible(true);
                        break;
                    case 4:
                        dispose();
                        JOptionPane.showMessageDialog(null, "Ongi etorri Utopia System garraiolarientzako programara, "+lan.getIzena()+".", "SARTU ZARA",
                                JOptionPane.INFORMATION_MESSAGE);
                        PrintzipalaGarraioa pg = new PrintzipalaGarraioa();
                        pg.setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Erabiltzailea edo pasahitza ez dira zuzenak", "ERROREA!",
                                JOptionPane.ERROR_MESSAGE);
                        txtErabiltzailea.setText("");
                        jpassPasahitza.setText("");
                        txtErabiltzailea.requestFocus();
                        aukerak++;
                        if (aukerak == 2) {
                            JOptionPane.showMessageDialog(null, "Aukera bat geratzen zaizu", "KONTUZ!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else if (aukerak == 3) {
                            JOptionPane.showMessageDialog(null, "Aukera guztiak erabili dituzu!", "KONTUZ!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                }
            }
        });
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panel.add(btnNewButton);

        // Cargando la imagen de fondo desde los recursos
        JLabel lblFondoa = new JLabel("");
        lblFondoa.setIcon(new ImageIcon(Logina.class.getResource("/media/UTech java fondoa 1(2).png")));
        lblFondoa.setBounds(-11, -11, 989, 440);
        panel.add(lblFondoa);
    }
}
