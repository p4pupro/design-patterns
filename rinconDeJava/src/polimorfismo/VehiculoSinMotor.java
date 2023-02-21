package polimorfismo;

public class VehiculoSinMotor implements Conducible {

	public VehiculoSinMotor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void iniciarMarcha() {
		// TODO Auto-generated method stub
		System.out.println("VSM. Ejercer fuerza en el dispositivo de movimiento del vehículo");
		
	}

	@Override
	public void detenerMarcha() {
		// TODO Auto-generated method stub
		System.out.println("VSM. Reducir fuerza en el dispositivo de movimiento y frenar");
		System.out.println("VSM. Alcanzar velocidad cero");
	}

}
