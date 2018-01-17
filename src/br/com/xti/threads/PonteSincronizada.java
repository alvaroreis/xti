package br.com.xti.threads;

public class PonteSincronizada implements Ponte {
	private int valor = -1;
	private boolean ocupada = false;

	@Override
	public synchronized void set(final int valor) throws InterruptedException {
		//Enquanto a ponte estiver OCUPADA esse método fara ela esperar
		while (this.ocupada) {
			System.out.println("Ponte cheia. Produtor deve aguardar.");
			this.wait();//faz com que a thread aguarde
		}

		System.out.print("Produziu " + valor);
		this.valor = valor;
		this.ocupada = true;
		this.notifyAll();//Avisa todas as threads que estam aguardando que elas podem continuar sua execução
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while (!this.ocupada) {
			System.out.println("Ponte vazia. Consumidor aguardando.");
			this.wait();
		}
		System.err.print("Consumiu " + this.valor);
		this.ocupada = false;
		this.notifyAll();
		return this.valor;
	}

}
