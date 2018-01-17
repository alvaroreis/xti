package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.xti.poo.Conta;

public class Serializa {

	public static void main(final String[] args) throws IOException, ClassNotFoundException {

		//		final String[] nomes = {"Alvaro","Luiz","Reis","Barros"};

		//		/*ESCRITA DE OBJETO*/
		//		final FileOutputStream fos = new FileOutputStream("C:/xti/files/objeto.ser");
		//		final ObjectOutputStream oos = new ObjectOutputStream(fos);
		//		oos.writeObject(nomes);
		//		oos.close();
		//
		//		/*LEITURA DE OBJETO*/
		//		final FileInputStream fis = new FileInputStream("C:/xti/files/objeto.ser"); // le
		//		final ObjectInputStream ois = new ObjectInputStream(fis);
		//		final String[] nomes1= (String[]) ois.readObject();
		//		ois.close();
		//		System.out.println(Arrays.toString(nomes1)); //Arrays.toString() = converte obj em string


		final Conta conta1 = new Conta("Alvaro Barros", 200000);
		/*ESCRITA DE OBJETO*/
		final FileOutputStream fos = new FileOutputStream("C:/xti/files/objeto.ser");
		final ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.close();

		/*LEITURA DE OBJETO*/
		final FileInputStream fis = new FileInputStream("C:/xti/files/objeto.ser"); // le
		final ObjectInputStream ois = new ObjectInputStream(fis);
		final Conta c1= (Conta) ois.readObject();
		ois.close();

		c1.exibeSaldo();


	}

}
