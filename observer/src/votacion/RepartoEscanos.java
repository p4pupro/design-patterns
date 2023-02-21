package votacion;

class RepartoEscanos implements Observador {
  private Votos datos;

  public RepartoEscanos(Votos datos) {
    this.datos = datos;
    datos.registrarObservador(this);
  }

  @Override
  public void update() {
    // mostrar los datos del reparto de escaños
    System.out.println("Reparto Escaños: ");
    System.out.println("Votos del partido 1: " + this.datos.getVotosP1());
    System.out.println("Votos del partido 2: " + this.datos.getVotosP2());
    System.out.println("Votos del partido 3: " + this.datos.getVotosP3());
    System.out.println("Votos del partido 4: " + this.datos.getVotosP4());
    System.out.println("Votos del partido 5: " + this.datos.getVotosP5());
    System.out.println("-----------------------------------------------");
  }
}