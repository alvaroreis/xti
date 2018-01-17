package br.com.xti.jdbc;

public class Conta {
	int numero;
	String cliente;
	double saldo;
	public Conta(final int numero, final String cliente, final double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return this.numero +", "+this.cliente+", "+ this.saldo;
	}
}
