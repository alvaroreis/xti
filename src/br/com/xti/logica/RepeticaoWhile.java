package br.com.xti.logica;
import java.util.ArrayList;
import java.util.Scanner;

public class RepeticaoWhile {
	public static void main(final String[] args) {

		final ArrayList<String> produtos = new ArrayList<>();
		final Scanner s = new Scanner(System.in);
		System.out.println("Liste seu produtos : para sair digite FIM.");

		String produto;
		while(!"FIM".equals(produto = s.nextLine())){
			produtos.add(produto);
		}
		System.out.println(produtos.toString());

		/* FLUXO WHILE
        while é executado 0 ou mais vezes

        int i=0;
        while(i < 2){
            System.out.println(i);
            i++;
        };

        /* FLUXO DO{...} WHILE()
        while é executado 1 ou mais vezes

        do {
            System.out.println(i);
            i++;
        } while(i < 2);
		 */
	}
}