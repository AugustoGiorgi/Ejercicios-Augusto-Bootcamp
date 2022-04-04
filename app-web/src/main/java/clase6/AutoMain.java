package clase6;

public class AutoMain {

	public static void main(String[] args) {
		
		Auto miAuto = new Auto("Renault", "Clio mio", 2022, 180.5f );
		
		miAuto.encender();
		//¿Puedo matar un objeto? si
		//miAuto = null;
		// se revuve el auto reinstanciandolo pero pierde los valores asignados anteriormente
		
		

	}

}
