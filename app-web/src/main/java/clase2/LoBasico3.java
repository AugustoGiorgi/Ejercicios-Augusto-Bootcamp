package clase2;

public class LoBasico3 {

	public static void main(String[] args) {
		// mas tipo de datos 
		// true o false = Boolean
		
		boolean esViernes = true;
		boolean tuCuerpoLoSabe = false;
		
		// operadores logicos 
		// and = Y => && ( true si se cumple las dos condiciones)
		// or = o => || ( true si se cumple una de las dos condiciones)
		// nor = no => ! (si es true lo pone false y si es false true)
		// xor
		
		boolean saleAfter = esViernes && tuCuerpoLoSabe;
		System.out.println(saleAfter);
		
		boolean saleAfter2 = esViernes || tuCuerpoLoSabe;
		System.out.println(saleAfter2);
		
		boolean saleAfter3 = esViernes && !tuCuerpoLoSabe; 
		System.out.println(saleAfter3);
		
		if(saleAfter3) {
			System.out.println("Sale Fiesta");
		}
		
		if(!saleAfter) {
			System.out.println("Me quedo en casa");
		}
		
		
	}

}
