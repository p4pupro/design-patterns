package comandos;

public class Cliente {
    public static void main(String[] args) {
        Receptor receptor = new Receptor();
        Comando comando = new ComandoConcreto(receptor); // Crear el comando pasándole el receptor
        Invocador invocador = new Invocador(comando);   //  Crear el invocador y asociarlo con su comando
        invocador.ejecutarComando();
    }
}
