package clase6;

public class AutoMain2 {

	public static void main(String[] args) {
		
		Auto miAuto = new Auto("Renault", "Clio mio", 2022, 180.5f);
		
		
		miAuto.anio = 2022;
		miAuto.Marca = "Renault";
		miAuto.modelo = "Clio mio";
		miAuto.velocidad = 0f;
		
		miAuto.encender();
		
		miAuto.acelerar();
		
		miAuto.apagar();
		
		System.out.println("Fin");
		

	}

}
