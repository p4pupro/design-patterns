package aventuras;


// UN DECORADOR CONCRETO (Complemento)


// DEBE HEREDAR DEL DECORADOR SUPERCLASE (Complemento)
public class Alquiler extends Complemento {


    // Y DELEGAR EL GRUESO DEL TRABAJO A SU SUPERCLASE

    public Alquiler(Aventura aventura) {

        // TANTO EL CONSTRUCTOR
        super(aventura);
    }

    public double precio() {

        System.out.println("precio() en Alquiler-> llamada a super y suma 200");

        // COMO LA IMPLEMENTACION DE LAS OPERACIOENS (precio)
        return super.precio() + 200;

    }


}
