package trajeEspacial;

public class ActivarVideoVigilancia implements Orden {
    private VideoVigilancia videoVigilancia;

    public ActivarVideoVigilancia(VideoVigilancia videoVigilancia) {
        this.videoVigilancia = videoVigilancia;

    }

    @Override
    public void ejecutar() {

        videoVigilancia.activar();

    }
}
