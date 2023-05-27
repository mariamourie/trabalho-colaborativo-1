package entities;

import java.util.ArrayList;

public class BalaDeCanhao {
	
	private double posX;
	private double posY;
	private double velX;
	private double velY;
	
	
	public BalaDeCanhao() {
	}

	public BalaDeCanhao(double velX, double velY) {
		this.posX = 0.0;
		this.posY = 0.0;
		this.velX = velX;
		this.velY = velY;
	}
	
	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getVelX() {
		return velX;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public double getVelY() {
		return velY;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}

	public void mover(double deltaSegundos) {
		double distanciaX = velX * deltaSegundos;
		double distanciaY = velY * deltaSegundos;
		setPosX(distanciaX);
		setPosY(distanciaY);
		setVelY(getVelY() - 9.81);
	}
	
	public Ponto getLocalizacao() {
		int x = (int) Math.round(posX);
		int y = (int) Math.round(posY);
		return new Ponto(x, y);
	}
	
	public ArrayList<Ponto> atirar(double alpha, double v, double deltaSegundos) {
		ArrayList<Ponto> pontos = new ArrayList<>();
		setVelX(v * Math.cos(alpha));
		setVelY(v * Math.sin(alpha));
		while(posY != 0) {
			mover(deltaSegundos);
			pontos.add(getLocalizacao());
		}
		return pontos;
	}
}
