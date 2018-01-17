package br.com.xti.poo;

public class DebugExemplo {

	int resultado;

	public int raiz(int numero) {
		int raiz = 0, impar = 1;
		while (numero > impar) {
			numero -= impar;
			impar += 2;
			raiz++;
		}
		return raiz;
	}

	public static void main(final String[] args) {

		final int numero = 16;
		final DebugExemplo exemplo =  new DebugExemplo();
		final int raiz = exemplo.raiz(numero);

		if(raiz == 4) {
			System.out.println("Raiz correta!");
		}
	}

}
