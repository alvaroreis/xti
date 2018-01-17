package br.com.xti.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(final String[] args) {

		final Map<String, String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("RU", "Rússia");
		pais.put("IN", "Índia");
		pais.put("CN", "China");

		System.out.println(pais);

		System.out.println(pais.containsKey("BR"));//VERIFICA SE CONTEM ESSE ELEMNETO
		System.out.println(pais.containsValue("Brasil"));//VERIFICA SE CONTEM ESSE VALOR
		System.out.println(pais.get("CN"));//PEGA O VALOR DA KEY INFORMADA
		pais.remove("RU");//REMOVE
		System.out.println(pais);

		final Set<String> keys = pais.keySet();
		for (final String key : keys) {
			System.out.println(key+": "+pais.get(key));
		}

	}

}
