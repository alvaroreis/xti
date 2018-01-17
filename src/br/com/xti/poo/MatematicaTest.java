package br.com.xti.poo;

public class MatematicaTest {

	public static void main(final String[] args) {

		final Matematica m = new Matematica();
		final int ma = m.maior(10, 20);
		System.out.println(ma);

		final double so = m.soma(10, 20,50,60,100,200);
		System.out.println("Total: " + so);

		final int  ra = m.raiz(276);
		System.out.println(ra);

		final int ra2 = m.raiz2(276);
		System.out.println(ra2);

		final double math = Math.sqrt(276);
		System.out.println(math);
	}

}
