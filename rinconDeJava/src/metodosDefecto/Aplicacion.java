package metodosDefecto;


public class Aplicacion implements MetodosDefecto {

	public static void main(String[] args) {
		
		Aplicacion A = new Aplicacion();
		
		A.metodoDefecto();
		A.metodoNormal();
		

	}
	
	
	public void metodoDefecto() {
		// TODO Auto-generated method stub
		System.out.println("Metodo defecto en la implementaci�n de la interfaz");
		
	}

	@Override
	public void metodoNormal() {
		// TODO Auto-generated method stub
		System.out.println("Metodo normal");
		
	}

}