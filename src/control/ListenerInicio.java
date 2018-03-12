package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Botonera;
import vista.PanelInicial;

public class ListenerInicio implements ActionListener {
	PanelInicial panelInicial;
	Iniciador iniciador;
	Botonera botonera;
	public ListenerInicio(PanelInicial panelInicial, Iniciador iniciador, Botonera botonera) {
		super();
		this.panelInicial = panelInicial;
		this.iniciador = iniciador;
		this.botonera= botonera;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.iniciador.setMinas((byte) this.panelInicial.getComboBoxMinas().getSelectedItem());
		this.iniciador.setDensidad((int) (this.panelInicial.getComboBox().getSelectedItem()));
		this.panelInicial.getParent().remove(panelInicial);
		this.panelInicial.getParent().add(new Botonera(iniciador.getFilas(),iniciador.getColumnas()));
	}


	

	
}
