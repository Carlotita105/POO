package primerPO;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instranciar la clase.. declara miAnimal como un objeto de la clase Animales
		Animales miAnimal=new Animales();
		miAnimal.nombre="Misifu";
		miAnimal.iD=1;
		miAnimal.edad=14;
		miAnimal.mostrarNombre();
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, miAnimal.iD);
		miAnimal.nombre="Gufi";
		miAnimal.mostrarNombre();
	}

}
