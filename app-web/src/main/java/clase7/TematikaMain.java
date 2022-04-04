package clase7;

public abstract class TematikaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String claveDeBusquedaPorElUsuario = "Batman";
		/*
		 * Quiero realizar una busqueda
		 * 1 crear un buscador = instanciar un objeto de la clase buscador
		 * 2 ejecutar el metodo buscar de la instancia creada
		 */

		Buscador miBuscador = new Buscador(claveDeBusquedaPorElUsuario);
		miBuscador.buscar();
		
		if(miBuscador.cantidad > 0) {
			// comoo recorro los resultados
			
			miBuscador.mostrarCantidadResultados();
			
			for(int i = 0; i < miBuscador.cantidad; i++) {
				Articulo unArticulo = miBuscador.articulos[i];
				System.out.println(unArticulo.autor);
				System.out.println(unArticulo.nombre);
				if (unArticulo.tieneImagen()) {
			System.out.println(unArticulo.urlImagen);
				}else {
					System.out.println("Marca de agua");
				}
				}
				
		}
	}

}
