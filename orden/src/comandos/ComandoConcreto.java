package comandos;

public class ComandoConcreto implements Comando {
    private Receptor receptor;

    public ComandoConcreto(Receptor receptor) {
        this.receptor = receptor;
    }

    public void ejecutar() {
        receptor.accion1();
    }
}