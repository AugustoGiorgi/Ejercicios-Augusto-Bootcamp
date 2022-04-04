package clase3;

public class Ifmain {

	public static void main(String[] args) {
		
		int edad = 17;
		
		// Operador relacionar
		// < > >= <= !=
		
		if(edad >= 18) {
			
			if(edad >= 20 && edad <= 30){
				System.out.println("Es mayor de edad y esta entre los 20 y los 30");
			}else {
				System.out.println("es mayor de edad pero no esta entre los 20 y los 30");
			}
			
			}else {
				System.out.println("No es mayor de edad");
		}

	}

}
