package primerPO;

public class Animales {
	//Atributos
	String nombre;
	static int iD=0;
	int edad;
	
	
	//metodos 
	public void mostrarNombre() {
		System.out.println(nombre);
		
	}

	public void mostrarCaracteristicas(String nombString, int edad, int iD) {
		System.out.println("Mi animal se llama" +nombString+ "tiene" +edad+ "años y su ID es" +iD);
		
	}
	public Animales() { //es un metodo contructor
		incrementarId();
	}
	public Animales(String name, int edadActual) { //es un metodo contructor
		this.nombre=name;
		this.edad=edadActual;
		incrementarId();
		System.out.println("El nombre es:" +this.nombre+ "y la edad de mi mascota es " +this.edad+ "años ");
		iD++;
	
	}
	public Animales(String  name) {
		this.nombre=name;
		incrementarId();
		System.out.println("El nommbre es" +this.nombre);
	}
	
	public void incrementarId() {	
	iD++;
}
}