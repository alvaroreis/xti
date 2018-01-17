package br.com.xti.threads;

public class ContaConjunta {
	private int saldo = 100;

	public int getSaldo() {
		return this.saldo;
	}

	/*synchronized = sincroniza as threads fazendo com que a outra so
	seja executada após o termino dessa */
	public synchronized void sacar(final int valor, final String cliente) {
		if (this.saldo >= valor) {
			final int saldoOriginal = this.saldo;
			System.out.println(cliente + " vai sacar!");
			try {
				System.out.println(cliente + " esperando...");
				Thread.sleep(1000);//aguardando processamento
			} catch (final InterruptedException e) {
				return;
			}
			this.saldo -= valor;
			final String msg = cliente + " SACOU " + valor + " [Saldo Original= " +
					saldoOriginal + ", Saldo Final= " + this.saldo + "]";
			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}
	}
}
