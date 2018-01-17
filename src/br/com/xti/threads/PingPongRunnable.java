package br.com.xti.threads;

public class PingPongRunnable implements Runnable {
	String palavra;
	long tempo;

	public PingPongRunnable(final String palavra, final long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<100; i++) {
				System.out.println(this.palavra);
				Thread.sleep(this.tempo);
			}
		} catch (final InterruptedException e) {
			//e.printStackTrace();
			return;
		}

	}

	public static void main(final String[] args) {

		final Runnable ping = new PingPongRunnable("ping", 1500);
		final Runnable pong = new PingPongRunnable("PONG", 2000);

		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();

		System.out.println("Ver thread");
	}

}
