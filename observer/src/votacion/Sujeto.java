package votacion;

public interface Sujeto {
  void registrarObservador(Observador o);
  void borrarObservador(Observador o);
  void notificar();
}
