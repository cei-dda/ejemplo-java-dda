package net.franciscovillegas.cei.dda.mazo;

public class Carta {

	private int valor;

	/**
	 * 
	 * @param valor que tiene la carta.
	 * Tiene que ser distinto a 0
	 */
	public Carta(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if(obj instanceof Carta) {			
			Carta carta = (Carta) obj;
			isEqual = (carta.getValor() == this.valor) ? true : false;
		}
		return isEqual;
	}
	
}
