package entities;

public class Retangulo {
	private Double comprimento;
	private Double largura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public  double getComprimento() {
		return this.comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getLargura() {
		return this.largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double perimetro() {
		return (getLargura() * 2) + (getComprimento() * 2);
	}
	
	public double area() {
		return getLargura() * getComprimento();
	}
}
