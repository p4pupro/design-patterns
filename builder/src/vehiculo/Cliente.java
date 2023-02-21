package vehiculo;

public class Cliente {

	
	

	public static void main(String[] args) {

		VehiculoDirector directorAudi = new VehiculoDirector(new Audi3SportBuilder());

		// SE CONSTRUYE EL OBJETO A TRAVÉS DEL MÉTODO CORRESPONDIENTE.
		directorAudi.ConstruirVehiculo();
			
		//2) El director construye el vehiculo, delegando en el constructor la tarea de
		// creación de cada una de las piezas
		System.out.print(directorAudi.getPrestaciones());

		VehiculoDirector directorOpel= new VehiculoDirector(new OpelGrandSportBuilder());

		// SE CONSTRUYE EL OBJETO A TRAVÉS DEL MÉTODO CORRESPONDIENTE.
		directorOpel.ConstruirVehiculo();
			
		//2) El director construye el vehiculo, delegando en el constructor la tarea de
		// creación de cada una de las piezas
		System.out.print(directorOpel.getPrestaciones());
				
	}


}
