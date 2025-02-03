package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrintzipalaGerentea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintzipalaGerentea frame = new PrintzipalaGerentea();
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
	public PrintzipalaGerentea() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Gerentea");
		lblNewLabel_1.setBounds(840, 419, 138, 32);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBalorazioakIco_G = new JLabel("New label");
		lblBalorazioakIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBalorazioakIco_G.setBounds(771, 52, 134, 107);
		lblBalorazioakIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\balorazioak(1).png"));
		contentPane.add(lblBalorazioakIco_G);
		lblBalorazioakIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GBalorazioakPanela gbalp = new GBalorazioakPanela();
				gbalp.setVisible(true);
			}
		}); 
		
		JLabel lblEskHistoIco_G = new JLabel("New label");
		lblEskHistoIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEskHistoIco_G.setBounds(683, 251, 134, 107);
		lblEskHistoIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerenHistorikoa(1).png"));
		contentPane.add(lblEskHistoIco_G);
		lblEskHistoIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GEskHistorikoPanela gehp = new GEskHistorikoPanela();
				gehp.setVisible(true);	
			}
		}); 
		
		JLabel lblEskaeraIco_G = new JLabel("New label");
		lblEskaeraIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEskaeraIco_G.setBounds(593, 52, 134, 107);
		lblEskaeraIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerak(1).png"));
		contentPane.add(lblEskaeraIco_G);
		lblEskaeraIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GEskaeraPanela gep = new GEskaeraPanela();
				gep.setVisible(true);
			}
		}); 
		
		JLabel lblPiezaEskIco_G = new JLabel("New label");
		lblPiezaEskIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPiezaEskIco_G.setBounds(513, 251, 134, 107);
		lblPiezaEskIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezenEskaera(1).png"));
		contentPane.add(lblPiezaEskIco_G);
		lblPiezaEskIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GPiezaEskPanela gpiep = new GPiezaEskPanela();
				gpiep.setVisible(true);
			}
		}); 
		
		JLabel lblPiezakIco_G = new JLabel("New label");
		lblPiezakIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPiezakIco_G.setBounds(413, 52, 134, 107);
		lblPiezakIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezak(1).png"));
		contentPane.add(lblPiezakIco_G);
		lblPiezakIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GPiezaPanela gpip = new GPiezaPanela();
				gpip.setVisible(true);
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
		btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtera.setBounds(956, 0, 32, 32);
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setForeground(Color.WHITE);
		btnAtera.setBackground(new Color(255, 255, 255));
		contentPane.add(btnAtera);
		
		
		JLabel lblHornitzaileakIco_G = new JLabel("New label");
		lblHornitzaileakIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHornitzaileakIco_G.setBounds(328, 251, 134, 107);
		lblHornitzaileakIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\hornitzaileak(1).png"));
		contentPane.add(lblHornitzaileakIco_G);
		lblHornitzaileakIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GHornitzailePanela ghp = new GHornitzailePanela();
				ghp.setVisible(true);
			}
		}); 
		
		JLabel lblBezeroakIco_G = new JLabel("New label");
		lblBezeroakIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBezeroakIco_G.setBounds(239, 52, 134, 107);
		lblBezeroakIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\bezeroak(1).png"));
		contentPane.add(lblBezeroakIco_G);
		lblBezeroakIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GBezeroakPanela gbp = new GBezeroakPanela();
				gbp.setVisible(true);
			}
		}); 
		
		JLabel lblProduktuakIco_G = new JLabel("");
		lblProduktuakIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblProduktuakIco_G.setBounds(61, 52, 134, 108);
		lblProduktuakIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuak(1).png"));
		contentPane.add(lblProduktuakIco_G);
		lblProduktuakIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				GProduktuakPanela gpp = new GProduktuakPanela();
				gpp.setVisible(true);
			}
			
		});
		
		JLabel lblProduktPresIco_G = new JLabel("New label");
		lblProduktPresIco_G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblProduktPresIco_G.setBounds(148, 251, 134, 107);
		lblProduktPresIco_G.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuakPrestakuntzan(1).png"));
		contentPane.add(lblProduktPresIco_G);
		lblProduktPresIco_G.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				GProdPrestPanela gppp = new GProdPrestPanela();
				gppp.setVisible(true);
			}
		}); 
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 988, 445);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		contentPane.add(lblNewLabel);
	}

}
