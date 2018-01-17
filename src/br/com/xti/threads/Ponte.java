package br.com.xti.threads;

/**
 *
 *	@author Álvaro Barros
 *	@version 1.3
 *	@since 1.0
 *
 *	@see PonteNaoSincronizada
 *	@see PonteSincronizada
 *
 * Uma <code>Ponte</code> representa o elo de ligação
 * entre objetos Produtores e Consumidores de Informação.
 * Os <i>Produtores</i> utilizam as Pontes para gravar
 * informações e compartilhar essas informações com os
 * Consumidores que lèem esses dados da Ponte para
 * fazer o processamento.
 */
public interface Ponte {

	/**
	 * Armazena o valor informado na ponte. Geralmente
	 * será chamado pelas classes Produtoras de dados.
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;

	/**
	 * Recupera a informação armazenada na Ponte. Esse
	 * método será chamdo pelas Consumidoras de dados.
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
}
