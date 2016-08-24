package net.franciscovillegas.cei.dda.ejemplo_dda;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		int expected = 2;
		int actual = new App().sumar(1, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void testDividir() throws Exception {
		float expected = 1;
		float actual = new App().dividir(1, 1);
		assertTrue("", expected == actual);
	}

	@Test(expected = Exception.class)
	public void testDividirCero() throws Exception {
		float expected = 1;
		float actual = new App().dividir(1, 0);
		assertTrue("", expected == actual);
	}

}
