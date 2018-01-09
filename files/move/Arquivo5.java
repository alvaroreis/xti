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
			System.out.println("Espaço Total: " + store.getTotalSpace());// espaço total
			System.out.println("Espeço Disponìvel: " + store.getUsableSpace());// espaço
			System.out.println("Espeço Utilizado: " + (store.getTotalSpace() - store.getUsableSpace()));// espaço
			System.out.println();

		}
	}

}
