package clase7;

public class Articulo {
	
	String nombre;
	String autor;
	String urlImagen;
	double precio;
	
	Articulo(String nombre, String autor, String urlImagen, double precio){
			this.nombre = nombre;
			this.autor = autor;
			this.urlImagen = urlImagen;
			this.precio = precio;
			
	}

	
	boolean tieneImagen() {
		if( this.urlImagen != null && this.urlImagen != "") {
			return false;
		}
		return true;
	}
}
