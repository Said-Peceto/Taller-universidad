package universidad;

public class persona {

	//creamos el superclass para usarlo en las otras subclases. //nombre, edad, genero, correo, telefono
	
	private String  nombre;
	private int edad;
	private String genero; 
	private String correo;
	private int telefono; 

	public persona(String nombre, int edad, String genero, String correo, int telefono){
		
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.correo = correo;
		this.telefono = telefono; 
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
