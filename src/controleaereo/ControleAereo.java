package controleaereo;

import entidades.Aviao;
import entidades.Porte;
import entidades.TorreControle;

public class ControleAereo {

	public static void main(String[] args) {
		TorreControle torreControleGuarulhos = new TorreControle("Aeroporto de Guarulhos", true);	
		Aviao jatoGol = new Aviao(torreControleGuarulhos);
		jatoGol.setAutonomiaVoo(7);
		jatoGol.setCapacidadePassageiros(180);
		jatoGol.setCapacidadeTanqueCombustivel(2000);
		jatoGol.setModelo("737 Max");
		jatoGol.setPilotoAutomatico(true);
		jatoGol.setPorte(Porte.GRANDE);
		jatoGol.setPotencia(3000);
		jatoGol.setQuantidadeTripulacao(15);
		jatoGol.setQuantidadeTurbinas(2);
		jatoGol.setVelocidadeMaxima(900);
		
		jatoGol.pedirAutorizacaoDecolagem();

	}

}
