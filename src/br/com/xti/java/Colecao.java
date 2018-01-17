package br.com.xti.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(final String[] args) {

		final Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("A"));


		c.remove("A");
		System.out.println(c.toString());


		/* GRUPOS */

		final Collection<String > c2 = Arrays.asList("O", "U");//Converte um array em uma cole��o
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2));// verifica se contem todos elementos da cole��o c2 na c
		System.out.println(c.removeAll(c2));// remove todos os elementos

		/*PERCORRER OS ELELMENTOS*/
		for(final String string: c) {
			System.out.println(string);
		}

		/*Converter cole��o em array*/
		final String[] s = c.toArray(new String[c.size()]);//Converte uma cole��o em um array
		System.out.println(Arrays.toString(s));

		c.clear();//limpa a cole��o
		System.out.println(c.toString());




	}

}
