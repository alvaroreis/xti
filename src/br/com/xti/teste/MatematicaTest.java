package br.com.xti.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xti.poo.Matematica;

class MatematicaTest {
	Matematica m;

	@BeforeEach
	void setUp() throws Exception {
		this.m = new Matematica();
	}

	@Test
	void testMaior() {
		Assertions.assertEquals(2, this.m.maior(1, 2));
	}

	@Test
	void testRaiz2() {
		Assertions.assertEquals(4 , this.m.raiz2(16));

	}

}
