package aventuras;



public class Reportaje extends Complemento {


    public Reportaje(Aventura aventura) {


        super(aventura);
    }

    public double precio() {

        System.out.println("precio() en Reportaje -> llamada a super y suma 100");
        return super.precio() + 100;

    }


}