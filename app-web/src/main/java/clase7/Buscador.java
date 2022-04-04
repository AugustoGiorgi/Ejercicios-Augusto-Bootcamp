package clase7;

public class Buscador {
	//atributos
	
	String claveDeBusqueda;
	Articulo[] articulos;
	Integer cantidad;
	
	
	// constructor
	
	public Buscador() {
		this.claveDeBusqueda = "";
		this.articulos =  new Articulo[0];
		this.cantidad = 0;
	}
	
	
	public Buscador(String claveDeBusqueda) {
		this.claveDeBusqueda = claveDeBusqueda;
		
	}
	
	
	
	//metodos
	public void buscar() {
		//alguien me da los articulos
		Articulo[] resultados = new Articulos[3];
		resultados[0] = new Articulo("Batman 1970", "dc comics", "Url", 1600.0);
		
	    resultados[1] = new Articulo("Batman 2010", "dc comics", "url", 1600.0);
	    
	    resultados[2] = new Articulo("Batman 2000", "dc comics", "url", 1600.0);
	    /*ahora que tengo el total de los aritculos
	     * uso el length del vector para actualizar la cantidad
	     */
	    this.articulos = resultados;
	    cantidad = resultados.length;
	}


	public void mostrarCantidadResultados() {
		System.out.println("Hemos encontrado: " + this.cantidad + "aritculos");
		
	}
	
}
