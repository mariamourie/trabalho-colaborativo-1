package entities;

public class Cruzeiro extends Navio {
	
	private int numMax;

	public Cruzeiro(String nome, String ano, int numMax) {
		super(nome, ano);
		this.numMax = numMax;
	}

	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int numMax) {
		this.numMax = numMax;
	}

	@Override
	public String toString() {
		return "Cruzeiro de nome " + getNome() + ",com capacidade máxima de comportar " + numMax + " passageiros. ";
	}
}
