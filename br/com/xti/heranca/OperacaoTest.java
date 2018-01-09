package br.com.xti.heranca;

public class OperacaoTest {
	//Polimorfismo
	public static void calcular(final OperacaoMatematica o, final double x, final double y) {
		System.out.println(o.calcule(x, y));
	}

	public static void calcularSemPolimorfismo(final String o, final double x, final double y) {
		if(o.equals("Soma")) {
			System.out.println(x + y);
		} else if(o.equals("Mulplicacao")) {
			System.out.println(x * y);
		}//...
	}
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		OperacaoTest.calcular(new Soma(), 5, 5);
		OperacaoTest.calcular(new Multiplicacao(), 5, 5);

		OperacaoTest.calcularSemPolimorfismo("Soma", 5, 5);
	}

}
