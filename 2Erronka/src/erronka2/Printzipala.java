package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Printzipala extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Printzipala frame = new Printzipala();
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
	public Printzipala() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSaioaItxi = new JButton("");
		btnSaioaItxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Bai", "Ez"};
				int erantzuna = JOptionPane.showOptionDialog(null, "Saioa itxi nahi duzu?", "SAIOA ITXI", JOptionPane.YES_NO_OPTION, 
						+ JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if(erantzuna == JOptionPane.YES_OPTION) {
				dispose();
				
				Logina log = new Logina();
				log.setVisible(true);
				}else {}
			}
		});
		btnSaioaItxi.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\saioaItxi(1).png"));
		btnSaioaItxi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSaioaItxi.setBounds(0, 423, 110, 32);
		contentPane.add(btnSaioaItxi);
		
		JLabel lblNewLabel_1 = new JLabel("Administratzailea");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(731, 419, 247, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEskHistoIco = new JLabel("New label");
		lblEskHistoIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerenHistorikoa(1).png"));
		lblEskHistoIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEskHistoIco.setBounds(771, 251, 134, 107);
		contentPane.add(lblEskHistoIco);
		lblEskHistoIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				EskHistorikoPanela ehp = new EskHistorikoPanela();
				ehp.setVisible(true);
				
				
			}
		}); 
		
		JLabel lblPiezaEskIco = new JLabel("New label");
		lblPiezaEskIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezenEskaera(1).png"));
		lblPiezaEskIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPiezaEskIco.setBounds(593, 251, 134, 107);
		contentPane.add(lblPiezaEskIco);
		lblPiezaEskIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				PiezaEskPanela piep = new PiezaEskPanela();
				piep.setVisible(true);
			}
		}); 
		
		JLabel lblEskaeraIco = new JLabel("New label");
		lblEskaeraIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerak(1).png"));
		lblEskaeraIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEskaeraIco.setBounds(771, 52, 134, 107);
		contentPane.add(lblEskaeraIco);
		lblEskaeraIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				EskaeraPanela ep = new EskaeraPanela();
				ep.setVisible(true);
			}
		}); 
		
		JLabel lblPiezakIco = new JLabel("New label");
		lblPiezakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezak(1).png"));
		lblPiezakIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPiezakIco.setBounds(593, 52, 134, 107);
		contentPane.add(lblPiezakIco);
		lblPiezakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				PiezaPanela pip = new PiezaPanela();
				pip.setVisible(true);
			}
		}); 
		
		JLabel lblBalorazioakIco = new JLabel("New label");
		lblBalorazioakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\balorazioak(1).png"));
		lblBalorazioakIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBalorazioakIco.setBounds(413, 251, 134, 107);
		contentPane.add(lblBalorazioakIco);
		lblBalorazioakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				BalorazioakPanela balp = new BalorazioakPanela();
				balp.setVisible(true);
			}
		}); 
		
		JLabel lblBezeroakIco = new JLabel("New label");
		lblBezeroakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\bezeroak(1).png"));
		lblBezeroakIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBezeroakIco.setBounds(239, 251, 134, 107);
		contentPane.add(lblBezeroakIco);
		lblBezeroakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				BezeroakPanela bp = new BezeroakPanela();
				bp.setVisible(true);
			}
		}); 
		
		JLabel lblProduktPresIco = new JLabel("New label");
		lblProduktPresIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuakPrestakuntzan(1).png"));
		lblProduktPresIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblProduktPresIco.setBounds(61, 251, 134, 107);
		contentPane.add(lblProduktPresIco);
		lblProduktPresIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				ProdPrestPanela ppp = new ProdPrestPanela();
				ppp.setVisible(true);
			}
		}); 
		
		JButton btnAtera = new JButton("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Bai", "Ez"};
				int erantzuna = JOptionPane.showOptionDialog(null, "Programatik atera nahi duzu?", "Konfirmatu atera nahi duzun", JOptionPane.YES_NO_OPTION, 
						+ JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if(erantzuna == JOptionPane.YES_OPTION) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				}else {}
			}
		});
		btnAtera.setForeground(new Color(255, 255, 255));
		btnAtera.setBackground(new Color(255, 255, 255));
		btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setBounds(956, 0, 32, 32);
		contentPane.add(btnAtera);
		
		JLabel lblProduktuakIco = new JLabel("");
		lblProduktuakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuak(1).png"));
		lblProduktuakIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblProduktuakIco.setBounds(61, 52, 134, 108);
		contentPane.add(lblProduktuakIco);
		lblProduktuakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				ProduktuakPanela pp = new ProduktuakPanela();
				pp.setVisible(true);
			}
			
		});
		
		JLabel lblLangileakIco = new JLabel("New label");
		lblLangileakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\langileak(1).png"));
		lblLangileakIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLangileakIco.setBounds(239, 52, 134, 107);
		contentPane.add(lblLangileakIco);
		lblLangileakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				LangileakPanela lp = new LangileakPanela();
				lp.setVisible(true);
			}
		}); 
			
		
		JLabel lblHornitzaileakIco = new JLabel("New label");
		lblHornitzaileakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\hornitzaileak(1).png"));
		lblHornitzaileakIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHornitzaileakIco.setBounds(413, 52, 134, 107);
		contentPane.add(lblHornitzaileakIco);
		lblHornitzaileakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				HornitzailePanela hp = new HornitzailePanela();
				hp.setVisible(true);
			}
		}); 
		
		JLabel lblFondoa = new JLabel("");
		lblFondoa.setSize(100, 100);
		lblFondoa.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(1).png"));
		lblFondoa.setBounds(0, 0, 988, 445);
		contentPane.add(lblFondoa);
		
		JLabel label = new JLabel("New label");
		label.setBounds(814, 228, 48, 14);
		contentPane.add(label);
	}
}
