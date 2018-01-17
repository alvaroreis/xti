package br.com.xti.threads;

import java.util.Random;

public class Produtor implements Runnable {
	private final Ponte ponte;
	Random random = new Random();

	public Produtor(final Ponte ponte) {
		this.ponte = ponte;
	}

	@Override
	public void run() {
		int total = 0;
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(this.random.nextInt(3000));
				total += i;
				this.ponte.set(i);
				System.out.println("\t" + total);
			}
		} catch (final InterruptedException e) {}

	}

}
