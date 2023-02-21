package skins;

import skins.partes.AbrigoAbstracta;
import skins.partes.PrendaInferiorAbstracta;
import skins.partes.PrendaPiesAbstracta;
import skins.partes.PrendaSuperiorAbstracta;

public interface FactoriaSkin {

    PrendaSuperiorAbstracta crearPrendaSuperiorAbstracta();
    PrendaInferiorAbstracta crearPrendaInferiorAbstracta();
    PrendaPiesAbstracta crearPrendaPiesAbstracta();
    AbrigoAbstracta crearAbrigoAbstracta();
}
