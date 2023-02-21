package aventuras;

public class Agencia {
    public static void main(String[] args) {

        // Construcción paso a paso
        Aventura aventura = new Rafting();

        aventura = new Alquiler(aventura);
        aventura = new Seguro(aventura);
        aventura = new Reportaje(aventura);

        System.out.println(aventura.precio());


        // Construccion por contructor decorado
        aventura = new Seguro(new Seguro(new Reportaje(new Alquiler(new Espeleologia()))));
        System.out.println(aventura.precio());


        // Construccion por contructor decorado
        aventura = new Alquiler(new Seguro(new Seguro(new Reportaje(new Alquiler(new Tirolinas())))));
        System.out.println(aventura.precio());


    }
}
