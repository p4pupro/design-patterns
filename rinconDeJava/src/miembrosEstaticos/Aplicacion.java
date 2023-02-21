package miembrosEstaticos;

public class Aplicacion {

		
	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		

		Subclase c = new Subclase();
		
		c.metodoEstatico(); 
		SuperClase.metodoEstatico();
		SuperClase.metodoEstatico2();
		// c.mensajes();

	}

}
