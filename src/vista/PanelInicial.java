package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import control.Densidad;
import control.NumeroMinas;

public class PanelInicial extends JPanel {

	private JButton btnJugar;
	private JComboBox comboBox;
	private JComboBox comboBoxMinas;

	public JButton getBtnJugar() {
		return btnJugar;
	}

	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}

	/**
	 * Create the panel.
	 */
	public PanelInicial() {
		setLayout(null);
		
		JLabel lblNumeroDeMinas = new JLabel("N\u00BA Minas");
		lblNumeroDeMinas.setBounds(44, 52, 56, 16);
		add(lblNumeroDeMinas);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Densidad.values()));
		comboBox.setBounds(170, 82, 84, 22);
		add(comboBox);
		
		JLabel lblDificultad = new JLabel("Dificultad");
		lblDificultad.setBounds(44, 85, 56, 16);
		add(lblDificultad);
		
		btnJugar = new JButton("Jugar");
		btnJugar.setFocusPainted(false);
		btnJugar.setBounds(170, 169, 84, 25);
		add(btnJugar);
		
		comboBoxMinas = new JComboBox();
		comboBoxMinas.setModel(new DefaultComboBoxModel(NumeroMinas.values()));
		comboBoxMinas.setBounds(169, 49, 85, 22);
		add(comboBoxMinas);

	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JComboBox getComboBoxMinas() {
		return comboBoxMinas;
	}

	public void setComboBox_1(JComboBox comboBox_1) {
		this.comboBoxMinas = comboBox_1;
	}
}
