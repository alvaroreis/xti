package br.com.xti.java;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(final String[] args) throws ParseException {

		final double saldo= 123_456.789;

		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));//genérico

		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));//Inteiro

		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));//Percentual

		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));//Moeda

		f.setMaximumFractionDigits(3);//Uma casa decimal
		System.out.println(f.format(saldo));//Moeda

		/*INTERNACIONALIZAÇÃO DE NUMEROS*/
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));//Moeda USA

		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));//Moeda FRANÇA

		/*CONVERSÃO DE VALORES*/
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.parse("R$ 1.100,25"));
	}

}
