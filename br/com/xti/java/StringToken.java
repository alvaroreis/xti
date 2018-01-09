package br.com.xti.java;

public class StringToken {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		String s = "XHTML; CSS; JavaScript; JQuery; Java";
		s = "Venha trabalhar na XTI";
		final String[] tokens = s.split(" ");
		System.out.println(tokens.length + " tokens");
		for(final String token : tokens) {
			System.out.println(token);
		}
	}

}
