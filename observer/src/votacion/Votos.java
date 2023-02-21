package votacion;

import java.util.ArrayList;

public class Votos implements Sujeto {
  private ArrayList<Observador> observadores;
  private int votos_p1;
  private int votos_p2;
  private int votos_p3;
  private int votos_p4;
  private int votos_p5;
  private String textoFaldon;

  public Votos() {
    observadores = new ArrayList<>();
  }

  @Override
  public void registrarObservador(Observador o) {
    observadores.add(o);
  }

  @Override
  public void borrarObservador(Observador o) {
    observadores.remove(o);
  }

  @Override
  public void notificar() {
    for (Observador observador : observadores) {
      observador.update();
    }
  }

  public void cambioVotos() {
    notificar();
  }

  public void establecerEstado(int votos1, int votos2, int votos3, int votos4, int votos5, String textoFaldon) {
    this.votos_p1 = votos1;
    this.votos_p2 = votos2;
    this.votos_p3 = votos3;
    this.votos_p4 = votos4;
    this.votos_p5 = votos5;
    this.textoFaldon = textoFaldon;
    cambioVotos();
  }
  public int getVotosP1() {
    return votos_p1;
  }
  public int getVotosP2() {
    return votos_p2;
  }
  public int getVotosP3() {
    return votos_p3;
  }
  public int getVotosP4() {
    return votos_p4;
  }
  public int getVotosP5() {
    return votos_p5;
  }
  public void setVotosP1(int votos) {
    this.votos_p1 = votos;
  }
  public void setVotosP2(int votos) {
    this.votos_p2 = votos;
  }
  public void setVotosP3(int votos) {
    this.votos_p3 = votos;
  }
  public void setVotosP4(int votos) {
    this.votos_p4 = votos;
  }
  public void setVotosP5(int votos) {
    this.votos_p5 = votos;
  }
  public String getTextoFaldon() {
    return textoFaldon;
  }
  public void setTextoFaldon(final String textoFaldon) {
    this.textoFaldon = textoFaldon;
  }
}
