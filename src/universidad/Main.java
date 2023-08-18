package universidad;

import java.util.ArrayList;


	
public class Main{
	
	public static ArrayList<persona> integrantes = new ArrayList<persona>();
	
	//(nombre, edad, genero, correo, telefono, 
	public static void main(String[] args) {
		
		estudiante jose = new estudiante("Jose Perez", 23, "Masculino", "josep@gmail.com", 67349087, "Ing. Sistemas" ,2019);
		estudiante karla = new estudiante("Karla Lopez", 19, "Femenina", "Karlam2@gmail.com", 67892454, "Medicina", 2022);
		profesor alejandro = new profesor("Alejandro Gonzales", 40, "Masculino", "Alejandro.Gonzales@uip.edu.pa", 6540-8975, 80387, "Base de datos" );
		profesor octavio = new profesor("Octavio Martinez", 55, "Masculino", "octavio.martinez@uip.edu.pa", 6798-3048, 87980, "Base de datos" );
		decano erik = new decano("Erik Peceto", 67, "Femenina", "Erika.Peceto@uip.edu.pa", 6437-9076, "Facultad de Ingeneria, arquitectura y diseño", 20 );
		
		integrantes.add(jose);
		integrantes.add(karla);
		integrantes.add(alejandro);
		integrantes.add(octavio);
		integrantes.add(erik);
		
		  for (persona integrante : integrantes) {
	            if (integrante instanceof estudiante) {
	                estudiante estudiante = (estudiante) integrante; 
	    	        System.out.println("El estudiante " + integrante.getNombre()+ ":");
	    	        		estudiante.estudiar(); 
	    	        		System.out.println();       
	            }
		}
	
		  for (persona integrante : integrantes) {
	            if (integrante instanceof profesor) {
	                profesor profesor = (profesor) integrante; 
	    	        System.out.println("El profesor " + integrante.getNombre()+ ":");
	    	        		profesor.RegisCalifi();
	    	        		System.out.println();   
	            }
		  } 
		  
		  for (persona integrante : integrantes) {
	            if (integrante instanceof decano) {
	            	decano decano = (decano) integrante; 
	    	        System.out.println("El decano " + integrante.getNombre()+ ":");
	    	        decano.tomarDeciPoliti();
	    	        		System.out.println();   
	            }
		  } 
		  
	}
	

}
