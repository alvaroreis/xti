package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Serializa2 {

	private final Conta conta = new Conta();

	public void armazenarContas(final ArrayList<Conta> contas) throws IOException {

		// cria o arquivo com o Cliente, Saldo;
		try (FileOutputStream fos = new FileOutputStream("C:/xti/files/contas.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas);
			}
		}
	}

	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream("C:/xti/files/objeto.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<Conta>) ois.readObject();
			}

		}

	}

	/*Método main*/
	public static void main(final String[] args) {
		// add contas
		final ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Carlos", 12000.23));
		contas.add(new Conta("Alvaro", 11500));
		contas.add(new Conta("Larissa", 10000));
		contas.add(new Conta("Paula", 5000));
		contas.add(new Conta("Eunice", 15000));

		// Armazena conta
		final Arquivo3_2 operacao = new Arquivo3_2();
		operacao.armazenarContas(contas);

		// exibe conta
		final ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (final Conta conta : contas2) {
			conta.exibeSaldo();
		}

	}
}
