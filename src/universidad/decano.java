package universidad;

public class decano extends persona {
	
	private String departamento; 
	private int anioExperiencia;
	
	public decano(String nombre, int edad, String genero, String correo, int telefono, String departamento, int aniosExperiencia) {
		super(nombre, edad, genero, correo, telefono);
		this.departamento = departamento;
		this.anioExperiencia = aniosExperiencia; 
		
		
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getAnioExperiencia() {
		return anioExperiencia;
	}

	public void setAnioExperiencia(int anioExperiencia) {
		this.anioExperiencia = anioExperiencia;
	}
	
	public void superProfe() { // este metodo cumple la función de supervisar a los profesores.
		System.out.println("Supervisando a los profesores ");
	}

	public void tomarDeciPoliti() { // este metodo cumple la función de que el decano pueda tomar decisiones politicas.
		System.out.println(" esta tomando una decisión");
	}
}
