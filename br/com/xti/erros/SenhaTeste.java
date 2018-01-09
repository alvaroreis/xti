package br.com.xti.erros;

public class SenhaTeste {
	static void autenticar(final String senha)
			throws SenhaInvalidaException
	{
		if("123".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
		} else {
			//senha invalida
			throw new SenhaInvalidaException("Senha Incorreta!");
		}
	}

	public static void main(final String[] args) {
		try {
			SenhaTeste.autenticar("23234");
		} catch (final SenhaInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}

}
