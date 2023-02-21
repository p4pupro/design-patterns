package minimando;


public class BajarCalefaccion implements Orden {

    private Calefaccion calefaccion;


    public BajarCalefaccion(Calefaccion calefaccion) {
        this.calefaccion = calefaccion;

    }


    @Override
    public void ejecutar() {


        calefaccion.bajar();


    }


}
