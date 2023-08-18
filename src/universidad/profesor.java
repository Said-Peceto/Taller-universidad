package universidad;

public class profesor extends persona{
	
	private int numEmple;
	private String materia; //curso o materia que enseña en la universidad.
	
	public profesor(String nombre, int edad, String genero, String correo, int telefono, int numEmple, String materia){
		super(nombre, edad, genero,correo, telefono); 
		
		this.numEmple = numEmple;
		this.materia = materia;
		
		
		
	}

	public int getNumEmple() {
		return numEmple;
	}

	public void setNumEmple(int numEmple) {
		this.numEmple = numEmple;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void RegisCalifi(){ //El profesor puede registrar las calificaciones 
		System.out.println(" registro una calificación.");
	}
	
	
		
}
