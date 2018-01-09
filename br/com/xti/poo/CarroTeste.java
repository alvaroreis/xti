package br.com.xti.poo;

public class CarroTeste {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Carro ferrari = new Carro();
		ferrari.modelo =  "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;

		final Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;

		ferrari.motor = v12; // Add o motor ao carro

		final Carro k = new Carro("Koenigsegg CCXR", 430,3.1);
		final Motor v8 = new Motor("V8", 1018);
		k.motor = v8;

		final Carro bugatti = new Carro("Bugatti Veyro", 430, 2.2, new Motor("W16", 1200));
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);
		System.out.println(k.modelo +"\n" + ferrari.modelo);
	}

}
