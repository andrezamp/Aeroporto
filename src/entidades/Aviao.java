package entidades;

public class Aviao extends Aeronave {
	private TipoAviao tipoAviao;
	private Porte porte;
	private boolean pilotoAutomatico;
	private int quantidadeTurbinas;
	private String pistaDecolagem;

	public Aviao(TorreControle torreControle) {
		super(torreControle);
	}

	@Override
	public void autorizarPouso(String local) {
	}

	@Override
	public void autorizarDecolagem(String local) {
		pistaDecolagem = local;
		System.out.println("Realizar Taxiamento até a " + pistaDecolagem);
	}

	@Override
	public TipoAeronave getTipoAeronave() {
		return TipoAeronave.AVIAO;
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

	public TipoAviao getTipoAviao() {
		return tipoAviao;
	}

	public void setTipoAviao(TipoAviao tipoAviao) {
		this.tipoAviao = tipoAviao;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public boolean isPilotoAutomatico() {
		return pilotoAutomatico;
	}

	public void setPilotoAutomatico(boolean pilotoAutomatico) {
		this.pilotoAutomatico = pilotoAutomatico;
	}

	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}

	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}
}
