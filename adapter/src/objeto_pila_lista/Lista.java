package objeto_pila_lista;


import java.util.ArrayList;

public class Lista {

    private ArrayList<Object> lista;


    public Lista() {
        System.out.println("Constructor de lista ");
        lista = new ArrayList<Object>();
    }

    public Object extractAt(int i)
    {
        System.out.println("Eliminacion y retorno del elemento de la lista en la posicion "+i);
        return null;
    }

    public Object showElementAt(int position)
    {
        System.out.println("Se muestra sin extraer el elemento en la posicion "+position);
        return null;
    }

    public void insertFirst(Object elemento)
    {
        System.out.println("Se inserta un elemento al comienzo de la lista ");
    }


    public void insertLast(Object elemento)
    {
        System.out.println("Se inserta un elemento al final de la lista ");
    }


}