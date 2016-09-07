package net.franciscovillegas.cei.dda.mazo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MazoImpl implements Mazo {

	private List<Carta> cartas = null;
	
	public MazoImpl() {
		cartas = new LinkedList<Carta>();
		barajar();
	}
	
	/* (non-Javadoc)
	 * @see net.franciscovillegas.cei.dda.mazo.Mazo#barajar()
	 */
	@Override
	public void barajar() {
		for(int i = 0; i < 12; i++) {
			int valor = i + 1;
			cartas.add(new Carta(valor));
		}
		Collections.shuffle(cartas);
	}
	
	/* (non-Javadoc)
	 * @see net.franciscovillegas.cei.dda.mazo.Mazo#darCarta()
	 */
	@Override
	public Carta darCarta() {
		return cartas.remove(0);
	}
	
}
