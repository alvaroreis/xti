package br.com.xti.java;

public class StringMutavel {

	public static void main(final String[] args) {
		//posssuem os mesmos metodos, porem uma e sincrona e a outra é assincrona.
		final StringBuffer  s0 = new StringBuffer(); // Métordos sincronizados
		final StringBuilder s1 = new StringBuilder("JAVA"); // Métordos não sincronizados

		s1.toString();
		//System.out.println(s1);
		s1.length();
		//System.out.println(s1.length());
		s1.capacity();
		//System.out.println(s1.capacity());
		//s1.reverse();
		s1.append(" Trabalhando "); // append adiciona textos.
		final char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" textos.");
		System.out.println(s1);

		final String url = new StringBuilder("www.xti.com.br")
				.delete(0, 4).toString();// .delete remove as strings indexadas nas posições indicadas
		System.out.println(url);
	}

}
