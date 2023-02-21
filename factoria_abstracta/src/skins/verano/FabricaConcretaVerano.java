package skins.verano;

import skins.FactoriaSkin;
import skins.partes.AbrigoAbstracta;
import skins.partes.PrendaInferiorAbstracta;
import skins.partes.PrendaPiesAbstracta;
import skins.partes.PrendaSuperiorAbstracta;

public class FabricaConcretaVerano implements FactoriaSkin {

  public FabricaConcretaVerano(){
    System.out.println("Instanciada la factoria de verano");
  }

  @Override
  public PrendaSuperiorAbstracta crearPrendaSuperiorAbstracta() {
    return new PetoVerano();
  }

  @Override
  public PrendaInferiorAbstracta crearPrendaInferiorAbstracta() {
    return new PrendaInferiorCortaVerano();
  }

  @Override
  public PrendaPiesAbstracta crearPrendaPiesAbstracta() {
    return new CubrePiesVerano();
  }

  @Override
  public AbrigoAbstracta crearAbrigoAbstracta() { return new CapaVerano(); }
}
