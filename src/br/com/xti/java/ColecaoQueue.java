package br.com.xti.java;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(final String[] args) {

		final Queue<String> fila = new LinkedList<>();
		//TANTO ADD COM OFFER ADICIONAM ELEMENTOS NO FINAL DA FILA
		fila.add("Alvaro");
		fila.add("Paula");
		fila.offer("Larissa");
		System.out.println(fila);

		System.out.println(fila.peek());//TRAS O PROXIMO ELEMENTO DA FILA
		System.out.println(fila.poll());//REMOVE O PROXIMO ELEMENTO DA FILA
		System.out.println(fila);

		/*OUTROS MÉTODOS DISPONÍVES LinkedList*/
		final LinkedList<String> f = new LinkedList<>();
		f.addLast("Reis");//ADD NO FIM DA FILA
		f.addFirst("Barros");//ADD NO ÍNICIO DA FILA
		System.out.println(f);

		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());

		System.out.println(f.pollFirst());
		System.out.println(f.pollLast());


	}

}
