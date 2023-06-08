package entidades;

import interfaces.Comunicacao;
import interfaces.Procedimento;

public abstract class Aeronave implements Comunicacao, Procedimento {

	private String modelo;
	private int potencia;
	private int quantidadeTripulacao;
	private int capacidadePassageiros;
	private int velocidadeMaxima;
	private int autonomiaVoo;
	private int capacidadeTanqueCombustivel;
	private TorreControle torreControle;

	public Aeronave(TorreControle torreControle) {
		this.torreControle = torreControle;
	}

	public void pedirAutorizacaoDecolagem() {
		if (torreControle.isAtiva()) {
			torreControle.pedirRequisicaoDecolagem(this);
		} else {
			System.out.print("Torre de Controle Inativa");
		}
	}

	public TorreControle getTorreControle() {
		return torreControle;
	}

	public void setTorreControle(TorreControle torreControle) {
		this.torreControle = torreControle;
	}

	public int getQuantidadeTripulacao() {
		return quantidadeTripulacao;
	}

	public void setQuantidadeTripulacao(int quantidadeTripulacao) {
		this.quantidadeTripulacao = quantidadeTripulacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getAutonomiaVoo() {
		return autonomiaVoo;
	}

	public void setAutonomiaVoo(int autonomiaVoo) {
		this.autonomiaVoo = autonomiaVoo;
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

	public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
	}

}
