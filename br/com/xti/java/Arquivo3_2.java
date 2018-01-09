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

public class Arquivo3_2 {

	// Caminho para salvar o arquivo
	private final Path path = Paths.get("C:/xti/files/contas3_2.txt");
	private final Charset utf8 = StandardCharsets.UTF_8;

	private final Conta conta = new Conta();

	public void armazenarContas(final ArrayList<Conta> contas) {

		// cria o arquivo com o Cliente, Saldo;
		try (BufferedWriter writer = Files.newBufferedWriter(this.path, this.utf8)) {
			for (final Conta conta : contas) {
				writer.write(conta.getCliente() + "," + conta.getSaldo() + "\n");
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Conta> recuperarContas() {

		final ArrayList<Conta> contas = new ArrayList<>();
		// Ler o aquivo Txt
		try (BufferedReader reader = Files.newBufferedReader(this.path, this.utf8)) {
			String line = null;

			// Ler linha por linha do txt
			while (((line = reader.readLine()) != null)) {

				// Expressão regular para tirar tudo depois da virgula
				final String[] splinted = line.split(",");

				//Gera um array com os arquivos do txt
				final Conta conta = new Conta(splinted[0], Double.parseDouble(splinted[1]));
				contas.add(conta);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return contas;
	}

	//Método main
	public static void main(final String[] args) {
		//add contas
		final ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Carlos", 12000.23));
		contas.add(new Conta("Alvaro", 11500));
		contas.add(new Conta("Larissa", 10000));
		contas.add(new Conta("Paula", 5000));
		contas.add(new Conta("Eunice", 15000));

		//Armazena conta
		final Arquivo3_2 operacao = new Arquivo3_2();
		operacao.armazenarContas(contas);

		//exibe conta
		final ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (final Conta conta : contas2) {
			conta.exibeSaldo();
		}

	}
}
