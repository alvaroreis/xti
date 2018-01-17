package br.com.xti.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xti.poo.Matematica;
import junit.framework.TestCase;

public class MatematicaTest extends TestCase {
	Matematica m;

	public MatematicaTest() {
		super("MatematicaTest");
	}

	@Override
	@BeforeEach
	public void setUp() throws Exception {
		this.m = new Matematica();
	}

	@Test
	public void testMaior() {
		Assertions.assertEquals(2, this.m.maior(1, 2));
	}

	@Test
	public void testRaiz2() {
		Assertions.assertEquals(4, this.m.raiz2(16));

	}

}
