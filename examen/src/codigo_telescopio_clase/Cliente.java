package codigo_telescopio_clase;

public class Cliente {

	// EL CLIENTE SÓLO USA LA INTERFAZ OBJETIVO
 	LocalizadorMesonesio locM;

	 // AUNQUE SABE QUE TIENE QUE USAR UN ADAPTADOR
    public Cliente() {
		this.locM = new AdaptadorActualesAMesonesias();
	}

	public static void main (String [] args)
	{
		// USANDO EL CLIENTE
		Cliente cliente_mesonesio = new Cliente();
		System.out.println("Localizador Mesonesio: inicio de la ubicación de granulos =========>");
		cliente_mesonesio.locM.ubicarGranulos();
		System.out.println("Localizador Mesonesio: inicio de la ubicación de planares =========>");
		cliente_mesonesio.locM.ubicarPlanares();
		System.out.println("Localizador Mesonesio: inicio de la ubicación de semicuantos =========>");
		cliente_mesonesio.locM.ubicarSemicuantos();

	}
}