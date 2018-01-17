package br.com.xti.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflexao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(final String[] args) throws Exception {

		final String nome = "br.com.xti.poo.Conta";

		final Class classe = Class.forName(nome);

		//Pega o nome simplificado da class = Conta
		System.out.println(classe.getSimpleName());

		//Verifica os atibutos publicos que existem na class
		final Field[] f = classe.getFields();
		for (final Field field : f) {
			System.out.println(field);
		}

		//Verica todos os métodos
		final Method[] m = classe.getDeclaredMethods();
		for (final Method method : m) {
			System.out.println(method.getName());
		}

		//Verica todos os contrutores
		final Constructor[] c = classe.getConstructors();
		for (final Constructor contructor : c) {
			System.out.println(contructor);
		}


		/*Contruir métodos com o contrutor vazio*/
		final Object o = classe.newInstance();
		final Method md = classe.getDeclaredMethod("deposita", double.class);
		final Method me = classe.getDeclaredMethod("exibeSaldo");
		md.invoke(o, 120);
		me.invoke(o);

		/*Contruir métodos com o contrutor parametrizado*/
		final Constructor co = classe.getConstructor(String.class, double.class);
		final Object obj = co.newInstance("Alvaro", 123_123_123);
		me.invoke(obj);
	}

}
