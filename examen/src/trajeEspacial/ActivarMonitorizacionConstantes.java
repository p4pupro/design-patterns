package trajeEspacial;

public class ActivarMonitorizacionConstantes implements Orden {
	
	private MonitorConstantesVitales monitor;

	public ActivarMonitorizacionConstantes(MonitorConstantesVitales monitor) {
		this.monitor = monitor;
		
	}

	@Override
	public void ejecutar() {

		monitor.iniciar();

	}

}
