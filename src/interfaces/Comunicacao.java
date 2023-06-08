package interfaces;

import entidades.TipoAeronave;

public interface Comunicacao {
	public void autorizarPouso(String local);
	public void autorizarDecolagem(String local);
	public void enviarMensagem(String mensagem);
	public TipoAeronave getTipoAeronave();
}
