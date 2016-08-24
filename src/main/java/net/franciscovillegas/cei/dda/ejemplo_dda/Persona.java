package net.franciscovillegas.cei.dda.ejemplo_dda;

public class Persona {
	
	private int id;
	private String nombre;
	private String nombreCompleto;
	private Integer anioNacimiento;
	private char inicial;

	public Persona() {
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public void metodoUno() {
		this.nombre = new String("algo");
		this.nombreCompleto = new String("algo");
		if(this.nombre.equals(nombreCompleto)) {
			
		}
	}
	
	void metodoVisibilidadDefault() {
		
	}
	
	protected void metodoDos() {
		
	}
	
	private void metodoTres() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
}