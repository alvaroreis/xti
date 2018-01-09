package br.com.xti.java;

public class StringOperacoes {

	public static void main(final String[] args) {

		final String s1 = "Write once";
		final String s2 = s1+ "run anywhere";
		final String s3 = new String("Java Virtual Machine");

		final char[] array = {'J', 'A', 'V', 'A'};
		final String s4 = new String(array);

		//OPERAÇÕES
		final int tamanho = s1.length();
		final char letra = s1.charAt(0);
		final String texto = s1.toString();

		//LOCALIZAÇÃO
		final int posicao = s3.indexOf("Virtual");//Retorna o numero da posição que esta a letra ou palavra
		final int ultima = s3.lastIndexOf('a');//Retorna o numero da ultima posição que esta a letra ou palavra
		final boolean vazia = s3.isEmpty();
		//System.out.println(posicao);

		//COMPARAÇÃO
		final String xti = "XTI";
		//final boolean comparaString = xti.equals("xti");
		//final boolean comparaString = xti.equalsIgnoreCase("xti");
		//final boolean comparaStringQueInicia = xti.startsWith("TI");
		//final boolean comparaStringQueTermina = xti.endsWith("TI");
		//final boolean comparaObjetos = xti == "xti";
		//System.out.println(comparaStringQueInicia);

		//final int c = "amor".compareTo("bola");
		//final int c = "bola".compareTo("amor");
		//System.out.println(c);

		final String olhe = "Olhe, olhe!";
		//final boolean o = olhe.regionMatches(6, "Olhe", 0, 4);//Não ignora case sensitive
		final boolean o = olhe.regionMatches(true, 6, "Olhe", 0, 4);//O "true" ignora case sensitive
		//System.out.println(o);

		//EXTRAÇÃO E MODIFICAÇÃO DE DADOS
		final String l = "O Brasil é lindo!";
		String sl = l.substring(11);
		sl = l.substring(2, 8);
		sl = l.concat(" que Maravilha");//Concatena a string
		sl = l.replace('s', 'z');// substitui letra da string
		//sl = l.replaceFirst(" ", "X");// substitui o primeiro espaço em branco
		//sl = l.replaceAll(" ", "X");// substitui o todos os pespaço em branco
		sl = l.toUpperCase();
		sl = l.toLowerCase();
		System.out.println("     tira os espaço em branco    ".trim());

	}

}
