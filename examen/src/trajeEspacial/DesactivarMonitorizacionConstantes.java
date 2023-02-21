package trajeEspacial;

public class DesactivarMonitorizacionConstantes implements Orden {
    private MonitorConstantesVitales monitor;

    public DesactivarMonitorizacionConstantes(MonitorConstantesVitales monitor) {
        this.monitor = monitor;

    }

    @Override
    public void ejecutar() {

        monitor.pausar();

    }
}
