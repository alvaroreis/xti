package br.com.xti.logica;
public class FluxoIf {

	public static void main(final String[] args) {
		/*
       int idade = 31;
        if(idade <= 11 ) {
            System.out.println("Crianca");
        } else if (idade > 11 && idade <= 18 ){
            System.out.println("Adolescente");
        } else if (idade > 18 && idade <= 60 ){
            System.out.println("Adulto");
        } else {
            System.out.println("Melhor idade");
        }
    -----------------
        int  numero = 11;
        if ((numero % 2) == 0) {
            System.out.println("par");
        } else {
            System.out.println("Impar");
        }
    -------------
		 */
		final int nota = 2;

		if(nota >= 7 ) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovou");
			if(nota >= 6 ){
				System.out.println("Porem pode fazer a recuperacao");
			}
		}
	}
}