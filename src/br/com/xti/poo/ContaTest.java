package br.com.xti.poo;

public class ContaTest {

	public static void main(final String[] args) {
		final Conta conta = new Conta();
		conta.cliente = "Alvaro";
		conta.saldo = 10_000.00;

		conta.exibeSaldo();
		conta.saca(1000);
		conta.exibeSaldo();
		conta.deposita(1500);
		conta.exibeSaldo();

		final Conta conta2 = new Conta();
		conta2.cliente = "Neto";
		conta2.exibeSaldo();
		conta.transferePara(conta2, 500);

		conta.exibeSaldo();
		conta2.exibeSaldo();
	}

}
