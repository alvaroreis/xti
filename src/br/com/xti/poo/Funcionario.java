package br.com.xti.poo;

public class Funcionario {

	private String nome;
	private double salario;
	private boolean ativo;


	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return this.ativo;
	}
	public void setAtivo(final boolean ativo) {
		this.ativo = ativo;
	}
}
