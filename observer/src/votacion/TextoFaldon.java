package votacion;

public class TextoFaldon implements Observador {

  private Votos datos;

  public TextoFaldon(Votos datos) {
    this.datos = datos;
    datos.registrarObservador(this);
  }

  @Override
  public void update() {
// mostrar los datos de las texto faldon
    System.out.println("Texto Faldon: ");
    System.out.println("ÚLTIMA HORA: " + this.datos.getTextoFaldon());

    System.out.println("-----------------------------------------------");
  }
}
