package logistica;

public class Aplicacion {
	


	public static void main(String[] args) {
		
		AFMLogistica aFMLogistica;
		
		aFMLogistica= new CFMLogisticaBarco();
		aFMLogistica.gestionarTrasporte(1);
		
		aFMLogistica= new CFMLogisticaBici();
		aFMLogistica.gestionarTrasporte(2);		
		
		aFMLogistica= new CFMLogisticaCamion();
		aFMLogistica.gestionarTrasporte(3);		
		
	}

}