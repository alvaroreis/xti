package br.com.xti.heranca;

public class Ave extends Animal{

	public Ave() {
		super(2, "milhor");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Fez barulho");
	}

	public void voar() {
		System.out.println("Voando");
	}

	public void botar() {
		System.out.println("Botou um ovo!");
	}
}
