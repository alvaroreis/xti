package br.com.xti.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(final String[] args) throws ParseException {
		// TODO Auto-generated method stub
		final Calendar c = Calendar.getInstance();
		c.set(1996, Calendar.APRIL, 5);
		final Date date = c.getTime();
		System.out.println(date);

		/* FORMATAÇÃO DE DATAS */
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));// Formatando no formato Brasileiro

		/* FORMATAÇÃO DE HORAS */
		final DateFormat t = DateFormat.getTimeInstance();
		System.out.println(t.format(date));// Formatando no formato Brasileiro

		/* FORMATAÇÃO DE DATA E HORA */
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));// formato Brasileiro

		/* Estilos DE DATAS */
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));

		final Date date2 = f.parse("15/02/1991");
		System.out.println(date2);

		/* SimpleDateFormat */

		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.parseObject("10/10/2010"));
	}

}
