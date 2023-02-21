package logistica;

public interface MedioTrasporteAbstracto {
	public void estableceRuta(int coord_x_ini, int coord_y_ini, int coord_x_fin, int coord_y_fin);
	public void iniciaRuta(int coord_x_ini, int coord_y_ini, int coord_x_fin, int coord_y_fin);
	public void display();

}
