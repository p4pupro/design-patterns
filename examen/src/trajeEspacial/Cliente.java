package trajeEspacial;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private List<Actuador> actuadores;
	
	private VideoVigilancia videoVigilancia;
	private MonitorConstantesVitales monitorConstantesVitales;



	public Cliente() {

		// Crear los dispositivos (receptores)

		System.out.println("========= CREACIÓN DE DISPOSITIVOS ==========");
		videoVigilancia = new VideoVigilancia();
		monitorConstantesVitales = new MonitorConstantesVitales();
		System.out.println("=============================================");


		actuadores = new ArrayList<Actuador>();

	}
	
	
	public void configurar_seguimiento_nocturno() {

		actuadores.clear();

		Orden desactivarVideoVigilancia = new DesactivarVideoVigilancia(videoVigilancia);        // Crear la orden pasándole el receptor
		actuadores.add(new Actuador(desactivarVideoVigilancia));        								//  Crear el invocador y asociarlo con su orden

		Orden desactivarMonitorizacionConstantes = new DesactivarMonitorizacionConstantes(monitorConstantesVitales);
		actuadores.add(new Actuador(desactivarMonitorizacionConstantes));
			
	}
	
	public void configurar_seguimiento_diurno() {

		actuadores.clear();

		Orden activarVideoVigilancia = new ActivarVideoVigilancia(videoVigilancia);        // Crear la orden pasándole el receptor
		actuadores.add(new Actuador(activarVideoVigilancia));        							//  Crear el invocador y asociarlo con su orden

		Orden activarMonitorizacionConstantes = new ActivarMonitorizacionConstantes(monitorConstantesVitales);
		actuadores.add(new Actuador(activarMonitorizacionConstantes));
			
	}
	
	
	public void operar() {
			
		for (Actuador  actuador:actuadores)
			actuador.ejecutarOrden();
		
	}

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		System.out.println("Inicio configuración de seguimiento diurno.");
		cliente.configurar_seguimiento_diurno();
		cliente.operar();
		
		System.out.println("Inicio configuración de seguimiento nocturno.");
		
		cliente.configurar_seguimiento_nocturno();
		cliente.operar();

	}

}
