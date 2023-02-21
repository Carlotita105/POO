package segundoPO;

public class persona {

	String nombre;
	byte edad=5;
	double estatura;
	
	
	public void saludar() {
		System.out.println("Hola.  mi nombre es:" + nombre);
		System.out.println("encantado de conocerte");
	}
	
	public void cumplirAnios() {
		edad++; //Incrementamos en 1
	}
	
	public void crecer(double incremento) {
		estatura+=incremento; //la estatura aumenta segun en el incremento
	}

}
