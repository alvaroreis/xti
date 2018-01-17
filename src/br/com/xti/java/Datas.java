package br.com.xti.java;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(final String[] args) {

		/*01 Jan 1970*/
		System.out.println(System.currentTimeMillis());

		final Date agora = new Date();
		System.out.println(agora);

		final Date data = new Date(1_000_000_000_000L);
		System.out.println(data);


		/*Métodos*/
		data.getTime(); // recupera o tempo atual em milisegundos
		data.setTime(1_000_000_000_000L);//define um tempo em milisegundos
		// compara a data atual com outra data
		System.out.println(data.compareTo(agora));// se for menor = -1; se forem iguais = 0; se for maior = 1;

		/*Manipuando datas*/
		/*GregorianCalendar*/
		final Calendar c = Calendar.getInstance();
		c.set(1996, Calendar.APRIL, 5);
		System.out.println(c.getTime());

		/*PEGA*/
		System.out.println(c.get(Calendar.YEAR));//ano
		System.out.println(c.get(Calendar.MONTH));//mes 0 á 11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//dia do mes

		/*ATRIBUÍ*/
		c.set(Calendar.YEAR, 2001);//Altera o ano
		c.set(Calendar.MONTH,Calendar.SEPTEMBER);//Altera o mes
		c.set(Calendar.DAY_OF_MONTH, 11);//Altera o dia
		System.out.println(c.getTime());

		/*LIMPA*/
		c.clear(Calendar.SECOND);//Limpa compo de segundos
		c.clear(Calendar.MINUTE);//Limpa compo de minutos
		System.out.println(c.getTime());

		/*ADICIONA UNIDADES*/
		c.add(Calendar.DAY_OF_MONTH, 1);//altera o dia alterarando o mes se ultrapassar os dias daquele mes
		c.roll(Calendar.DAY_OF_MONTH, 20);//altera apenas dias sem alterar o mes
		c.add(Calendar.YEAR, 1);
		System.out.println(c.getTime());

		/*DIMINUI UNIDADES*/
		c.add(Calendar.DAY_OF_MONTH, -1);
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());

		final Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		final int hora = c1.get(Calendar.HOUR_OF_DAY);
		if(hora < 12 ) {
			System.out.println("Bom dia");
		} else if ((hora > 12) && (hora < 18) ) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite");
		}

	}

}
