package br.com.xti.heranca;

import br.com.xti.poo.Galinha;

public class AnimalTest {

	public static void barulho(final Animal animal) { //polimorfismo
		animal.fazerBarulho();
	}

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Animal toto = new Cachorro();
		toto.comida = "Carne";
		AnimalTest.barulho(toto);
		toto.dormir();


		final Animal carijo = new Galinha();
		AnimalTest.barulho(carijo);
		carijo.dormir();

	}

}
