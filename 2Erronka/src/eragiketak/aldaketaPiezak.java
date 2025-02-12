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

import erronka2.Pieza;
import kudeaketak.kudeaketaPiezak;

public class aldaketaPiezak extends JFrame {
    private JPanel contentPane;
    private JTextField txt_marka, txt_modeloa, txt_ezaugarriak, txt_prezioa, txt_stock;
    private JLabel lblNewLabel;
    private JButton btnAtzera;
    private JLabel okIkonoa;
    private JLabel lblID;
    private JLabel lblid;

    public aldaketaPiezak(Pieza pieza) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblMarka = new JLabel("Marka");
        lblMarka.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblMarka.setBounds(636, 93, 80, 25);
        contentPane.add(lblMarka);

        txt_marka = new JTextField();
        txt_marka.setBounds(636, 129, 200, 25);
        contentPane.add(txt_marka);
        txt_marka.setText(pieza.getMarka());

        JLabel lblModeloa = new JLabel("Modeloa");
        lblModeloa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblModeloa.setBounds(111, 174, 80, 25);
        contentPane.add(lblModeloa);

        txt_modeloa = new JTextField();
        txt_modeloa.setBounds(111, 210, 200, 25);
        contentPane.add(txt_modeloa);
        txt_modeloa.setText(pieza.getModeloa());

        JLabel lblEzaugarriak = new JLabel("Ezaugarriak");
        lblEzaugarriak.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblEzaugarriak.setBounds(384, 174, 129, 25);
        contentPane.add(lblEzaugarriak);

        txt_ezaugarriak = new JTextField();
        txt_ezaugarriak.setBounds(384, 210, 200, 25);
        contentPane.add(txt_ezaugarriak);
        txt_ezaugarriak.setText(pieza.getEzaugarriak());

        JLabel lblPrezioa = new JLabel("Prezioa");
        lblPrezioa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPrezioa.setBounds(636, 174, 80, 25);
        contentPane.add(lblPrezioa);

        txt_prezioa = new JTextField();
        txt_prezioa.setBounds(636, 210, 200, 25);
        contentPane.add(txt_prezioa);
        txt_prezioa.setText(String.valueOf(pieza.getErosketaPrezioa()));

        JLabel lblStock = new JLabel("Stock");
        lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblStock.setBounds(111, 247, 80, 25);
        contentPane.add(lblStock);

        txt_stock = new JTextField();
        txt_stock.setBounds(111, 283, 200, 25);
        contentPane.add(txt_stock);
        txt_stock.setText(String.valueOf(pieza.getStock()));

        // ID Label (bistaratu bakarrik)
        lblID = new JLabel("ID:");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblID.setBounds(111, 44, 28, 25);
        contentPane.add(lblID);

        lblid = new JLabel("");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblid.setBounds(149, 44, 80, 25);
        contentPane.add(lblid);
        lblid.setText(String.valueOf(pieza.getIdPieza()));  // Piezaren ID-a erakustea

        // Atzera botoia
        btnAtzera = new JButton("");
        btnAtzera.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                // Botoi hau leihoa itxi edo beste ekintza bat egin behar du.
                dispose();
            }
        });
        btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\atzera 2(2).png"));
        btnAtzera.setBounds(0, 0, 55, 32);
        contentPane.add(btnAtzera);

        // Aldaketak baieztatzeko ikonoa
        okIkonoa = new JLabel("");
        okIkonoa.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\ok(1).png"));
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
                    String marka = txt_marka.getText();
                    String modeloa = txt_modeloa.getText();
                    String ezaugarriak = txt_ezaugarriak.getText();
                    Double prezioa = Double.parseDouble(txt_prezioa.getText());
                    int stock = Integer.parseInt(txt_stock.getText());

                    // Pieza eguneratzea
                    pieza.setMarka(marka);
                    pieza.setModeloa(modeloa);
                    pieza.setEzaugarriak(ezaugarriak);
                    pieza.setErosketaPrezioa(prezioa);
                    pieza.setStock(stock);

                    // Hornitzailea datu-basean eguneratzea
                    kudeaketaPiezak kudeaketa = new kudeaketaPiezak();
                    kudeaketa.eguneratuPieza(pieza);

                    // Mezu bat erakustea
                    JOptionPane.showMessageDialog(null, "Aldaketak ondo gorde dira.");
                }
            }
        });

        // Interfazean fondo baten gehitzea
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\UTech java fondoa 1(2).png"));
        lblNewLabel.setBounds(0, 0, 988, 445);
        contentPane.add(lblNewLabel);
    }

	public aldaketaPiezak() {
		// TODO Auto-generated constructor stub
	}
}
