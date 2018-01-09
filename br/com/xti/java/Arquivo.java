package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(final String[] args) throws IOException {

		final Path path = Paths.get("C:/xti/files/texto.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());


		/*CRIAÇÃO DE DIRETORIOS*/
		Files.createDirectories(path.getParent());

		/*ESCREVER E LER ARQUIVOS*/
		final byte[] bytes = "MEU TEXTO".getBytes();
		Files.write(path, bytes);//Cria, limpa e escreve no arquivo
		final byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
	}

}
