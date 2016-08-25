package net.franciscovillegas.cei.dda.ejemplo_dda;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		new Persona();
	}

	public int sumar(int numeroA, int numeroB) {
		int result = numeroA + numeroB;
		return result;
	}

	public float dividir(int numeroA, int numeroB)
			throws NoPuedoDividirEntreCeroException, NoPuedoDividirNumerosMayoresException {
		if (numeroB == 0) {
			throw new NoPuedoDividirEntreCeroException("divisor es 0");
		}
		if (numeroA > 2) {
			throw new NoPuedoDividirNumerosMayoresException("No puedo dividir un numero mayor a 2");
		}
		float result = numeroA / numeroB;
		return result;
	}

}
