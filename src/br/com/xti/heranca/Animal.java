package br.com.xti.heranca;

public abstract class Animal {

	//foto;
	double peso;
	String comida;

	//public Animal() {this(0, null);}

	public Animal(final double peso, final String comida) {
		this.peso = peso;
		this.comida = comida;
	}

	public void comer() {
		System.out.println("Comendo");
	}

	public void dormir() {
		System.out.println("Dormiu... Zzz");
	}

	public void movimentar(final double distancia) {
		System.out.println("Se movimentou " + distancia + "m.");
	}

	public abstract void fazerBarulho();
}
