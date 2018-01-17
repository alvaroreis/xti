package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Arquivo3 {
	public void armazenarContas(final ArrayList<Conta> contas) {
		// Caminho para salvar o arquivo
		final Path path = Paths.get("C:/xti/files/contas.txt");
		final Charset utf8 = StandardCharsets.UTF_8;

		// cria o arquivo com o Cliente, Saldo;
		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			for (final Conta conta : contas) {
				writer.write(conta.getCliente() + " II " + "," + conta.getSaldo() + ";\n");
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(final String[] args) {
		final Conta conta = new Conta();

		final ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Carlos", 12000.23));
		contas.add(new Conta("Alvaro", 11500));
		contas.add(new Conta("Larissa", 10000));
		contas.add(new Conta("Paula", 5000));
		contas.add(new Conta("Eunice", 15000));

		// Exibe lista Original
		for (final Conta c1 : contas) {
			System.err.println(c1.getCliente() + " " + c1.getSaldo());
		}

		// Caminho para salvar o arquivo
		final Path path = Paths.get("C:/xti/files/contas.txt");
		final Charset utf8 = StandardCharsets.UTF_8;

		// cria o arquivo com o Cliente, Saldo;
		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			for (final Conta account : contas) {
				writer.write(account.getCliente() + " II " + "," + account.getSaldo() + ";\n");
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}

		// Ler o aquivo Txt
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;

			// Ler linha por linha do txt
			while (((line = reader.readLine()) != null)) {
				if (line != null) {

					// Expressão regular para tirar tudo depois da virgula
					final String[] splintedCliente = line.split(",\\d+.\\d+;");
					// Expressão regular para tirar tudo menos o que esta entre a virgula e o ponto
					// e virgula
					final String[] splintedSaldo = line.split("[\\w+,;$&&[^\\d+]]");

					// Itera com expressão regular de contatos
					for (final String cliente : splintedCliente) {
						conta.setCliente(cliente);
						// System.out.println(conta.getCliente());
					}
					// Itera com expressão regular de saldo
					for (final String saldo : splintedSaldo) {
						if (!saldo.trim().equals("")) {
							conta.setSaldo(Double.parseDouble(saldo));
							// System.out.println(conta.getSaldo() + " Novo ");
						}
					}
					System.out.println(conta.getCliente() + " " + conta.getSaldo());
				}
			}

		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
