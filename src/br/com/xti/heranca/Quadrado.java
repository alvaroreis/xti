package br.com.xti.heranca;

public class Quadrado implements AreaCalculavel {

	double lado;

	public Quadrado(final double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}


}
