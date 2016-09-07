package net.franciscovillegas.cei.dda.controllers;

import java.lang.reflect.InvocationTargetException;

import net.franciscovillegas.cei.dda.jeringa.Jeringa;
import net.franciscovillegas.cei.dda.jeringa.JeringaInjector;
import net.franciscovillegas.cei.dda.mazo.Mazo;
import net.franciscovillegas.cei.dda.mazo.MazoImpl;

public class MazoController {

	@Jeringa(value = "mazo")
	private Mazo mazo;

	public MazoController() {
		try {
			JeringaInjector.getInstance().inyectar(this);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--->");
	}
}
