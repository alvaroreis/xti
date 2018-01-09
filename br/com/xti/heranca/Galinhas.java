package br.com.xti.heranca;

public class Galinhas {

	public static int ovosDaGranja; // variavel global
	public int ovos; //total de ovos da galinha

	public Galinhas botar() {
		this.ovos++;
		Galinhas.ovosDaGranja++;
		return this; // Retornará o objeto
	}

	public static double mediaDeOvos(final int galinhas) {
		return Galinhas.ovosDaGranja / galinhas;
	}
}
