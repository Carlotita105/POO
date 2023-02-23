package primerPO;

import static iu.MiMenu.*;


public class MAIN {

	@SuppressWarnings("Static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instranciar la clase.. declara miAnimal como un objeto de la clase Animales
		Animales miAnimal=new Animales();
		//id=1
		miAnimal.nombre="Misifu";
		miAnimal.edad=14;
		//miAnimal.mostrarNombre();
		
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, miAnimal.iD);
		
		//system.out.println(miAnimal);
		
		//id 2
		Animales miMascota=new Animales();
		miAnimal.nombre="Gufi";
		//miMascota.mostramosNombre();
		
		miMascota.edad=35;
		
		miMascota.mostrarCaracteristicas(miMascota.nombre, miMascota.edad, miMascota.iD);
		mostrarMenu();
		//llamar al metodo constructor de solo el nombre
		Animales miMascota2= new Animales("Candela");
		Animales miMascota3= new Animales("Candela2",15);
		System.out.println(Animales.iD);
		
	}

}
