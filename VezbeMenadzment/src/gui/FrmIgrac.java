package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmIgrac extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private DefaultListModel<String> dlm = new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmIgrac frame = new FrmIgrac();
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
	public FrmIgrac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 413);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(Color.YELLOW);
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Forma za unos igraca");
		lblNaslov.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelNorth.add(lblNaslov);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(Color.PINK);
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnDijalog = new JButton("Dijalog Igrac");
		btnDijalog.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelSouth.add(btnDijalog);
		
		JButton btnModifikacija = new JButton("Modifikacija");
		btnModifikacija.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelSouth.add(btnModifikacija);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.PINK);
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{100, 300, 200, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 20, 0, 20, 0, 20, 0, 20, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblPrva = new JLabel("Dusan Vlahovic");
		JButton btnPrvi = new JButton("Vlahovic");
		btnPrvi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addToListNoDuplicates(lblPrva.getText());
			}
		});
		btnPrvi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnPrvi = new GridBagConstraints();
		gbc_btnPrvi.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPrvi.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrvi.gridx = 0;
		gbc_btnPrvi.gridy = 1;
		panelCenter.add(btnPrvi, gbc_btnPrvi);
		
		
		lblPrva.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPrva = new GridBagConstraints();
		gbc_lblPrva.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrva.gridx = 1;
		gbc_lblPrva.gridy = 1;
		panelCenter.add(lblPrva, gbc_lblPrva);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		list.setModel(dlm);
		scrollPane.setViewportView(list);
		
		JLabel lblDruga = new JLabel("Dusan Tadic");
		JButton btnDrugi = new JButton("Tadic");
		btnDrugi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addToListNoDuplicates(lblDruga.getText());
			}
		});
		btnDrugi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnDrugi = new GridBagConstraints();
		gbc_btnDrugi.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDrugi.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrugi.gridx = 0;
		gbc_btnDrugi.gridy = 3;
		panelCenter.add(btnDrugi, gbc_btnDrugi);
		
		
		lblDruga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDruga = new GridBagConstraints();
		gbc_lblDruga.insets = new Insets(0, 0, 5, 5);
		gbc_lblDruga.gridx = 1;
		gbc_lblDruga.gridy = 3;
		panelCenter.add(lblDruga, gbc_lblDruga);
		
		JLabel lblTreca = new JLabel("Aleksandar Mitrovic");
		JButton btnTreci = new JButton("Mitrovic");
		btnTreci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				dlm.add(0, lblTreca.getText());
				addToListNoDuplicates(lblTreca.getText());
			}
		});
		btnTreci.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnTreci = new GridBagConstraints();
		gbc_btnTreci.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTreci.insets = new Insets(0, 0, 5, 5);
		gbc_btnTreci.gridx = 0;
		gbc_btnTreci.gridy = 5;
		panelCenter.add(btnTreci, gbc_btnTreci);
		
		
		lblTreca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTreca = new GridBagConstraints();
		gbc_lblTreca.insets = new Insets(0, 0, 5, 5);
		gbc_lblTreca.gridx = 1;
		gbc_lblTreca.gridy = 5;
		panelCenter.add(lblTreca, gbc_lblTreca);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBackground(Color.PINK);
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 7;
		panelCenter.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 7;
		panelCenter.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 9;
		panelCenter.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 9;
		panelCenter.add(comboBox, gbc_comboBox);
	}
	
	public void addToListNoDuplicates(String text) {
		if(!dlm.contains(text)) {
			dlm.add(0, text);
		}
		
	}

}
