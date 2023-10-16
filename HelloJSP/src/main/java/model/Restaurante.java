package model;
public class Restaurante {
	private String nome;
	private int    qualidade;
	private int    escalaPreco;
	public Restaurante(String nome, int qualidade, 
                       int escalaPreco) {
		super();
		this.nome = nome;
		this.qualidade = qualidade;
		this.escalaPreco = escalaPreco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQualidade() {
		return qualidade;
	}
	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}
	public int getEscalaPreco() {
		return escalaPreco;
	}
	public void setEscalaPreco(int escalaPreco) {
		this.escalaPreco = escalaPreco;
	}
}