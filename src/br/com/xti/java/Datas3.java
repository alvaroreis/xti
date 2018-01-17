package br.com.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(final String[] args) {

		final Calendar c = Calendar.getInstance();
		c.set(1996, Calendar.APRIL, 5);
		final Date date = c.getTime();

		/**
		 * Língua	(ISO 639) -> Encontrar lista de linguas
		 * País		(ISO 3166) -> Encontrar lista de paises
		 */
		final Locale padrao = Locale.getDefault();
		final Locale brasil = new  Locale("pt", "BR");
		final Locale india = new  Locale("hi", "IN");
		final Locale eua = Locale.US;
		final Locale japan = Locale.JAPAN;
		final Locale italia = Locale.ITALIAN;

		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));//brasil

		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(f.format(date));//brasil

		f = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f.format(date));//india

		f = DateFormat.getDateInstance(DateFormat.FULL, eua);
		System.out.println(f.format(date));//USA

		f = DateFormat.getDateInstance(DateFormat.FULL, japan);
		System.out.println(f.format(date));//JAPAN

		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(f.format(date));//Italia
	}

}
