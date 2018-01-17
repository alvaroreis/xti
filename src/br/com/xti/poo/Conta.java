package br.com.xti.poo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Conta implements Serializable {
	public String cliente;
	public double saldo;
	transient double saldo2;//transient impede que o saldo seja serializado

	public Conta() {
	}

	public Conta(final String cliente, final double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(final String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(final double saldo) {
		this.saldo = saldo;
	}

	public void exibeSaldo() {
		System.out.println(this.cliente + " seu saldo: " + this.saldo);
	}

	public void saca(final double valor) {
		this.saldo -= valor;
	}

	public void deposita(final double valor) {
		this.saldo += valor;
	}

	public void transferePara(final Conta contaDestino, final double valor) {
		// this.saldo -= valor;
		// contaDestino.saldo += valor;
		this.saca(valor);
		contaDestino.deposita(valor);
	}

}
