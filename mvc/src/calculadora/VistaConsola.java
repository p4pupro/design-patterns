package calculadora;

public class VistaConsola implements Observador {
    private Controlador controlador;




    // EN EL CONSTRUCTOR, SE ASIGNA SU CONTROLADOR (ESTO CAMBIA YA QUE NO
    // HAY REFERENCIA DIRECTA AL MODELO ) Y SE LE PIDE AL CONTROLADOR
    // QUE REGISTRE LA VISTA
    public VistaConsola(Controlador controlador){
        this.controlador = controlador;
        this.controlador.registrarObservador(this);
    }



    // LA VISTA MUESTRA EL ERROR Y LOS RESULTADOS COMO CONSIDERE
    @Override
    public void actualizarResultado(double dato) {
        System.out.println("Resultado: " + dato);
    }
    @Override
    public void actualizarError(String message) {
        System.err.println(message);
        System.err.flush();
    }
}
