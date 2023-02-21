package skins.halloween;

import skins.FactoriaSkin;
import skins.partes.AbrigoAbstracta;
import skins.partes.PrendaInferiorAbstracta;
import skins.partes.PrendaPiesAbstracta;
import skins.partes.PrendaSuperiorAbstracta;

public class FabricaConcretaHalloween implements FactoriaSkin {

    public FabricaConcretaHalloween(){
      System.out.println("Instanciada la factoria de halloween");
    }

    @Override
    public PrendaSuperiorAbstracta crearPrendaSuperiorAbstracta() { return new CamisetaEsqueleto(); }

    @Override
    public PrendaInferiorAbstracta crearPrendaInferiorAbstracta() {
      return new MallasEsqueleto();
    }

    @Override
    public PrendaPiesAbstracta crearPrendaPiesAbstracta() {
      return new ZapatosCalabaza();
    }

    @Override
    public AbrigoAbstracta crearAbrigoAbstracta() { return new CapaNegra(); }
}
