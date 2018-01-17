package br.com.xti.java;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(final String[] args) {
		final List<String> list = new ArrayList();
		list.add("FUTEBOL");
		list.add("BASQUETE");
		list.add("TÊNIS");
		list.add("VOLEI");
		list.add("NATAÇÃO");
		list.add("HOCKEY");
		list.add("BOXE");
		list.add("FUTEBOL");
		System.out.println(list.toString());

		for(int i=0; i < list.size(); i++) {
			final String letra = list.get(i);
			list.set(i, letra.toLowerCase());
		}

		System.out.println(list.indexOf("boxe"));
		System.out.println(list.subList(2, 4));
		list.subList(2, 4).clear();
		System.out.println(list.toString());

	}

}
