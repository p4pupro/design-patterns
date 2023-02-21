package votacion;

public class Main {

  public static void main(String[] args) {
    final Votos datos = new Votos();
    Observador escanos = new RepartoEscanos(datos);
    Observador estadisticas = new Estadisticas(datos);
    Observador faldon = new TextoFaldon(datos);

    datos.establecerEstado(100,200,10,5,0, "Primeros resultados, escrutinio del 10% de los votos emitidos.");
    datos.establecerEstado(200,230,10,55,10, "25% del voto escrutado, cambio entre las dos últimas posiciones.");
    datos.establecerEstado(270,280,110,95,110, "75% del voto escrutado, se ajustan los dos primeros y los tres últimos");
    datos.establecerEstado(350,325,300,100,110, "100% del voto escrutado. Finalmente la primera fuerza.");

  }

}
