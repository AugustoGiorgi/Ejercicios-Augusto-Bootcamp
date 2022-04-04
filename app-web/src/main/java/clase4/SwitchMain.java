package clase4;

import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
	
		int continuar = 0;
		Scanner teclado = new Scanner(System.in);
		
		do {
		int opcion;
		double res;
		double a;
		double b;
		
		
		
		do {
		mostrarMenu();
		opcion = teclado.nextInt();
		}while(opcion < 0 || opcion > 4);
		
		if(opcion ==0) {
			System.out.println("Saliendo...");
			System.exit(0);
		}
		
		
		a = leerData("Ingrese a", teclado);
		
		b = leerData("Ingrese b", teclado);
		
		switch(opcion) {
			case 1:{
				res = a + b;
				mostrarResultado(res, "+");	
				break;
			}
			
			case 2: {
				res = a - b;
				mostrarResultado(res, "-");
				break;
			}
			
			case 3: {
				res = a * b;
				mostrarResultado(res, "*");
				break;
			}
			
			case 4: {
				if(b != 0) {
					res = a /b;
					mostrarResultado(res, "/");
				}else {
					System.out.println("No se puede dividir por 0");
				}
				break;
			}
			
		}
		System.out.println("Desea continuar? 1 = Si, 0 = NO");
		continuar = teclado.nextInt();
		if(continuar == 0) {
			System.out.println("Fin");
		}
		}while(continuar == 1);
		
		teclado.close();
	}


	private static double leerData(String msj, Scanner teclado) {
		System.out.println(msj);
		return teclado.nextDouble();
	}


	private static void mostrarMenu() {
		System.out.println("Ingrese la operacion");
		System.out.println("1= suma, 2= resta, 3= multi, 4= dividir, 0= salir del sistema");
	}

	
	static void mostrarResultado(double res, String operacion) {
		System.out.println("La operacion " + operacion +" dio el resultado: " + res);
	}
	
	
}
