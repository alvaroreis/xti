package br.com.xti.redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {
	public static void main(final String[] args) throws Exception {
		/** not use Port = 0 - 1023 ---- internet, email, ftp, smtp
		 *
		 */

		//Cria conex�o com o servidor
		final Socket socket = new Socket("127.0.0.1", 5000);//Socket (Endere�o, porta)
		try(Scanner s = new Scanner(socket.getInputStream())){
			System.out.println("Mensage: "+ s.nextLine());
		}
	}
}
