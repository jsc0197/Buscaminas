package control;

import javax.print.attribute.standard.NumberOfDocuments;

import modelo.Tablero;

public class Iniciador implements Iniciable {
	private byte minas;
	private int densidad;
	private int filas;
	private int columnas;
	private Tablero tablero;

	public byte getMinas() {
		return minas;
	}

	public void setMinas(byte minas) {
		assert minas>0;
		this.minas = minas;
	}

	public int getDensidad() {
		return densidad;
	}

	public void setDensidad(int densidad) {
		this.densidad = densidad;
	}

	@Override
	public void establecerDimensionTablero() {
		this.filas=(this.densidad*this.minas)/2;
	}

	@Override
	public void crearTablero() {
		assert this.filas > 0 && this.columnas > 0 : "numero no valido de filas/columnas";
		this.tablero=new Tablero(filas, columnas);
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	@Override
	public void colocarMinas() {
		assert this.tablero != null && minas > 0 : "fallo al definir el tablero y/o el numero de minas";
		// TODO hay que hacer un sorteo y pedirle al tablero que la coloque
		int x = 9, y = 8;
		// no se debe acceder directamente a las propiedades de otra clase
		// this.tablero.casillas[x][y].mina=true;
		boolean retorno = this.tablero.colocarMina(x, y);
	}

	public void iniciarJuego(Byte minas, int densidad) {
		setMinas(minas);
		setDensidad(densidad);
		establecerDimensionTablero();
		crearTablero();
		colocarMinas();
		this.tablero.calcularMinasAlrededor();
	}

}
