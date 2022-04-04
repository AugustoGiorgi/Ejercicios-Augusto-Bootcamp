package clase3;

import java.util.Scanner;

public class WhileMain {

	public static void main(String[] args) {
		int contador = 0;
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dato");
		numero = teclado.nextInt();
		
		while(numero != 0) {
		if(contador < 6) {
			contador++;
			System.out.println("Ingrese el proximo dato");
			numero = teclado.nextInt();
		}else {
			break;
		}
		
		teclado.close();
		}
		System.out.println("fin");
		

	}

}
