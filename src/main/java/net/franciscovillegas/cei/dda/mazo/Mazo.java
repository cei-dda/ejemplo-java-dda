package net.franciscovillegas.cei.dda.mazo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mazo {

	private List<Carta> cartas = null;
	
	public Mazo() {
		cartas = new LinkedList<Carta>();
		barajar();
	}
	
	public void barajar() {
		for(int i = 0; i < 12; i++) {
			int valor = i + 1;
			cartas.add(new Carta(valor));
		}
		Collections.shuffle(cartas);
	}
	
	public Carta darCarta() {
		return cartas.remove(0);
	}
	
}
