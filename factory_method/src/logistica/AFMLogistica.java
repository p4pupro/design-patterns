package logistica;

import java.util.List;

public interface AFMLogistica {
	public MedioTrasporteAbstracto crearTrasporte();
	public default void gestionarTrasporte(int num) {
		MedioTrasporteAbstracto medioTrasporteAbstracto= crearTrasporte();
		medioTrasporteAbstracto.estableceRuta(1, 2, 3, 4);
		medioTrasporteAbstracto.iniciaRuta(1, 2, 3, 4);
	}

}
