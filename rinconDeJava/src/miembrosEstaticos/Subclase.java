package miembrosEstaticos;

public class Subclase extends SuperClase {

	public static void metodoEstatico() {System.out.println("Sobre escritura ");}

	public void mensajes ()
	{
		metodoEstatico();
		metodoEstatico2();
	}

}