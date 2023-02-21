package vehiculo;


//Clase directora
public class VehiculoDirector {
	private VehiculoBuilder builder;
	
	public VehiculoDirector(VehiculoBuilder vb) {
		this.builder=vb;
	}
	
	public void ConstruirVehiculo() {
		builder.definirVehiculo();
		builder.construirHabitaculo();
		builder.construirMotor();
		builder.construirRuedas();
	}
	
	public String getPrestaciones() {
	return	builder.prestaciones();
	}

	public VehiculoBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(VehiculoBuilder builder) {
		this.builder = builder;
	}
	
	

}
