package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private final JPanel pnlBotones = new JPanel();
	private final JButton btnPanel1 = new JButton("Panel 1");
	private final JButton btnPanel2 = new JButton("Panel 2");
	private final JButton btnPanel3 = new JButton("Panel 3");
	private final JPanel pnlContenido = new JPanel();
	private final JPanel pnlPanel1 = new JPanel();
	private final JPanel pnlPanel2 = new JPanel();
	private final JPanel pnlPanel3 = new JPanel();
	private final JLabel lblPanel = new JLabel("PANEL 1");
	private final JTextField textField = new JTextField();
	private final JButton btnNewButton = new JButton("New button");
	private final JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JTextField textField_1 = new JTextField();
	private final JButton btnNewButton_1 = new JButton("New button");
	private final JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		textField_1.setColumns(10);
		textField.setBounds(191, 55, 86, 20);
		textField.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			contentPane.add(pnlBotones, BorderLayout.SOUTH);
		}
		{
			btnPanel1.addActionListener(new BtnPanelActionListener());
			pnlBotones.add(btnPanel1);
		}
		{
			btnPanel2.addActionListener(new BtnPanelActionListener());
			pnlBotones.add(btnPanel2);
		}
		{
			btnPanel3.addActionListener(new BtnPanelActionListener());
			pnlBotones.add(btnPanel3);
		}
		{
			contentPane.add(pnlContenido, BorderLayout.CENTER);
		}
		pnlContenido.setLayout(new CardLayout(0, 0));
		{
			pnlContenido.add(pnlPanel1, "Panel 1");
		}
		pnlPanel1.setLayout(null);
		{
			lblPanel.setBounds(53, 33, 46, 14);
			pnlPanel1.add(lblPanel);
		}
		{
			pnlPanel1.add(textField);
		}
		{
			btnNewButton.setBounds(63, 114, 89, 23);
			pnlPanel1.add(btnNewButton);
		}
		{
			rdbtnNewRadioButton.setBounds(233, 114, 109, 23);
			pnlPanel1.add(rdbtnNewRadioButton);
		}
		{
			pnlContenido.add(pnlPanel2, "Panel 2");
		}
		{
			pnlPanel2.add(lblNewLabel);
		}
		{
			pnlPanel2.add(textField_1);
		}
		{
			pnlPanel2.add(btnNewButton_1);
		}
		{
			pnlContenido.add(pnlPanel3, "Panel 3");
		}
		pnlPanel3.setLayout(null);
		{
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"COELLO", "MIGUEL", "TU PRIMA"}));
			comboBox.setSelectedIndex(0);
			comboBox.setBounds(159, 50, 89, 20);
			pnlPanel3.add(comboBox);
		}
	}

	private class BtnPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout CL = (CardLayout) (pnlContenido.getLayout());
			CL.show(pnlContenido, arg0.getActionCommand());
		}
	}
}
