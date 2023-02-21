package herenciaMultiple;

public class Aplicacion {

		
	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Conducible [] flota	= new Conducible[2];
		Mostrable [] vehiculos = new Mostrable[2];
		
		flota[0] = new VehiculoMotor(100);
		flota[1] = new VehiculoSinMotor();

		
		for (Conducible x : flota )
		{
			x.iniciarMarcha();
			x.detenerMarcha();

		}
		
		
		
		vehiculos[0] = new VehiculoMotor(100);
		vehiculos[1] = new VehiculoSinMotor();

		
		for (Mostrable x : vehiculos )
		{
			x.mostrar();
		}
		
	}

}
