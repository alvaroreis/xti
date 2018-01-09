package br.com.xti.poo;

public class EnumTest {
	public static final double PI = 3.14;

	public static void andar(final Medida medida, final int total) {
		if(medida == Medida.M) {
			//Codigo .... este é apenas um exemplo
		}
	}

	public static void main(final String[] args) {
		System.out.println(PecasXadrez.BISPO);
		System.out.println(Medida.M.titulo);

		for(final Medida m : Medida.values()) { //enum.values() retorna um array do obj
			System.out.println(m +" : "+ m.titulo);
		}

		//Chamano o método de um enum
		EnumTest.andar(Medida.M, 100);
	}
}
