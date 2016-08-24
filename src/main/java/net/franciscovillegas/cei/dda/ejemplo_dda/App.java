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

	public float dividir(int numeroA, int numeroB) throws Exception {
		if(numeroB == 0) {
			throw new Exception("divisor es 0");
		}
		float result = numeroA / numeroB;
		return result;
	}
	
 }
