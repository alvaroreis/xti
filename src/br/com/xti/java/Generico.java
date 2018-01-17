package br.com.xti.java;

import java.util.ArrayList;

public class Generico<E> {

	E elemento;

	public void setElemento(final E elemento) {
		this.elemento = elemento;
	}

	public E getElemento() {
		return this.elemento;
	}

	/*? extends Number =>pode receber qualquer tipo filho de number. EX.: double, int, float*/
	public double soma(final ArrayList<? extends Number> lista) {
		double total = 0;
		for (final Number number : lista) {
			total += number.doubleValue();
		}
		return total;
	}

	/*? super Number => pode receber qualquer tipo pai de number*/
	public double soma2(final ArrayList<? super Number> lista) {
		return 0;
	}

	public static void main(final String[] args) {

		final Generico<String> g = new Generico<>();

		g.setElemento("Lago Paranoá");
		//g.setElemento(123);
		g.getElemento().toUpperCase();

	}

}
