package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(final Scanner s) throws InputMismatchException, ArithmeticException {
		System.out.print("Numero: ");
		final int a = s.nextInt();
		System.out.print("Divisor: ");
		final int b = s.nextInt();

		System.out.println(a / b);
	}

	public static void main(final String[] args) {
		final Scanner s = new Scanner(System.in);
		boolean continua = true;

		do {

			try {
				DividePorZero.dividir(s);
				continua = false;

			} catch (final InputMismatchException | ArithmeticException e1) {
				System.err.println("Número invalido!");
				e1.getStackTrace();
				s.nextLine();// descarta a entrada que deu erro e libera novamente a entrada
			} finally {
				System.out.println("Finally Executado!");// Este bloco sempre sera executado
			}

		} while (continua);
	}
}
