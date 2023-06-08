package entidades;

import interfaces.Comunicacao;

public class TorreControle {

	private String nomeAeroporto;
	private boolean ativa;

	public TorreControle(String aeroporto, boolean ativa) {
		this.nomeAeroporto = aeroporto;
		this.ativa = ativa;
	}

	public void pedirRequisicaoDecolagem(Comunicacao objetoComunicacao) {
		String tipoLocalRetorno = "";
		switch (objetoComunicacao.getTipoAeronave()) {
		case AVIAO:
			tipoLocalRetorno = "Pista ";
			break;
		case DIRIGIVEL:
			tipoLocalRetorno = "Plataforma ";
			break;
		case DRONE:
			tipoLocalRetorno = "Campo ";
			break;
		case HELICOPTERO:
			tipoLocalRetorno = "Heliponto ";
			break;
		}
		objetoComunicacao.autorizarDecolagem(tipoLocalRetorno + "40");
	}

	public String getAeroporto() {
		return nomeAeroporto;
	}

	public void setAeroporto(String aeroporto) {
		this.nomeAeroporto = aeroporto;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

}
