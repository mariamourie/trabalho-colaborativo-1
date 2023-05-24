package entities;

public class Cargueiro extends Navio {
	
	private int capacidadeCarga;

	public Cargueiro() {
		
	}
	
	public Cargueiro(String nome, String ano, int capacidadeCarga) {
		super(nome, ano);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		return "Navio de nome" + getNome() + ", com capacidade de carga em toneladas de " + capacidadeCarga;
	}	
}
