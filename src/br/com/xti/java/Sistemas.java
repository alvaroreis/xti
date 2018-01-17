package br.com.xti.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	public static void main(final String[] args) throws IOException {

		final Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));

		p.setProperty("xti.curso.java.version", "1.0.0");

		final Set<Object> pk = p.keySet(); for(final Object key: pk) {
			System.out.println(key +" = " + p.get(key)); }

		final Console c = System.console();
		System.out.print("Usuário: ");
		final String user = c.readLine();

		System.out.print("Senha: ");
		final char[] pass = c.readPassword();
		System.out.println("user = " + user + "\nsenha = " + new String(pass));


		Runtime.getRuntime().exec("notepad");
	}

}
