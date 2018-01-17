package br.com.xti.erros;

public class SenhaInvalidaException extends Exception {

	public SenhaInvalidaException(final String mensagem) {
		super(mensagem);
	}
}
