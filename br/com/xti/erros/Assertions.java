package br.com.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(final String[] args) {

		final Scanner s = new Scanner(System.in);
		System.out.println("Informe um n�mero de 0 a 10.");
		final int numero  = s.nextInt();

		assert((numero >= 0) && (numero <= 10)) : "N�mero " + numero+ " inv�lido ";
		System.out.println("Voc� entrou " + numero);

	}

}
