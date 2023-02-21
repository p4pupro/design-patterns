package skins;

import skins.partes.AbrigoAbstracta;
import skins.partes.PrendaInferiorAbstracta;
import skins.partes.PrendaPiesAbstracta;
import skins.partes.PrendaSuperiorAbstracta;

public class Cliente {

  FactoriaSkin factoriaSkin;
  PrendaSuperiorAbstracta prendaSuperiorAbstracta;
  PrendaInferiorAbstracta prendaInferiorAbstracta;
  PrendaPiesAbstracta prendaPiesAbstracta;
  AbrigoAbstracta abrigoAbstracta;

  public Cliente(FactoriaSkin fk) {
    factoriaSkin = fk;
  }

  public void crearProductos() {
    // DELEGA LA CREACIÓN DE LA PRENDAS EN LA FACTORIAS QUE TENGA
    // Se puede invocar a los metodos de cada factoria concreta
    prendaSuperiorAbstracta = factoriaSkin.crearPrendaSuperiorAbstracta();
    prendaInferiorAbstracta = factoriaSkin.crearPrendaInferiorAbstracta();
    prendaPiesAbstracta = factoriaSkin.crearPrendaPiesAbstracta();
    abrigoAbstracta = factoriaSkin.crearAbrigoAbstracta();
  }
}
