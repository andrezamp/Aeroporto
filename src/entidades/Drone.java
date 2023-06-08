package entidades;

public class Drone extends Aeronave {
	
	public Drone(TorreControle torreControle) {
		super(torreControle);
	}

	@Override
	public TipoAeronave getTipoAeronave() {
		return TipoAeronave.DRONE;
	}
	
	@Override
	public void autorizarPouso(String local) {
	}

	@Override
	public void autorizarDecolagem(String local) {
	}

	@Override
	public void enviarMensagem(String mensagem) {
	}

	@Override
	public void pousar() {
	}

	@Override
	public void decolar() {
	}
}
