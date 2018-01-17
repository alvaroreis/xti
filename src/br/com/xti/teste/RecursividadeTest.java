package br.com.xti.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xti.refinado.Recursvidade;
import junit.framework.TestCase;

public class RecursividadeTest  extends TestCase{

	public RecursividadeTest() {
		super("RecursividadeTest");
	}
	@Override
	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public void testSoma() {
		Assertions.assertEquals(55, Recursvidade.soma(10));
	}

	@Test
	public void testPotencia() {
		Assertions.assertEquals(81, Recursvidade.potencia(3,4));
	}

}
