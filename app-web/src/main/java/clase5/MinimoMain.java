package clase5;

public class MinimoMain {

	public static void main(String[] args) {
		
		//buscar el minimo y el maximo de un array
		
		int[] edades = {36, 31, 38, 35, 34, 29, 17 };
		
		if(edades.length > 0) {
			int minimo = edades[0];
			int maximo = edades[0];
			int posMinimo = 0;
			int posMaximo = 0;
			int cantidadMinimos = 0;
			int cantidadMaximos = 0;
			
			for(int i = 1; i < edades.length; i++) {
				if(edades[i] <= minimo) {
					minimo = edades[i];
					posMinimo = i;
					cantidadMinimos++;
					
				}
			}
			for(int j = 1; j < edades.length; j++) {
				if(edades[j] >= maximo) {
					maximo = edades[j];
					posMaximo = j;
					cantidadMaximos++;
				}
			}
			System.out.println("El minimo es: " + minimo + "y esta en " + posMinimo + "la cantidad de minimos es " + cantidadMinimos);
			System.out.println("el maximo es: " + maximo + "y esta en " + posMaximo + "la cantidad de maximos es " + cantidadMaximos);
		}else {
			System.out.println("no hay a quien preguntarle");
		}

	}

}
