package skins;

import skins.halloween.FabricaConcretaHalloween;
import skins.invierno.FabricaConcretaInvierno;
import skins.verano.FabricaConcretaVerano;

public class Main {


  public static void main(String[] args) {
    System.out.println("----------------------------------------");
    Cliente skin_verano = new Cliente(new FabricaConcretaVerano());
    skin_verano.crearProductos();
    System.out.println("----------------------------------------");

    Cliente skin_invierno = new Cliente( new FabricaConcretaInvierno());
    skin_invierno.crearProductos();
    System.out.println("----------------------------------------");

    Cliente skin_halloween = new Cliente( new FabricaConcretaHalloween());
    skin_halloween.crearProductos();
    System.out.println("----------------------------------------");
  }
}
