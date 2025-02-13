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

import erronka2.Produktua;
import kudeaketak.kudeaketaProduktuak;

public class aldaketaProduktuak extends JFrame {
    private JPanel contentPane;
    private JTextField txt_marka, txt_modeloa, txt_memoria, txt_ram, txt_prozesagailua, txt_tamaina, txt_sistemaEragilea;
    private JLabel lblNewLabel;
    private JButton btnAtzera;
    private JLabel okIkonoa;
    private JLabel lblID;
    private JLabel lblid;
    private JTextField txt_kamara;
    private JTextField txt_erresoluzioa;
    private JTextField txt_frekuentzia;
    private JTextField txt_kolorea;
    private JTextField txt_salmentaPrezioa;
    private JTextField txt_stock;
    private JTextField txt_idProduktuMota;

    public aldaketaProduktuak(Produktua produktua) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 490);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Testu-kampoak hornitzailearen datuekin betetzea
        JLabel lblmarka = new JLabel("Marka");
        lblmarka.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblmarka.setBounds(10, 65, 80, 25);
        contentPane.add(lblmarka);

        txt_marka = new JTextField();
        txt_marka.setBounds(10, 101, 200, 25);
        contentPane.add(txt_marka);
        txt_marka.setText(produktua.getMarka());

        JLabel lblIzena = new JLabel("Modeloa");
        lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblIzena.setBounds(252, 65, 80, 25);
        contentPane.add(lblIzena);

        txt_modeloa = new JTextField();
        txt_modeloa.setBounds(252, 101, 200, 25);
        contentPane.add(txt_modeloa);
        txt_modeloa.setText(produktua.getModeloa());

        JLabel lblTelefonoa = new JLabel("Memoria");
        lblTelefonoa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTelefonoa.setBounds(528, 65, 80, 25);
        contentPane.add(lblTelefonoa);

        txt_memoria = new JTextField();
        txt_memoria.setBounds(528, 101, 200, 25);
        contentPane.add(txt_memoria);
        txt_memoria.setText(produktua.getMemoria());

        JLabel lblram = new JLabel("RAM");
        lblram.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblram.setBounds(778, 65, 80, 25);
        contentPane.add(lblram);

        txt_ram = new JTextField();
        txt_ram.setBounds(778, 101, 200, 25);
        contentPane.add(txt_ram);
        txt_ram.setText(produktua.getRam());

        JLabel lblHelbidea = new JLabel("Prozesagailua");
        lblHelbidea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblHelbidea.setBounds(10, 137, 200, 25);
        contentPane.add(lblHelbidea);

        txt_prozesagailua = new JTextField();
        txt_prozesagailua.setBounds(10, 173, 200, 25);
        contentPane.add(txt_prozesagailua);
        txt_prozesagailua.setText(produktua.getProzesagailua());

        JLabel lblHerria = new JLabel("Tamaina");
        lblHerria.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblHerria.setBounds(252, 137, 80, 25);
        contentPane.add(lblHerria);

        txt_tamaina = new JTextField();
        txt_tamaina.setBounds(252, 173, 200, 25);
        contentPane.add(txt_tamaina);
        txt_tamaina.setText(produktua.getTamaina());

        JLabel lblPostaKodea = new JLabel("Sistema Eragilea");
        lblPostaKodea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPostaKodea.setBounds(528, 137, 118, 25);
        contentPane.add(lblPostaKodea);

        txt_sistemaEragilea = new JTextField();
        txt_sistemaEragilea.setBounds(528, 173, 200, 25);
        contentPane.add(txt_sistemaEragilea);
        txt_sistemaEragilea.setText(produktua.getSistemaEragilea());

        // ID Label (bistaratu bakarrik)
        lblID = new JLabel("ID:");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblID.setBounds(111, 11, 28, 25);
        contentPane.add(lblID);

        lblid = new JLabel("");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblid.setBounds(149, 11, 80, 25);
        contentPane.add(lblid);
        lblid.setText(String.valueOf(produktua.getId())); 

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
        okIkonoa.setBounds(877, 368, 35, 35);
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
                     String memoria = txt_memoria.getText();
                     String ram = txt_ram.getText();
                     String prozesagailua = txt_prozesagailua.getText();
                     String tamaina = txt_tamaina.getText();
                     String sistemaEragilea = txt_sistemaEragilea.getText();
                     String kamara = txt_kamara.getText();
                     String erresoluzioa = txt_erresoluzioa.getText();
                     String frekuentzia = txt_frekuentzia.getText();
                     String kolorea = txt_kolorea.getText();
                     Double salmentaPrezioa = Double.parseDouble(txt_salmentaPrezioa.getText());
                     int stock = Integer.parseInt(txt_stock.getText());

                     // Pieza eguneratzea
                     produktua.setMarka(marka);
                     produktua.setModeloa(modeloa);
                     produktua.setMemoria(memoria);
                     produktua.setRam(ram);
                     produktua.setProzesagailua(prozesagailua);
                     produktua.setTamaina(tamaina);
                     produktua.setSistemaEragilea(sistemaEragilea);
                     produktua.setKamara(kamara);
                     produktua.setErresoluzioa(erresoluzioa);
                     produktua.setFrekuentzia(frekuentzia);
                     produktua.setKolorea(kolorea);
                     produktua.setSalmentaPrezioa(salmentaPrezioa);
                     produktua.setStock(stock);


                     // Hornitzailea datu-basean eguneratzea
                     kudeaketaProduktuak kudeaketa = new kudeaketaProduktuak();
                     kudeaketa.eguneratuProduktua(produktua);

                     // Mezu bat erakustea
                     JOptionPane.showMessageDialog(null, "Aldaketak ondo gorde dira.");
                 }
             }
         });
        JLabel lblKamara = new JLabel("Kamara");
        lblKamara.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblKamara.setBounds(778, 137, 118, 25);
        contentPane.add(lblKamara);

        txt_kamara = new JTextField();
        txt_kamara.setText((String) null);
        txt_kamara.setBounds(778, 173, 200, 25);
        contentPane.add(txt_kamara);
        txt_kamara.setText(produktua.getKamara());

        JLabel lblPostaKodea_1_1 = new JLabel("Erresoluzioa");
        lblPostaKodea_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPostaKodea_1_1.setBounds(10, 214, 118, 25);
        contentPane.add(lblPostaKodea_1_1);

        txt_erresoluzioa = new JTextField();
        txt_erresoluzioa.setText((String) null);
        txt_erresoluzioa.setBounds(10, 250, 200, 25);
        contentPane.add(txt_erresoluzioa);
        txt_erresoluzioa.setText(produktua.getErresoluzioa());

        JLabel lblFruekentzia = new JLabel("Frekuentzia");
        lblFruekentzia.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblFruekentzia.setBounds(252, 214, 118, 25);
        contentPane.add(lblFruekentzia);

        txt_frekuentzia = new JTextField();
        txt_frekuentzia.setText((String) null);
        txt_frekuentzia.setBounds(252, 250, 200, 25);
        contentPane.add(txt_frekuentzia);
        txt_frekuentzia.setText(produktua.getFrekuentzia());

        JLabel lblKolorea = new JLabel("Kolorea");
        lblKolorea.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblKolorea.setBounds(528, 214, 118, 25);
        contentPane.add(lblKolorea);

        txt_kolorea = new JTextField();
        txt_kolorea.setText((String) null);
        txt_kolorea.setBounds(528, 250, 200, 25);
        contentPane.add(txt_kolorea);
        txt_kolorea.setText(produktua.getKolorea());

        JLabel lblPrezioa = new JLabel("Prezioa");
        lblPrezioa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPrezioa.setBounds(778, 215, 118, 25);
        contentPane.add(lblPrezioa);

        txt_salmentaPrezioa = new JTextField();
        txt_salmentaPrezioa.setText((String) null);
        txt_salmentaPrezioa.setBounds(778, 250, 200, 25);
        contentPane.add(txt_salmentaPrezioa);
        txt_salmentaPrezioa.setText(String.valueOf(produktua.getSalmentaPrezioa()));

        JLabel lblStock = new JLabel("Stock");
        lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblStock.setBounds(10, 286, 118, 25);
        contentPane.add(lblStock);

        txt_stock = new JTextField();
        txt_stock.setText((String) null);
        txt_stock.setBounds(10, 322, 200, 25);
        contentPane.add(txt_stock);
        txt_stock.setText(String.valueOf(produktua.getStock()));

        JLabel lblIdproduktua = new JLabel("idProduktuMota");
        lblIdproduktua.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblIdproduktua.setBounds(252, 286, 118, 25);
        contentPane.add(lblIdproduktua);

        txt_idProduktuMota = new JTextField();
        txt_idProduktuMota.setText((String) null);
        txt_idProduktuMota.setBounds(252, 322, 200, 25);
        contentPane.add(txt_idProduktuMota);
        txt_idProduktuMota.setText(String.valueOf(produktua.getProduktuMotaId()));

        // Interfazean fondo baten gehitzea
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(aldaketaHornitzaileak.class.getResource("/media/UTech java fondoa 1(2).png")));
        lblNewLabel.setBounds(0, 0, 988, 445);
        contentPane.add(lblNewLabel);
    }
}
