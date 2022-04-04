package clase2;

public class LoBasico2 {

	public static void main(String[] args) {
		
		/*
		 operadores arigmeticos + - * /
		 
		 dividir a por b / b tiene q ser distinto de 0
		 
		 enteros son sin decimales : byte; short; long
		 decimales son con coma: float; double
		 */
		
		int a = 10;
		int b = 0;
		
		if(b != 0) {
		System.out.println(a/b);
		}else {
			System.out.println("no se puede dividir por 0");
		}

		//si quiero definir un sueldo, en float se usa f al final del valor para validarlo
		float sueldo = 100.5f;
		double sueldo2= 100.5;
		// en double no hay que especificar al final pero se puede hacer
		double sumaDecimales = sueldo + sueldo2;
		System.out.println(sumaDecimales);
		
		float altura = 173.3f;
		// casteo = es poner entre () el tipo de dato que quiero
		// hay perdida de datos
		int alturaInt = (int)altura;
		
		System.out.println(altura);
		System.out.println(alturaInt);
	}

}
