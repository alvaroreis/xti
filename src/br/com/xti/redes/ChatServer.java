package br.com.xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

	List<PrintWriter> escritores = new ArrayList<>();


	public ChatServer() {
		ServerSocket server;
		try {
			server = new ServerSocket(5000);
			while (true) {
				final Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				final PrintWriter p = new PrintWriter(socket.getOutputStream());
				this.escritores.add(p);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private void encaminhaParaTodos(final String texto) {
		for (final PrintWriter w : this.escritores) {
			try{
				w.println(texto);
				w.flush();
			} catch (final Exception e) {
			}
		}
	}
	@SuppressWarnings("unused")
	private class EscutaCliente implements Runnable {
		Scanner leitor;
		public EscutaCliente(final Socket socket) {
			try {
				this.leitor = new Scanner(socket.getInputStream());
			} catch (final Exception e) {}
		}

		@Override
		public void run() {
			String texto;
			while ((texto = this.leitor.nextLine()) != null) {
				System.out.println(texto);
				ChatServer.this.encaminhaParaTodos(texto);
			}
		}

	}

	public static void main(final String[] args) {
		new ChatServer();
	}

}
