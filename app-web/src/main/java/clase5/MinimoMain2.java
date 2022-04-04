package clase5;

import java.util.Arrays;

public class MinimoMain2 {

	public static void main(String[] args) {
		
		//buscar el minimo y el maximo de un array
		
		int[] edades = {36, 31, 38, 35, 34, 29, 17 };
		
		if(edades.length > 0) {
			 int minimo = calcularMinimo(edades);
			 int cantidadMinimos = contarMinimos(minimo, edades);
			 int[] PoscionesMinimo = indicarPosiciones(cantidadMinimos, minimo, edades);
			 System.out.println("el minimo es " + minimo + " y hay" + cantidadMinimos + "Y estan en " + Arrays.toString(PoscionesMinimo) );
		}else {
			System.out.println("no hay a quien preguntarle");
		}

	}
	
	static int[] indicarPosiciones(int cantidadMinimos, int minimo, int[] edades) {
		int[] poscionesMinimo = new int [cantidadMinimos];
		int j = 0;
		for( int i = 0 ; i < edades.length ; i++ ) {
			if(edades[i] == minimo) {
				poscionesMinimo[j] = i;
				j++;
				
			}
		}
		return poscionesMinimo;
	}
	static int contarMinimos(int minimo, int[] edades) {
		int cantidad = 0;
		for(int i = 0 ; i < edades.length ; i++ ){
			if(edades[i] == minimo) {
				cantidad++;
			}
		}
		return cantidad;
	}
	static int calcularMinimo(int[] edades) {
		int minimo = edades[0];
		for(int i = 1; i < edades.length; i++) {
			if(edades[i] < minimo) {
				minimo = edades[1];
			}
		}
		return minimo;
	
	}
}
