package clase6;

public class StringMain {

	public static void main(String[] args) {
		
		String palabra = "soy de river";
		
		//String
		//tiene metodos
		
		//comienza con x letra
		if(palabra.startsWith("h")) {
			System.out.println("Comienza con h");		
		}else {
			System.out.println("No comienza con h");
		}

		char primerCaracter = palabra.charAt(0);
		// donde se encuentra posicionado el caracter
		if(primerCaracter == 'h') {
			System.out.println("Comienza con h");
		}else {
			System.out.println("No comienza con h");
		}
		
		String otraPalabra = "Soy de boca";
		if(palabra.equalsIgnoreCase(otraPalabra)) { //se utiliza el equals para suplir el == (el equals es sensible a mayusculas)  
			System.out.println("true");             // con el equalsIgnoreCase el sistema no es sensible a las mayusculas
		}else {
			System.out.println("false");
		}
		
		Object edad = new Integer(10);
		Object nombre = "Carlos";
		Object letras = "a";
		Object[] unArrayCualquiera = {edad, nombre, letras};
		
		//for each
		for(Object aux : unArrayCualquiera) {
			//instanceOf
			if(aux instanceof Integer) {
			Integer auxInteger = (Integer) aux;
			}else {
				if(aux instanceof String) {
					String auxString = (String)aux;
				}else {
					Character auxChar = (char) aux;
					System.out.println(auxChar);
				}
			}
			
		}
	
	}
	
	

}
