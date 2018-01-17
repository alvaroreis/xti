package br.com.xti.refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursvidade {

	/* 10 + (9 + (8 + (7 + (6 + (5 .... 0))))) */
	public static int soma(final int x) {
		if (x == 0) {
			return x;
		} else {
			System.out.println(x);
			return x + Recursvidade.soma(x - 1);
		}
	}

	/* potencia(3, 3) = 3 * 3 * 3 * 3 */
	public static int potencia(final int x, final int e) {
		if (e == 1) {
			return x;
		} else {
			final int y = x * Recursvidade.potencia(x, e-1);
			System.out.println(y);
			return y;
		}
	}

	public static void listar(final Path path) {
		if(Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			//System.out.println(Files.isDirectory(path));
			final String s = "\n" + path.toAbsolutePath();
			System.err.println(s.toUpperCase()); // diretorios
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				for (final Path p : stream) {
					Recursvidade.listar(p);

				}
			} catch (final Exception e) {
				// TODO: handle exception
			}
		}


	}

	public static void main(final String[] args) {

		//System.out.println(Recursvidade.soma(10));
		System.out.println(Recursvidade.potencia(3, 4));
		Recursvidade.listar(Paths.get("C:/xti/"));
	}

}
