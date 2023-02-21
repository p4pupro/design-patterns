package votacion;

import java.text.DecimalFormat;

class Estadisticas implements Observador {
  private Votos datos;

  public Estadisticas(Votos datos) {
    this.datos = datos;
    datos.registrarObservador(this);
  }

  @Override
  public void update() {
    DecimalFormat df = new DecimalFormat("#.##");
    final double totalVotos = this.datos.getVotosP1() + this.datos.getVotosP2() + this.datos.getVotosP3() + this.datos.getVotosP4() + this.datos.getVotosP5();
    // mostrar los datos de las estadísticas
    System.out.println("Estadisticas: ");
    System.out.println("Porcentaje de votos del partido 1: " + df.format(this.datos.getVotosP1() / totalVotos * 100) + "%");
    System.out.println("Porcentaje de votos del partido 2: " + df.format(this.datos.getVotosP2() / totalVotos * 100) + "%");
    System.out.println("Porcentaje de votos del partido 3: " + df.format(this.datos.getVotosP3() / totalVotos * 100) + "%");
    System.out.println("Porcentaje de votos del partido 4: " + df.format(this.datos.getVotosP4() / totalVotos * 100) + "%");
    System.out.println("Porcentaje de votos del partido 5: " + df.format(this.datos.getVotosP5() / totalVotos * 100) + "%");
    System.out.println("-----------------------------------------------");
  }
}
