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
		assertEquals("Espero dividir", expected, actual, 0.0f);
	}

	@Test(expected = NoPuedoDividirEntreCeroException.class)
	public void testDividirCero() throws NoPuedoDividirEntreCeroException {
		try {
			new App().dividir(1, 0);
		} catch (NoPuedoDividirNumerosMayoresException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDividirMayor() throws Exception {
		try {
			new App().dividir(1, 0);
		} catch (NoPuedoDividirEntreCeroException e) {
			e.printStackTrace();
		} catch (NoPuedoDividirNumerosMayoresException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw e;
		} finally {
			System.out.println("Siempre me ejecuto");
		}
	}

}
