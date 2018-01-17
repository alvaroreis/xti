package br.com.xti.redes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(final String[] args) throws Exception {

		//Disponibiliza uma porta para o servidor responder as requisições
		final ServerSocket server = new ServerSocket(5000);
		while (true) {
			//server.accept() = aguarada a chegada de um cliente
			final Socket socket = server.accept();
			try(PrintWriter w = new PrintWriter(socket.getOutputStream())){
				w.println("Aprenda Java e seja contratado");
			}
		}
	}

}
