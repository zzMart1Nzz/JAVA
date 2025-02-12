package eragiketak;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class aldaketaLangileak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txt_lanpostua;
    private JTextField txt_nan;
    private JTextField txt_izena;
    private JTextField txt_abizena;
    private JTextField txt_telefonoa;
    private JTextField txt_email;
    private JTextField txt_erabiltzailea;
    private JTextField txt_pasahitza;
    private JTextField txt_helbidea;
    private JTextField txt_postaKodea;
    private JLabel lblHelbidea;
    private JTextField txt_lanpostuaIdLanpostua;
    private JLabel lblIdlanpostua;
    private JLabel okIkonoa;
    private JLabel lblNewLabel;

    /**
     * Abian jarri aplikazioa.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    aldaketaLangileak frame = new aldaketaLangileak(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Sortu leihoa
     * @param langilea
     */
    public aldaketaLangileak(Langilea langilea) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Sarrera-kampoak
        txt_lanpostua = new JTextField();
        txt_lanpostua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_lanpostua.setColumns(10);
        txt_lanpostua.setBounds(80, 173, 106, 20);
        contentPane.add(txt_lanpostua);
        txt_lanpostua.setText(langilea.getLanpostua());

        JLabel lblLanpostua = new JLabel("Lanpostua:");
        lblLanpostua.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblLanpostua.setBounds(80, 148, 78, 14);
        contentPane.add(lblLanpostua);

        txt_nan = new JTextField();
        txt_nan.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_nan.setColumns(10);
        txt_nan.setBounds(267, 173, 106, 20);
        contentPane.add(txt_nan);
        txt_nan.setText(langilea.getNan());

        JLabel lblNan = new JLabel("NAN:");
        lblNan.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNan.setBounds(267, 148, 44, 14);
        contentPane.add(lblNan);

        txt_izena = new JTextField();
        txt_izena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_izena.setColumns(10);
        txt_izena.setBounds(435, 173, 106, 20);
        contentPane.add(txt_izena);
        txt_izena.setText(langilea.getIzena());

        JLabel lblIzena = new JLabel("Izena:");
        lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblIzena.setBounds(435, 148, 71, 14);
        contentPane.add(lblIzena);

        txt_abizena = new JTextField();
        txt_abizena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_abizena.setColumns(10);
        txt_abizena.setBounds(608, 173, 106, 20);
        contentPane.add(txt_abizena);
        txt_abizena.setText(langilea.getAbizena());

        JLabel lblAbizena = new JLabel("Abizena:");
        lblAbizena.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblAbizena.setBounds(608, 148, 71, 14);
        contentPane.add(lblAbizena);

        txt_telefonoa = new JTextField();
        txt_telefonoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_telefonoa.setColumns(10);
        txt_telefonoa.setBounds(788, 173, 106, 20);
        contentPane.add(txt_telefonoa);
        txt_telefonoa.setText(langilea.getTelefonoZenbakia());

        JLabel lblTelefonoa = new JLabel("Telefonoa:");
        lblTelefonoa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTelefonoa.setBounds(791, 148, 91, 14);
        contentPane.add(lblTelefonoa);

        txt_email = new JTextField();
        txt_email.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_email.setColumns(10);
        txt_email.setBounds(80, 260, 106, 20);
        contentPane.add(txt_email);
        txt_email.setText(langilea.getPostaElektronikoa());

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblEmail.setBounds(80, 235, 106, 14);
        contentPane.add(lblEmail);

        txt_erabiltzailea = new JTextField();
        txt_erabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_erabiltzailea.setColumns(10);
        txt_erabiltzailea.setBounds(267, 260, 106, 20);
        contentPane.add(txt_erabiltzailea);
        txt_erabiltzailea.setText(langilea.getErabiltzaileIzena());

        JLabel lblErabiltzailea = new JLabel("Erabiltzailea:");
        lblErabiltzailea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblErabiltzailea.setBounds(267, 233, 106, 14);
        contentPane.add(lblErabiltzailea);

        txt_pasahitza = new JTextField();
        txt_pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_pasahitza.setColumns(10);
        txt_pasahitza.setBounds(435, 260, 106, 20);
        contentPane.add(txt_pasahitza);
        txt_pasahitza.setText(langilea.getPasahitza());

        JLabel lblPasahitza = new JLabel("Pasahitza:");
        lblPasahitza.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPasahitza.setBounds(435, 235, 106, 14);
        contentPane.add(lblPasahitza);

        txt_helbidea = new JTextField();
        txt_helbidea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_helbidea.setColumns(10);
        txt_helbidea.setBounds(608, 260, 106, 20);
        contentPane.add(txt_helbidea);
        txt_helbidea.setText(langilea.getHelbidea());

        txt_postaKodea = new JTextField();
        txt_postaKodea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_postaKodea.setColumns(10);
        txt_postaKodea.setBounds(788, 260, 106, 20);
        contentPane.add(txt_postaKodea);
        txt_postaKodea.setText(langilea.getPostaKodea());

        JLabel lblPostaKodea = new JLabel("Posta Kodea:");
        lblPostaKodea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPostaKodea.setBounds(788, 232, 106, 17);
        contentPane.add(lblPostaKodea);

        // Botoi atzera
        JButton btnAtzera = new JButton("");
        btnAtzera.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\atzera 2(2).png"));
        btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAtzera.setBounds(0, 0, 55, 32);
        contentPane.add(btnAtzera);

        lblHelbidea = new JLabel("Helbidea:");
        lblHelbidea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblHelbidea.setBounds(608, 237, 71, 14);
        contentPane.add(lblHelbidea);

        txt_lanpostuaIdLanpostua = new JTextField();
        txt_lanpostuaIdLanpostua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_lanpostuaIdLanpostua.setColumns(10);
        txt_lanpostuaIdLanpostua.setBounds(788, 109, 106, 20);
        contentPane.add(txt_lanpostuaIdLanpostua);
        txt_lanpostuaIdLanpostua.setText(String.valueOf(langilea.getLanpostua_idlanpostua()));

        lblIdlanpostua = new JLabel("idLanpostua:");
        lblIdlanpostua.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblIdlanpostua.setBounds(788, 75, 106, 14);
        contentPane.add(lblIdlanpostua);

        JLabel lblID = new JLabel("ID:");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblID.setBounds(111, 44, 28, 25);
        contentPane.add(lblID);

        JLabel lblid = new JLabel("0");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblid.setBounds(149, 44, 80, 25);
        contentPane.add(lblid);
        lblid.setText(String.valueOf(langilea.getIdlangilea()));

        // Ok ikonoa, aldaketak onartu eta eguneratu
        okIkonoa = new JLabel("");
        okIkonoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        okIkonoa.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\ok(1).png"));
        okIkonoa.setBounds(859, 370, 35, 35);
        contentPane.add(okIkonoa);

        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\UTech java fondoa 1(2).png"));
        lblNewLabel.setBounds(0, 0, 988, 445);
        contentPane.add(lblNewLabel);

        okIkonoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Object[] aukerak = {"Bai", "Ez"};
                int konfirmazioa = JOptionPane.showOptionDialog(null, "Ziur zaude aldaketak gordetu nahi dituzula?", "Baieztatu",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, aukerak, aukerak[0]);

                if (konfirmazioa == JOptionPane.YES_OPTION) {
                    // Testu-kampoetatik balioak lortu
                    int lanpostua_idlanpostua = Integer.parseInt(txt_lanpostuaIdLanpostua.getText()); // `lanpostua_idlanpostua`
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

                    // Langilea eguneratzea
                    langilea.setLanpostua_idlanpostua(lanpostua_idlanpostua); // `lanpostua_idlanpostua` eguneratzea
                    langilea.setLanpostua(lanpostua);
                    langilea.setNan(nan);
                    langilea.setIzena(izena);
                    langilea.setAbizena(abizena);
                    langilea.setTelefonoZenbakia(telefonoa);
                    langilea.setPostaElektronikoa(email);
                    langilea.setErabiltzaileIzena(erabiltzailea);
                    langilea.setPasahitza(pasahitza);
                    langilea.setHelbidea(helbidea);
                    langilea.setPostaKodea(postaKodea);

                    // Langilea datu-basean eguneratzea
                    kudeaketaLangileak kudeaketa = new kudeaketaLangileak();
                    kudeaketa.eguneratuLangilea(langilea); // Datu-basean eguneratu

                    // Mezu bat erakustea
                    JOptionPane.showMessageDialog(null, "Aldaketak ondo gorde dira.");
                }
            }
        });
    }
}