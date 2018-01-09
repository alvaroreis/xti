package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(final String[] args) throws IOException {

		final Path path = Paths.get("C:/xti/files/texto.txt");
		final Charset utf8 = StandardCharsets.UTF_8;

		/* ESCRITA */
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Outros Texto\n");
			w.write("Outros Texto\n");
			// w.flush();//grava no dico rigido
		} catch (final IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
