package entidades;

public class Dirigivel extends Aeronave {

	public Dirigivel(TorreControle torreControle) {
		super(torreControle);
	}
	
	@Override
	public TipoAeronave getTipoAeronave() {
		return TipoAeronave.DIRIGIVEL;
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
