package br.com.xti.refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {
	JButton botao;

	public Aninhamento() {
		super("Aninhamento");

		this.botao = new JButton("OK");
		//Classe aninhada (Criada dentro de alguma class)
		this.botao.addActionListener(new ListenerAninhado());
		//Classe anonima (Criada sem nome)
		this.botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(final ActionEvent e) {
				System.out.println("Classe aninhada executa " + Aninhamento.this.botao.getText());
			}
		});

		this.getContentPane().add(this.botao);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	// Classe aninhada
	public class ListenerAninhado implements ActionListener {

		@Override
		public void actionPerformed(final ActionEvent e) {
			System.out.println("Classe aninhada executa " + Aninhamento.this.botao.getText());
		}

	}

	public static void main(final String[] args) {
		final Aninhamento janela = new Aninhamento();

		//Classe aninhada Evolvente
		final Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();
	}

}
