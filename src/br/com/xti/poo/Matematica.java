package br.com.xti.poo;

public class Matematica {

	/**
	 *
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	public int maior(final int um, final int dois) {
		if(um > dois) {
			return um;
		} else {
			return dois;
		}
	}

	public double soma(final double ... numeros) {
		double total = 0;
		for(final double n: numeros) {
			total += n;
		}
		return total;
	}

	public int raiz(int valor) {
		int raiz = 0;
		int numero = 1;
		do {
			valor -= numero;
			numero += 2;
			raiz++;
		} while (valor > numero);

		return raiz;
	}

	public int raiz2(int numero) {
		int raiz = 0;
		int impar = 1;

		while(numero >= impar ) {
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;
	}

	// Métodos Sobrecarregados

	double media(final double x) {
		System.out.print("media(final double x) ");
		return x;
	}

	double media(final double x, final double y) {
		System.out.print("media(final double x, final double y) ");
		return (x + y)/2;
	}

	double media(final double ...numeros) {
		System.out.print("media(final double ...numeros) ");
		return this.soma(numeros)/numeros.length;
	}

	double  media( final String x,  final String y) {
		System.out.print(" media( final String x,  final String y) ");
		final double ix = Double.parseDouble(x);
		final double iy = Double.parseDouble(y);
		return (ix+iy)/2;
	}
}
