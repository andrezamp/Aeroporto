package entidades;

public class Helicoptero extends Aeronave {

	private int quantidadeHelices;
	private int potenciaPropulsaoVertical;

	public Helicoptero(TorreControle torreControle) {
		super(torreControle);
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

	@Override
	public TipoAeronave getTipoAeronave() {
		return TipoAeronave.HELICOPTERO;
	}
}
