package eragiketak;

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

import erronka2.Hornitzailea;
import kudeaketak.kudeaketaHornitzaileak;
import java.awt.Color;

public class aldaketaHornitzaileak extends JFrame {
    private JPanel contentPane;
    private JTextField txt_nif, txt_izena, txt_telefonoa, txt_email, txt_helbidea, txt_herria, txt_postaKodea;
    private JLabel lblNewLabel;
    private JButton btnAtzera;
    private JLabel okIkonoa;
    private JLabel lblID;
    private JLabel lblid;

    public aldaketaHornitzaileak(Hornitzailea hornitzailea) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Testu-kampoak hornitzailearen datuekin betetzea
        JLabel lblNif = new JLabel("NIF");
        lblNif.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNif.setBounds(111, 93, 80, 25);
        contentPane.add(lblNif);

        txt_nif = new JTextField();
        txt_nif.setBounds(111, 129, 200, 25);
        contentPane.add(txt_nif);
        txt_nif.setText(hornitzailea.getNif());

        JLabel lblIzena = new JLabel("Izena");
        lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblIzena.setBounds(384, 93, 80, 25);
        contentPane.add(lblIzena);

        txt_izena = new JTextField();
        txt_izena.setBounds(384, 129, 200, 25);
        contentPane.add(txt_izena);
        txt_izena.setText(hornitzailea.getIzena());

        JLabel lblTelefonoa = new JLabel("Telefonoa");
        lblTelefonoa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTelefonoa.setBounds(636, 93, 80, 25);
        contentPane.add(lblTelefonoa);

        txt_telefonoa = new JTextField();
        txt_telefonoa.setBounds(636, 129, 200, 25);
        contentPane.add(txt_telefonoa);
        txt_telefonoa.setText(hornitzailea.getTelefonoZenbakia());

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblEmail.setBounds(111, 174, 80, 25);
        contentPane.add(lblEmail);

        txt_email = new JTextField();
        txt_email.setBounds(111, 210, 200, 25);
        contentPane.add(txt_email);
        txt_email.setText(hornitzailea.getPostaElektronikoa());

        JLabel lblHelbidea = new JLabel("Helbidea");
        lblHelbidea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblHelbidea.setBounds(384, 174, 80, 25);
        contentPane.add(lblHelbidea);

        txt_helbidea = new JTextField();
        txt_helbidea.setBounds(384, 210, 200, 25);
        contentPane.add(txt_helbidea);
        txt_helbidea.setText(hornitzailea.getHelbidea());

        JLabel lblHerria = new JLabel("Herria");
        lblHerria.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblHerria.setBounds(636, 174, 80, 25);
        contentPane.add(lblHerria);

        txt_herria = new JTextField();
        txt_herria.setBounds(636, 210, 200, 25);
        contentPane.add(txt_herria);
        txt_herria.setText(hornitzailea.getHerria());

        JLabel lblPostaKodea = new JLabel("Posta Kodea");
        lblPostaKodea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPostaKodea.setBounds(111, 247, 80, 25);
        contentPane.add(lblPostaKodea);

        txt_postaKodea = new JTextField();
        txt_postaKodea.setBounds(111, 283, 200, 25);
        contentPane.add(txt_postaKodea);
        txt_postaKodea.setText(hornitzailea.getPostakodea());

        // ID Label (bistaratu bakarrik)
        lblID = new JLabel("ID:");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblID.setBounds(111, 44, 28, 25);
        contentPane.add(lblID);

        lblid = new JLabel("");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblid.setBounds(149, 44, 80, 25);
        contentPane.add(lblid);
        lblid.setText(String.valueOf(hornitzailea.getIdHornitzailea()));  // Hornitzailearen ID-a erakustea

        // Atzera botoia
        btnAtzera = new JButton("");
        btnAtzera.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                // Botoi hau leihoa itxi edo beste ekintza bat egin behar du.
                dispose();
            }
        });
        btnAtzera.setIcon(new ImageIcon(aldaketaHornitzaileak.class.getResource("/media/atzera 2(2).png")));
        btnAtzera.setBounds(0, 0, 55, 32);
        contentPane.add(btnAtzera);

        // Aldaketak baieztatzeko ikonoa
        okIkonoa = new JLabel("");
        okIkonoa.setIcon(new ImageIcon(aldaketaHornitzaileak.class.getResource("/media/ok(1).png")));
        okIkonoa.setBounds(801, 306, 35, 35);
        contentPane.add(okIkonoa);

        // "OK" ikonoa klik egitean egindako aldaketak gordetzeko
        okIkonoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Object[] aukerak = {"Bai", "Ez"};
                int konfirmazioa = JOptionPane.showOptionDialog(null, "Ziur zaude aldaketak gordetu nahi dituzula?", "Baieztatu",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, aukerak, aukerak[0]);

                if (konfirmazioa == JOptionPane.YES_OPTION) {
                    // Testu-kampoetatik balioak lortu
                    String nif = txt_nif.getText();
                    String izena = txt_izena.getText();
                    String telefonoa = txt_telefonoa.getText();
                    String email = txt_email.getText();
                    String helbidea = txt_helbidea.getText();
                    String herria = txt_herria.getText();
                    String postaKodea = txt_postaKodea.getText();

                    // Hornitzailea eguneratzea
                    hornitzailea.setNif(nif);
                    hornitzailea.setIzena(izena);
                    hornitzailea.setTelefonoZenbakia(telefonoa);
                    hornitzailea.setPostaElektronikoa(email);
                    hornitzailea.setHelbidea(helbidea);
                    hornitzailea.setHerria(herria);
                    hornitzailea.setPostakodea(postaKodea);

                    // Hornitzailea datu-basean eguneratzea
                    kudeaketaHornitzaileak kudeaketa = new kudeaketaHornitzaileak();
                    kudeaketa.eguneratuHornitzailea(hornitzailea);

                    // Mezu bat erakustea
                    JOptionPane.showMessageDialog(null, "Aldaketak ondo gorde dira.");
                }
            }
        });

        // Interfazean fondo baten gehitzea
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(aldaketaHornitzaileak.class.getResource("/media/UTech java fondoa 1(2).png")));
        lblNewLabel.setBounds(0, 0, 988, 445);
        contentPane.add(lblNewLabel);
    }
}