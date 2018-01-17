package br.com.xti.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xti.heranca.Cubo;
import junit.framework.TestCase;

public class CuboTest extends TestCase {
	Cubo cubo;

	public CuboTest() {
		super("CuboTest");
	}
	@Override
	@BeforeEach
	public void setUp() throws Exception {
		this.cubo = new Cubo(10);
	}

	@Test
	public void testCalcularArea() {
		Assertions.assertEquals(1000, this.cubo.calcularArea());
	}

	@Test
	public void testCalcularVolume() {
		Assertions.assertEquals(600 , this.cubo.calcularVolume());
	}

}
