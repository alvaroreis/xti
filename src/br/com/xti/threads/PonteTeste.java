package br.com.xti.threads;

public class PonteTeste {

	public static void main(final String[] args) {

		final Ponte ponte = new PonteSincronizada();

		new Thread(new Produtor(ponte), "Produtor").start();;
		new Thread(new Consumidor(ponte), "Consumidor").start();;
	}

}
