package primerPO;

public class Animales {
	//Atributos
	String nombre;
	int iD;
	int edad;
	
	
	//metodos 
	public void mostrarNombre() {
		System.out.println(nombre);
		
	}

	public void mostrarCaracteristicas(String nombrString, int edad, int iD) {
		System.out.println("Mi animal se llama" +nombrString+ "tiene" +edad+ "años y su ID es" +iD);
		
	}
}
