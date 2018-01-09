package br.com.xti.poo;

public enum Medida {

	MM("Milímetros"), CM("Centímetros"), M("Metros");

	public String titulo;

	/**
	 * Contrutor Enum
	 *
	 * OBS.:  Contrutores Enum's só podem ser chamados na sua propria class
	 * como está no exemplo acima.
	 */
	Medida(final String titulo) {
		this.titulo = titulo;
	}
}
