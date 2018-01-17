package br.com.xti.redes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame {

	JTextField textoParaEnviar;
	Socket socket;
	PrintWriter escritor;
	String nome;
	JTextArea textoRecebido;
	Scanner leitor;

	private class EscutaServidor implements Runnable {

		@Override
		public void run() {
			String texto;

			try {
				while ((texto = ChatCliente.this.leitor.nextLine()) != null) {
					ChatCliente.this.textoRecebido.append(texto + "\n");
				}
			} catch (final Exception e) {
			}
		}

	}

	public ChatCliente(final String nome) {
		super("Chat: " + nome);
		this.nome = nome;

		final Font font = new Font("Serif", Font.PLAIN, 26);
		this.textoParaEnviar = new JTextField();
		this.textoParaEnviar.setFont(font);
		final JButton botao = new JButton("Enviar");
		botao.setFont(font);
		botao.addActionListener(new EnviarLitener());
		final JPanel envio = new JPanel();
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER, this.textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);

		this.textoRecebido = new JTextArea();
		this.textoRecebido.setFont(font);
		final JScrollPane scroll = new JScrollPane(this.textoRecebido);

		this.getContentPane().add(BorderLayout.CENTER, scroll);
		this.getContentPane().add(BorderLayout.SOUTH, envio);

		this.configuarRede();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}

	private class EnviarLitener implements ActionListener {

		@Override
		public void actionPerformed(final ActionEvent e) {
			ChatCliente.this.escritor
			.println(ChatCliente.this.nome + " : " + ChatCliente.this.textoParaEnviar.getText());
			ChatCliente.this.escritor.flush();
			ChatCliente.this.textoParaEnviar.setText("");
			ChatCliente.this.textoParaEnviar.requestFocus();
		}

	}

	private void configuarRede() {
		try {
			this.socket = new Socket("127.0.0.1", 5000);
			this.escritor = new PrintWriter(this.socket.getOutputStream());
			this.leitor = new Scanner(this.socket.getInputStream());
			new Thread(new EscutaServidor()).start();

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(final String[] args) {
		new ChatCliente("Alvaro");
		new ChatCliente("Paula");
	}

}
