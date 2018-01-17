package br.com.xti.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(final String[] args) {

		final List<String> list = new ArrayList<>();

		list.add("GUARAN�");
		list.add("UVA");
		list.add("MANGA");
		list.add("COCO");
		list.add("A�A�");
		list.add("BANANA");
		System.out.println(list);

		Collections.sort(list);//ORDENA POR ORDEM ALFABETICA
		System.out.println(list);

		Collections.reverse(list);//ORDENA DE TRAS PARA A FRENTE
		System.out.println(list);

		Collections.shuffle(list);//EMBARALHA OS ELEMENTOS
		System.out.println(list);

		Collections.addAll(list, "CUPUA�U", "LARANJA", "LARANJA");//ADD ELEMENTOS
		System.out.println(list);

		System.out.println(Collections.frequency(list, "LARANJA"));// VERIFICA A FREQUENCIA DA PALAFRA


		final List<String> list2 = Arrays.asList("ACEROLA", "GRAVIOLA");
		final boolean d =  Collections.disjoint(list, list2);//VERIFICA SE OS ELEMENTOS DE LIST2 ESTAO DENTRO DE LIST

		Collections.sort(list);
		final int indice = Collections.binarySearch(list, "GARAN�");
		System.out.println(indice);
		System.out.println(list);

		Collections.fill(list, "A�a�");//IR� COLOCAR A�A� EM TODAS AS POSI��ES
		System.out.println(list);

		/*COLE��O N�O MODIFIC�VEL*/

		final Collection<String> constante = Collections.unmodifiableCollection(list);

	}

}
