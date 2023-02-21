package metodosDefecto;


public interface MetodosDefecto {
	
	
	// M�TODO ABSTRACTO CREACI�N
	public void metodoNormal();
	
	
	// M�TODO POR DEFECTO DE GESTI�N L�GICA DE NEGOCIO
	public default void metodoDefecto() {
		
		System.out.println("Implementaci�n por defecto del m�todo  por la interfaz.");
		
	}
	
	
	
	
}
