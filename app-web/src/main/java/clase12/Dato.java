package clase12;

public class Dato {
	
	private long id;
	private String descripcion;
	
	public Dato(long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public void Detalle() {
		System.out.println("id: " + this.id);
		System.out.println("descripcion: " + this.descripcion);
	}

	public long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
	
	
	

}
