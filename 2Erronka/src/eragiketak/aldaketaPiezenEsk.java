package eragiketak;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Timestamp;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import erronka2.PiezaEskaera;
import kudeaketak.kudeaketaPiezaEsk;

public class aldaketaPiezenEsk extends JFrame {
    private JPanel contentPane;
    private JTextField txt_idHornitzailea, txt_idPieza, txt_kopurua, txt_data;
    private JLabel lblNewLabel;
    private JButton btnAtzera;
    private JLabel okIkonoa;
    private JLabel lblID;
    private JLabel lblid;

    public aldaketaPiezenEsk(PiezaEskaera piezaEsk) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Verificar que el objeto piezaEsk no sea null
        if (piezaEsk == null) {
            JOptionPane.showMessageDialog(null, "El objeto PiezaEskaera es null. No se puede continuar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Testu-kampoak hornitzailearen datuekin betetzea
        JLabel lblidHornitzailea = new JLabel("idHornitzailea");
        lblidHornitzailea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblidHornitzailea.setBounds(111, 93, 105, 25);
        contentPane.add(lblidHornitzailea);

        txt_idHornitzailea = new JTextField();
        txt_idHornitzailea.setBounds(111, 129, 200, 25);
        contentPane.add(txt_idHornitzailea);
        txt_idHornitzailea.setText(String.valueOf(piezaEsk.getHornitzaile_idHornitzailea()));

        JLabel lblidPieza = new JLabel("idPieza");
        lblidPieza.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblidPieza.setBounds(384, 93, 80, 25);
        contentPane.add(lblidPieza);

        txt_idPieza = new JTextField();
        txt_idPieza.setBounds(384, 129, 200, 25);
        contentPane.add(txt_idPieza);
        txt_idPieza.setText(String.valueOf(piezaEsk.getPieza_idPieza()));

        JLabel lblKopurua = new JLabel("Kopurua");
        lblKopurua.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblKopurua.setBounds(636, 93, 80, 25);
        contentPane.add(lblKopurua);

        txt_kopurua = new JTextField();
        txt_kopurua.setBounds(636, 129, 200, 25);
        contentPane.add(txt_kopurua);
        txt_kopurua.setText(String.valueOf(piezaEsk.getKopurua()));

        JLabel lbldata = new JLabel("Data");
        lbldata.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbldata.setBounds(111, 174, 80, 25);
        contentPane.add(lbldata);

        txt_data = new JTextField();
        txt_data.setBounds(111, 210, 200, 25);
        contentPane.add(txt_data);

        // Establecer la fecha actual en txt_data con formato Timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        txt_data.setText(timestamp.toString());  // Establecer el Timestamp como texto

        // ID Label (bistaratu bakarrik)
        lblID = new JLabel("ID:");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblID.setBounds(111, 44, 28, 25);
        contentPane.add(lblID);

        lblid = new JLabel("");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblid.setBounds(149, 44, 80, 25);
        contentPane.add(lblid);
        lblid.setText(String.valueOf(piezaEsk.getIdPiezaEskaera()));  // Hornitzailearen ID-a erakustea

        // Atzera botoia
        btnAtzera = new JButton("");
        btnAtzera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar la ventana
            }
        });
        btnAtzera.setIcon(new ImageIcon(aldaketaPiezenEsk.class.getResource("/media/atzera 2(2).png")));
        btnAtzera.setBounds(0, 0, 55, 32);
        contentPane.add(btnAtzera);

        // Aldaketak baieztatzeko ikonoa
        okIkonoa = new JLabel("");
        okIkonoa.setIcon(new ImageIcon(aldaketaPiezenEsk.class.getResource("/media/ok(1).png")));
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
                    int idHornitzailea = Integer.parseInt(txt_idHornitzailea.getText());
                    int idPieza = Integer.parseInt(txt_idPieza.getText());
                    int kopurua = Integer.parseInt(txt_kopurua.getText());
                    Timestamp data = Timestamp.valueOf(txt_data.getText()); 

                    // Realizar alguna acción con los datos (actualización de base de datos, etc.)
                    piezaEsk.setHornitzaile_idHornitzailea(idHornitzailea);
                    piezaEsk.setPieza_idPieza(idPieza); // Asegúrate de usar el método correcto
                    piezaEsk.setKopurua(kopurua);
                    piezaEsk.setData(data);
                    
                    kudeaketaPiezaEsk kudeaketa = new kudeaketaPiezaEsk();
                    kudeaketa.eguneratuPiezaEskaera(piezaEsk);
                            
                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Aldaketak ondo gorde dira.");
                }
            }
        });

        // Interfazean fondo baten gehitzea
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(aldaketaPiezenEsk.class.getResource("/media/UTech java fondoa 1(2).png")));
        lblNewLabel.setBounds(0, 0, 988, 445);
        contentPane.add(lblNewLabel);
    }
}
