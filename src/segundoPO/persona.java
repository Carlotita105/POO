package segundoPO;

public class persona {

	String nombre;
	int edad=5;
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
	public persona() {
		this.nombre=nombre;
		
	}

	public persona(String nombre, int edad, double estatura) {
		this.nombre= nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	

	
		
	}
  
	 


