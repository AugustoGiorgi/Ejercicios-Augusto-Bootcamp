package clase3;

import java.util.Scanner;

public class ForMain {

	public static void main(String[] args) {
		int sumaPares = 0;
		int sumaImpares = 0;
		int numero;
		int cantidadLecturas = 4;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < cantidadLecturas; i++) {
			
			System.out.println("Ingrese valor");
			numero = teclado.nextInt();
			if(numero % 2 == 0) {
				sumaPares = sumaPares + numero;
			}else {
				sumaImpares = sumaImpares + numero;
			}
		}
		
		teclado.close();
		
		if(sumaImpares > sumaPares) {
			System.out.println("Hay mas imapres");
		}
		if(sumaPares > sumaImpares) {
			System.out.println("Hay mas pares");
		}
		if(sumaPares == sumaImpares) {
			System.out.println("Hay la misma cantidad de pares que impares");
		}
		
		
		System.out.println("Suma de Pares= " + sumaPares);
		System.out.println("Resta de Imapres= " + sumaImpares);
	}

}
