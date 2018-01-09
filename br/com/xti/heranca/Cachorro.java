package br.com.xti.heranca;

public class Cachorro extends Animal {

	public Cachorro() {
		super(30, "Carne");
	}

	@Override
	public void fazerBarulho(){
		System.out.println("Au, Au!");
	}
	public void enterrarOsso() {System.out.println("Enterrou o osso!");}
}
