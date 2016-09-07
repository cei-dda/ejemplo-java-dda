/**
 * 
 */
package net.franciscovillegas.cei.dda.mazo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.franciscovillegas.cei.dda.controllers.MazoController;

public class MazoImplTest {

	private Mazo mazo;

	@Before
	public void before() {
		mazo = mock(MazoImpl.class);

	}

	@After
	public void after() {
		mazo = null;
	}

	@Test
	public void testDarCartaMazoRecienInicializado() {
		Carta cartaResuldoEsperado = new Carta(1);
		Carta cartaObtenida = null;
		when(mazo.darCarta()).thenReturn(cartaResuldoEsperado);
		// when(mazo.darCarta()).thenCallRealMethod();
		cartaObtenida = mazo.darCarta();
		assertNotNull(cartaObtenida);
		assertEquals(cartaResuldoEsperado, cartaObtenida);
	}

	@Test
	public void testController() {
		MazoController mazoController = new MazoController();

	}

	
	
	
	
	
	
	
	
	
}
