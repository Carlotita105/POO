package segundoPO;

import java.util.Scanner;

public class MainDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona p=new persona();
		p.edad=18;
		p.nombre="Camen Alicia";
		p.estatura=1.56;
		p.cumplirAnios();
		p.saludar();
		System.out.println("Cuando cumplas años tendras" +p.edad);
		System.out.println("¿cuanto has crecido?->" );
		double incremento=new Scanner(System.in).nextDouble();
		p.crecer(incremento);
		System.out.printf("tu estatura ahora es -> %.2f" ,p.estatura);
		 
	
	}

}
