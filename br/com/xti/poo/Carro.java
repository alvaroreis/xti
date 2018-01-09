package br.com.xti.poo;

public class Carro {
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;

	//Contrutor
	public Carro() {}

	public Carro(final String modelo, final int velocidadeMaxima, final double segundosZeroACem) {
		//		this.modelo = modelo;
		//		this.velocidadeMaxima = velocidadeMaxima;
		//		this.segundosZeroACem = segundosZeroACem;
		this(modelo, velocidadeMaxima, segundosZeroACem, null); // this(parametros) --> faz referencia a outro contrutor
	}

	public Carro(final String modelo, final int velocidadeMaxima, final double segundosZeroACem, final Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
	}

}
