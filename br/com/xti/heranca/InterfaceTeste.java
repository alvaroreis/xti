package br.com.xti.heranca;

public class InterfaceTeste {

	public static void area(final AreaCalculavel o) {
		System.out.println(o.calcularArea());
	}

	public static void volume(final VolumeCalculavel o) {
		System.out.println(o.calcularVolume());
	}

	public static void main(final String[] args) {


		InterfaceTeste.area(new Quadrado(2));
		InterfaceTeste.volume(new Cubo(2));
	}

}
