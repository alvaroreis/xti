package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(final String[] args) throws IOException {

		final Path path = Paths.get("C:/xti/files/fonte.txt");
		/*
		System.out.println(Files.exists(path));
		System.out.println(Files.isDirectory(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.size(path));
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.getOwner(path));// diz quem é o proprietario
		System.out.println(Files.probeContentType(path));// verifica o tipo de arquivo
		 */


		/* DELETE */
		/*Files.delete(path);// DELETA POREM LANÇA EXCEÇÃO
		Files.deleteIfExists(path);// DELETA SE O ARQUIVO EXISTIR*/

		/*CREATE */
		Files.deleteIfExists(path);
		Files.createFile(path);
		Files.write(path, "Meu Texto".getBytes());

		/*COPY*/
		final Path copia = Paths.get("C:/xti/files/copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);

		/*MOVE*/
		final Path mover = Paths.get("C:/xti/files/move/fonte.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
	}
}