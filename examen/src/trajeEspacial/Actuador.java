package trajeEspacial;

public class Actuador {

    Orden orden;


    public Actuador(Orden orden) {

        this.orden = orden;

    }

    public void setOrden(Orden orden ) {

        this.orden = orden;
    }

    public void ejecutarOrden () {

        orden.ejecutar();
    }
}
