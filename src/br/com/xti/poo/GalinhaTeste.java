package br.com.xti.poo;

import br.com.xti.heranca.Galinhas;

public class GalinhaTeste {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Galinhas g1 = new Galinhas();
		g1.botar().botar().botar();
		System.out.println(g1.ovos);

		final Galinhas g2 = new Galinhas();
		g2.botar().botar();
		System.out.println(g2.ovos);

		System.out.println(Galinhas.ovosDaGranja);
		System.out.println(Galinhas.mediaDeOvos(2));
	}

}
