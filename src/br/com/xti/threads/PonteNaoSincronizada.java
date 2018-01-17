package br.com.xti.threads;

public class PonteNaoSincronizada implements Ponte{
	private int valor = -1;
	@Override
	public void set(final int valor) throws InterruptedException {
		System.out.print("Produziu " + valor);
		this.valor = valor;
	}

	@Override
	public int get() throws InterruptedException {
		System.err.print("Consumiu " + this.valor);
		return this.valor;
	}

}
