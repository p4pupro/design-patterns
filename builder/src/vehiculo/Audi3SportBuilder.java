package vehiculo;

public class Audi3SportBuilder extends VehiculoBuilder {

	private Vehiculo v;
	public Audi3SportBuilder () {
		System.out.println("Instanciado Audi3SportBuilder");
	}
	public  void definirVehiculo() {
		
		v= new Vehiculo();
		v.marca="AUDI";
		v.modelo="A SPORT";
	}

	public  void construirRuedas() {
		
		v.tipoRuedas= new Rueda();
		v.tipoRuedas.diametro=17;
		v.tipoRuedas.llanta="Aluminio";
		v.tipoRuedas.neomatico="Michelin";
		
			}

	public  void construirHabitaculo() {
		
		v.tipoCarroceria= new Carroceria();
		v.tipoCarroceria.habitaculoReforazado=true;
		v.tipoCarroceria.material="piel";
		v.color="Rojo";
		v.tipoCarroceria.tipoCarroceria="Deportivo";
	}

	public  void construirMotor() {
		
		v.motor= new MotorDiesel();
	}

	public  void definirExtras() {
		
		
		v.cierreCentralizado = true;
		v.direccionAsistida = true;
		
		
	}

	@Override
	public String prestaciones() {
		return v.getPrestaciones();
	}


}

