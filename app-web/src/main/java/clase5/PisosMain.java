package clase5;

import java.util.Scanner;

public class PisosMain {

	public static void main(String[] args) {
		/*
		 * construir un piso del tamanio que me indique el usuario
		 */
		
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el tamanio");
		int tamanio = teclado.nextInt();
		
		String[] edificio = new String[tamanio];
		//mostrar el tamanio, pero usando el edificio no la variabole
		System.out.println(edificio.length);
		//cargamos las personas que viven en el edificio
		//como recorrer un array
		
		for(int pisoActual = 0; pisoActual < edificio.length; pisoActual++) {
			edificio[pisoActual] = "personsa " + pisoActual;
		}
		// quiero saber si tomas vive en el piso 4
		for(int pisoActual = 0; pisoActual < edificio.length; pisoActual++) {
			String fulano = edificio[pisoActual];
			System.out.println(fulano + "vive en el piso" + pisoActual);
		}
		
	}

}
