package vehiculo;

public abstract class VehiculoBuilder {

	// Se declara la referencia del productor a contruir CLASE CONSTRUCTORA

	
	protected Vehiculo c;

	public abstract void definirVehiculo();

	public abstract void construirRuedas();

	public abstract void construirHabitaculo();

	public abstract void construirMotor();

	public abstract void definirExtras();

	public  abstract String prestaciones();

	public Vehiculo getC() {
		return c;
	}

	public void setC(Vehiculo c) {
		this.c = c;
	}



	

}
