package files.move;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Arquivo5 {

	public static void main(final String[] args) throws IOException {
		/*
		final Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();

		for (final Path path : dirs) {
			System.out.println(path);
		}
		 */

		/* Lista o Conteudo de um diretorio */
		/*
		final Path dir = Paths.get("C:/xti");

		//Verifica quais arquivos tem dentro de um diretorio
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (final Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}
		 */

		final FileSystem fs = FileSystems.getDefault();
		for (final FileStore store : fs.getFileStores()) {
			System.out.println("Unidade: " + store);
			System.out.println("Espa�o Total: " + store.getTotalSpace());// espa�o total
			System.out.println("Espe�o Dispon�vel: " + store.getUsableSpace());// espa�o
			System.out.println("Espe�o Utilizado: " + (store.getTotalSpace() - store.getUsableSpace()));// espa�o
			System.out.println();

		}
	}

}
