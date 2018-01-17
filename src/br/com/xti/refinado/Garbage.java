package br.com.xti.refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	public static long carregarMemoria() {
		final List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}

		return Runtime.getRuntime().freeMemory();
	}

	public static void main(final String[] args) {

		final Runtime rt  =Runtime.getRuntime();
		final int MB = 1_048_576; //total de bytes em 1MB
		final double total = rt.maxMemory()/MB;//Retorna a quantidade total de memoria disponivel para ser utilizado


		final double inicio = total - (Garbage.carregarMemoria()/MB);

		rt.runFinalization();//Finaliza os metodos e objetos que estam pendente de finalização na memoria
		rt.gc();//Força a execução do garbage collector (Lixeira)

		final double fim = total - (Garbage.carregarMemoria()/MB);
		System.out.println(total);
		System.out.println("Inicio: "+ inicio);
		System.out.println("Fim: "+fim);
	}

}
