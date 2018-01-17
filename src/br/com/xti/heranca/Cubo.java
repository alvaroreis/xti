package br.com.xti.heranca;

public class Cubo implements VolumeCalculavel,AreaCalculavel{
	double lado;

	public Cubo(final double lado) {
		this.lado  = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado * this.lado;
	}

	@Override
	public double calcularVolume() {
		return 6 * this.lado * this.lado;
	}

}
