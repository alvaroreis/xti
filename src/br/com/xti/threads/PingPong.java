package br.com.xti.threads;

public class PingPong extends Thread {
	String palavra;
	long tempo;

	public PingPong(final String palavra, final long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println(this.palavra);
				Thread.sleep(this.tempo);
			}
		} catch (final InterruptedException e) {
			//e.printStackTrace();
			return;
		}

	}

	public static void main(final String[] args) {
		new PingPong("ping", 1500).start();
		new PingPong("PONG", 2000).start();

		System.out.println("Ver thread");
	}

}
