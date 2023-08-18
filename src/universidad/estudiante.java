package universidad;

public class estudiante extends persona{
	
	 private String carrera;
	 private int anioIngre;

	 public estudiante(String nombre, int edad, String genero, String correo, int telefono, String carrera, int anioIngre){
		 super(nombre, edad, genero, correo, telefono);
		 this.carrera = carrera;
		 this.anioIngre = anioIngre;
		 
		 
		 
	 }

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getAnioIngre() {
		return anioIngre;
	}

	public void setAnioIngre(int anioIngre) {
		this.anioIngre = anioIngre;
	}
	
	public  void estudiar() {
		System.out.println(" esta estudiando.");
	}
	
	
	
	
}

