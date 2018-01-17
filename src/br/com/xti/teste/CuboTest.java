package br.com.xti.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xti.heranca.Cubo;

class CuboTest {
	Cubo cubo;

	@BeforeEach
	void setUp() throws Exception {
		this.cubo = new Cubo(10);
	}

	@Test
	void testCalcularArea() {
		Assertions.assertEquals(1000, this.cubo.calcularArea(), 0);
	}

	@Test
	void testCalcularVolume() {
		Assertions.assertEquals(600 , this.cubo.calcularVolume(), 0);
	}

}
