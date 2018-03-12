package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;

public class Principal extends JFrame {
	private JPanel panel;
	protected PanelInicial panelInicial;

	public Principal() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		
		panelInicial = new PanelInicial();
		panel.add(panelInicial);
		panelInicial.setLayout(new BoxLayout(panelInicial, BoxLayout.X_AXIS));
	}

}
