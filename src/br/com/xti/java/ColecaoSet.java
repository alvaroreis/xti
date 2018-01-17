package br.com.xti.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(final String[] args) {

		final String[] cores = {"verde", "amarelo", "azul", "branco",
				"azul", "amarelo", "verde"};

		final List<String> list = Arrays.asList(cores);//PERMITE ELEMENTO DUPLICADOS
		System.out.println(list);

		final Set<String> set = new HashSet<>(list);//NÃO PERMITE ELEMENTO DUPLICADOS
		System.out.println(set);

	}

}
