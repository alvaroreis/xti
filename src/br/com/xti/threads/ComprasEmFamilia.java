package br.com.xti.threads;

public class ComprasEmFamilia implements Runnable {

	ContaConjunta conta = new ContaConjunta();

	public static void main(final String[] args) {
		final ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "Mãe").start();
		new Thread(irAsCompras, "Filho").start();
		new Thread(irAsCompras, "Filha").start();
	}

	@Override
	public void run() {
		final String cliente = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			this.conta.sacar(20, cliente);
			if (this.conta.getSaldo() < 0) {
				System.out.println("Estourou!");
			}
		}
	}

}
