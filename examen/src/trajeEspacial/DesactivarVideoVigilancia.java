package trajeEspacial;

public class DesactivarVideoVigilancia implements Orden {
	
	private VideoVigilancia videoVigilancia;

	public DesactivarVideoVigilancia(VideoVigilancia videoVigilancia) {
		this.videoVigilancia = videoVigilancia;
		
	}

	@Override
	public void ejecutar() {

		videoVigilancia.desactivar();

	}

}
