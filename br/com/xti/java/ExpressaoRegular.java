package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(final String[] args) {


		boolean b = "Java".matches("java");
		/**	MODIFICADORES
		 * (?i), Ignora maiusculas e minusculas
		 * (?x), Comentarios
		 * (?m), Multilinhas
		 * (?s), Dottal
		 */
		b = "Java".matches("(?im)java");
		//System.out.println(b);

		/**METACARACTERE
		 * . quarquer tipo de caracter
		 * \d digitos        [0-9]
		 * \D não digitos    [^0-9]
		 * \s espaços        [\t\n\x0b\f\r]
		 * \S não espaços    [^\s]
		 * \w letra			 [a-zA-Z_0-9]
		 * \W não é letra
		 **/
		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "a".matches("\\w");
		b = " ".matches("\\s");

		final String validaCep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "66093-682".matches(validaCep);
		//System.out.println(b);

		/**QUANTIFICADORES
		 * X{n}		X, exatamente n vezes
		 * X{n,}	X, pelo menos n vezes
		 * X{n, m}	X, pelo menos n mas não mais do que m vezes
		 * X?		X, 0 ou 1 vez
		 * X*		X, 0 ou + vezes
		 * X+		X, 1 ou + vezes
		 */
		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "12345".matches("\\d{2,5}");

		b = "".matches(".?");//0 ou 1
		b = "aa".matches(".*"); //0 ou  +
		b = "123".matches(".+"); //1 ou  +

		b = "66093-682".matches("\\d{5}-\\d{3}");
		b = "05/04/1996".matches("\\d{2}/\\d{2}/\\d{4}");
		//System.out.println(b);

		/**CARACTERES DE FRONTEIRAS
		 * ^ inicia
		 * $ finaliza
		 * | ou
		 */

		b = "Pier21".matches("^Pier.*"); // verifica se a string inicia com "Pier"
		b = "Pier21".matches(".*21$");// verifica se a string termina com "21"
		b = "tem java aqui".matches(".*java.*");// procura a ocorrencia de java na string
		b = "tem java aqui".matches("^tem .* aqui$");// verifica se começa com "tem" e termina com "aqui".
		b = "sim".matches("sim|não");// verifica se a palavra é "sim" ou "não"
		//System.out.println(b);

		/**AGRUPADORES
		 * [...]			AGRUPAMENTO
		 * [a-z]			ALCANCE
		 * [a-e][i-u]		UNIÃO
		 * []a-z&&[aeiou]	INTERSEÇÃO
		 * [^abc]			EXCEÇÃO
		 * [a-z&&[^m-p]]	SUBTRAÇÃO
		 * \x				FUGA LITERAL
		 */

		b = "x".matches("[a-z]");
		b = "3".matches("[0-9]");

		b = "true".matches("[tT]rue"); //true True
		b = "yes".matches("[tT]rue|[Yy]es"); // True true yes Yes
		b = "Alvaro".matches("[A-Z][a-z]*");
		b = "alho".matches("[^abc]lho*");
		b = "crau".matches("cr[ae]u");// crau creu
		b = "reisalvaro@icloud.com".matches("\\w+@\\w+\\.\\w{2,3}|.\\w{0,3}");//
		//System.out.println(b);

		final String doce = "Qual é o Doce mais doCe que o doce?";
		final Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()) {
			//System.out.println(matcher.group());
		}



		/*	SUBSTITUIÇÕES */

		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		final String rato =  "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("(?i)r[aeiou]", "XX");
		r = "Tabular este texto".replaceAll("\\s", "\t");

		//--------------------------------------------------------------------------
		final String url = "www.xti.com.br/clientes-2001.html";
		//http://www.xti.com.br/2011/clientes.jsp

		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		//System.out.println(b);

		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");

		System.out.println(url);
		System.out.println(r);
	}

}
