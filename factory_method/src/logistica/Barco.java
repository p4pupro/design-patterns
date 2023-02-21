package logistica;

public class Barco implements MedioTrasporteAbstracto {

	public Barco() {
		System.out.println("======> SOLICITADO REPARTO POR BARCO");
	}

	@Override
	public void display() {
		System.out.println("Display de la imagen con Barco");
		
	}


	@Override
	public void estableceRuta(int coord_x_ini, int coord_y_ini, int coord_x_fin, int coord_y_fin) {
		// TODO Auto-generated method stub
		System.out.printf("ESTABLECIENDO RUTA DE BARCO de %d,%d a %d,%d\n",coord_x_ini, coord_y_ini, coord_x_fin, coord_y_fin);
		for (int i=0; i < 100; i++) System.out.print("c");
		System.out.println();
		
	}

	@Override
	public void iniciaRuta(int coord_x_ini, int coord_y_ini, int coord_x_fin, int coord_y_fin) {
		// TODO Auto-generated method stub
		System.out.printf("INICIANDO RUTA DE BARCO de %d,%d a %d,%d\n",coord_x_ini, coord_y_ini, coord_x_fin, coord_y_fin);
		for (int i=0; i < 100; i++) System.out.print("C");
		System.out.println("CONSULTE EL ESTADO EN NUESTRA WEB");		
	}	
	
	
}
