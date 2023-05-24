package entities;

public class Navio {
	
	private String nome;
	private String ano;
		
	public Navio() {
		super();
	}

	public Navio(String nome, String ano) {
		this.nome = nome;
		this.ano = ano;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Navio de nome " + nome + ", construído em " + ano;
	}
}
