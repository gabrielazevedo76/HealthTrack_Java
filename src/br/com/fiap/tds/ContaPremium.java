package br.com.fiap.tds;


public class ContaPremium extends Conta{

	private float anualidade;
	
	//Construtor
	public ContaPremium(float anualidade, String email, String senha, String tipoDeConta) {
		super(email, senha, tipoDeConta);
		this.anualidade = anualidade;
	}
	
	
	// Metodos Especiais - Getters/Setters
	public float getAnualidade() {
		return anualidade;
	}

	public void setAnualidade(float anualidade) {
		this.anualidade = anualidade;
	}
	
}
