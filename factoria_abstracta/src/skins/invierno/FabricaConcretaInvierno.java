package skins.invierno;

import skins.FactoriaSkin;
import skins.partes.AbrigoAbstracta;
import skins.partes.PrendaInferiorAbstracta;
import skins.partes.PrendaPiesAbstracta;
import skins.partes.PrendaSuperiorAbstracta;

public class FabricaConcretaInvierno implements FactoriaSkin {

  public FabricaConcretaInvierno(){
    System.out.println("Instanciada la factoria de invierno");
  }

  @Override
  public PrendaSuperiorAbstracta crearPrendaSuperiorAbstracta() {
    return new SuperiorInvierno();
  }

  @Override
  public PrendaInferiorAbstracta crearPrendaInferiorAbstracta() {
    return new InferiorInvierno();
  }

  @Override
  public PrendaPiesAbstracta crearPrendaPiesAbstracta() {
    return new CubrePiesInvierno();
  }

  @Override
  public AbrigoAbstracta crearAbrigoAbstracta() { return new AbrigoInvierno(); }
}
