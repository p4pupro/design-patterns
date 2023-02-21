package calculadora;

public interface Sujeto {
    public void registrarObservador(Observador o);
    public void borrarObservador(Observador o);
    void notificarResultado();
    void notificarError();
}
