package logistica;

public class CFMLogisticaCamion implements AFMLogistica {

	public CFMLogisticaCamion() {
		System.out.println("Instanciado CFMLogisticaCamion");
	}

	
	
	@Override
	public MedioTrasporteAbstracto crearTrasporte() {
		
		// A partir del jenguaje del sistema, genera letras de su abecedario
		
		return new Camion();
	}

}