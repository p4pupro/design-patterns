package polimorfismo;

public class Aplicacion {

		
	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Conducible [] flota	= new Conducible[2];
		
		
		flota[0] = new VehiculoMotor();
		flota[1] = new VehiculoSinMotor();
		
		for (Conducible x : flota )
		{
			x.iniciarMarcha();
			x.detenerMarcha();
		}
		
	}

}
