package meteorologia;


public class AvisoHelada implements Observador {

    private double temperatura;
    private double humedad;
    private double presion;

    private DatosMeteorologicos datos;


    public AvisoHelada(DatosMeteorologicos datos) {


        this.datos = datos;
        datos.registrarObservador(this);
    }


    @Override
    public void actualizar(double temperatura, double humedad, double presion) {


        this.temperatura = temperatura;

        mostrarDatos();


    }

    public void mostrarDatos() {

        if (temperatura <0)

            System.out.println("< **** AVISO DE HELADA ****** >");

    }


}