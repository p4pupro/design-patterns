package comandos;

public class Invocador {
    private Comando comando;

    public Invocador(Comando comando) {
        this.comando = comando ;
    }

    public void setComando(Comando comando ) {
        this.comando = comando;
    }

    public void ejecutarComando() {
        comando.ejecutar();
    }
}