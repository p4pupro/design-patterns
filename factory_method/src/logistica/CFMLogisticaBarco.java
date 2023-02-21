package logistica;

public class CFMLogisticaBarco implements AFMLogistica {

	public CFMLogisticaBarco() {
		System.out.println("Instanciado CFMLogisticaBarco");
	}

	@Override
	public MedioTrasporteAbstracto crearTrasporte() {

		// A partir del jenguaje del sistema, genera letras de su abecedario

		return new Barco();
	}
	
public  void gestionarTrasporte(int num) {
		

	System.out.println("metodo distintos");
	
	}


}