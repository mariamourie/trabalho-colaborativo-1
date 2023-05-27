package entities;

import java.util.ArrayList;

public class BalaDeCanhao {
	
	private double posX;
	private double posY;
	private double velX;
	private double velY;
	
	public BalaDeCanhao(double posX, double posY, double velX, double velY) {
		this.posX = posX;
		this.posY = posY;
		this.velX = velX;
		this.velY = velY;
	}

	public BalaDeCanhao(double velX, double velY) {
		this.posX = 0.0;
		this.posY = 0.0;
		this.velX = velX;
		this.velY = velY;
	}
	
	public void mover(double deltaSegundos) {
		double distanciaX = velX * deltaSegundos;
		double distanciaY = (velY * deltaSegundos) + ((-9.81 / 2) * Math.pow(deltaSegundos, 2));
		posX += distanciaX;
		posY += distanciaY; 
		velY += -9.81 * deltaSegundos;
	}
	
	public Ponto getLocalizacao() {
		return new Ponto(Math.floor(posX), Math.floor(posY));
	}
	
	public ArrayList<Ponto> atirar(double alpha, double v, double deltaSegundos) {
		ArrayList<Ponto> localizacoes = new ArrayList<>();
		velX = v * Math.cos(alpha);
		velY = v * Math.sin(alpha);
		while(posY != 0) {
			mover(deltaSegundos);
			localizacoes.add(getLocalizacao());
		}
		return localizacoes;
	}
}
