package control;

import javax.swing.JButton;

import org.junit.experimental.theories.Theories;

import vista.Botonera;
import vista.PanelInicial;
import vista.Principal;

public class PuenteVistaControl extends Principal{
	Principal principal= new Principal();
	PanelInicial panelInicial=new PanelInicial();
	Iniciador iniciador=new Iniciador();
	Botonera botonera;
	ListenerInicio listenerInicio=new ListenerInicio(this.panelInicial,this.iniciador,this.botonera);
	public PuenteVistaControl() {
		super();
		this.panelInicial.getBtnJugar().addActionListener(listenerInicio);
 }


	
}
