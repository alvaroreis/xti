package br.com.xti.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xti.refinado.Recursvidade;

class RecursividadeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSoma() {
		Assertions.assertEquals(55, Recursvidade.soma(10));
	}

	@Test
	void testPotencia() {
		Assertions.assertEquals(81, Recursvidade.potencia(3,4));
	}

}
