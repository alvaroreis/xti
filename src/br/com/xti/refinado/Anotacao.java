package br.com.xti.refinado;

import java.io.Serializable;

@Cabecalho(
		intituição= "Universidade XTI",
		projeto= "Sistema de Avaliação",
		dataCriacao= "13/01/2018",
		criador= "Alvaro Luiz Reis Barros",
		revisao = 2
		)

@ErrosCorrigidos(
		erros = {"0001", "0002"}
		)
/*Suprime(oculta) os erros da class
 * Neste caso esta suprimindo o atributo serialVersionUID */
@SuppressWarnings("serial")
public class Anotacao implements Serializable {
	//private static final long serialVersionUID = 1L;

	/*Suprime(oculta) os erros do atributo de não esta sendo utlizado */
	@SuppressWarnings("unused")
	private int x;

	/*Indica que provavelmente no futuro este metodo sera eliminado*/
	@Deprecated
	public void anotar() {}

	/*Indica que este metodo esta sendo sobreescrito da class pai*/
	@Override
	public String toString() {
		return null;
	}
}
