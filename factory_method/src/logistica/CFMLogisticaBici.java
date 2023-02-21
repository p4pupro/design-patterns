package logistica;

public class CFMLogisticaBici implements AFMLogistica {

	public CFMLogisticaBici() {
		System.out.println("Instanciado CFMLogisticaBici");
	}

	@Override
	public MedioTrasporteAbstracto crearTrasporte() {

		// A partir del jenguaje del sistema, genera letras de su abecedario

		return new Bici();
	}

}