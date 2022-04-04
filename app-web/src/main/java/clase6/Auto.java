package clase6;

public class Auto {

	String Marca;
	float velocidad;
	float velocidadMaxima;
	String modelo;
	Integer anio;
	boolean encendido;
	
	
	Auto(){
		init();
	}
	Auto(String marcaDeNacimiento, String modeloDeNacimiento, Integer anioDeNacimiento, float velocidadMaximaDeNacimiento){
		Marca = marcaDeNacimiento;
		modelo = modeloDeNacimiento;
		anio = anioDeNacimiento;
		encendido = false;
		velocidad = 0f;
		velocidadMaxima = velocidadMaximaDeNacimiento;
		init();
	}
	 void encender(){
		 if(!encendido) {
		encendido = true;
		System.out.println("Se prendio el auto");
		 }else {
			 System.out.println("No se puede prender el auto porque ya esta encendido");
		 }
	}
	 void apagar() {
		 if(encendido == true) {
			 while(velocidad > 0) {
				 frenar();
			 }
			 encendido = false; 
			 System.out.println("Auto apagado");
		 }else {
			 System.out.println("no se puede apagar el auto ya esta apagado");
		 }
	 }
	 void acelerar() {
		 if(encendido) {
			 velocidad++;
			 System.out.println("Acelerando...");
		 }else {
			 System.out.println("Debe encender el auto para acelerar");
		 }
		
	}
	 void init() {
		 encendido = false;
		 velocidad = 0f;
	 }
	 void frenar() {
		 if(encendido && velocidad > 0) {
			 velocidad--;
		 }else {
			 System.out.println("El auto esta apagado");
		 }
	 }
}
