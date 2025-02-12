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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class GEskHistorikoPanela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GEskHistorikoPanela frame = new GEskHistorikoPanela();
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
	public GEskHistorikoPanela() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAtzera = new JButton("");
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

				PrintzipalaGerentea pg = new PrintzipalaGerentea();
				pg.setVisible(true);
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 66, 837, 313);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"ID", "Bezeroa", "Produktua", "Kopurua", "Prezioa", "Egoera", "Data", "Faktura"
			}
		));
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_1 = new JLabel("Gerentea");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(840, 419, 138, 32);
		contentPane.add(lblNewLabel_1);
		btnAtzera.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\atzera 2(2).png"));
		btnAtzera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtzera.setBounds(0, 0, 55, 32);
		contentPane.add(btnAtzera);

		JButton btnAtera = new JButton("");
		btnAtera.addActionListener(new ActionListener() {
			@Override
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
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\itxi(2).png"));
		btnAtera.setForeground(Color.WHITE);
		btnAtera.setBackground(new Color(255, 255, 255));
		btnAtera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtera.setBounds(956, 0, 32, 32);
		contentPane.add(btnAtera);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\OneDrive\\Desktop\\ERRONKAK\\ERRONKA2\\JAVA\\media\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}

}
