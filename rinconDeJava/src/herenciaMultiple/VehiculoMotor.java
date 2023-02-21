package herenciaMultiple;

public class VehiculoMotor extends AparatoElectricoMecanico  implements Conducible, Mostrable {

	public VehiculoMotor(int consumo)
	{
		this.consumo = consumo;
	}
	
	public void iniciarMarcha() {
		// TODO Auto-generated method stub
		System.out.println("VM. Encendiendo motor");
		System.out.println("VM. Engranado marcha inicial");
		System.out.println("VM. Iniciando marcha");
		
	}
	public void detenerMarcha() {
		// TODO Auto-generated method stub
		System.out.println("VM. Frenando y reduciendo marchas");
		System.out.println("VM. Alcanzando velocidad 0");
		System.out.println("VM. Apagando motor");
		
	}
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("===============> Este es un vehículo a motor");
		System.out.print("===============> que consume ");
		System.out.println(this.consumo);
		
		
	}
}