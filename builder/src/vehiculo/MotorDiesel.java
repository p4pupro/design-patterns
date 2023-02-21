package vehiculo;

public class MotorDiesel implements IMotor{
	
	public String consumirCombustible() {
		return "Combustible Diesel";
		
	}
	public String inyectarCombustible(int valor) {
		
		return "Comubstible Diesel"+valor;
		
	}
	public String realizarEscape() {
		
		return "escape diesel";
		
	}
	public String realizarExpansion() {
		
		return "expacion diesel";
		
	}

}
