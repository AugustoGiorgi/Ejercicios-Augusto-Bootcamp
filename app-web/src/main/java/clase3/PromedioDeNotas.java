package clase3;

import java.util.Scanner;

public class PromedioDeNotas {

	public static void main(String[] args) {
		/**
		 * calcular el promedio de notas de un alumno
		 * se debe ingresar las 3 notas del anio
		 * si el promedio supera a 7 esta aprobado
		 * si el promedio es menor que 7 debe recursar
		 */

		float nota1;
		float nota2;
		float nota3;
		float promedio;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la primera nota");
		nota1 = teclado.nextFloat();
		
		System.out.println("Ingrese la segunda nota");
		nota2 = teclado.nextFloat();
		
		System.out.println("Ingrese la tercer nota");
		nota3 = teclado.nextFloat();
		
		promedio = ((nota1 + nota2 + nota3) / 3);
		System.out.println("El promedio es " + promedio);
		
		if(promedio >= 7) {
			System.out.println("El alumno a aprobado");
		}else {
			System.out.println("El alumno debe recursar la materia");
		}
		
		teclado.close();
		
	}

}
