package br.com.xti.poo;

public enum Medida {

	MM("Mil�metros"), CM("Cent�metros"), M("Metros");

	public String titulo;

	/**
	 * Contrutor Enum
	 *
	 * OBS.:  Contrutores Enum's s� podem ser chamados na sua propria class
	 * como est� no exemplo acima.
	 */
	Medida(final String titulo) {
		this.titulo = titulo;
	}
}
