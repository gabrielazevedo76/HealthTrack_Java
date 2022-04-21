package br.com.fiap.tds;

public class ContaGratuita extends Conta{
	
	private boolean trial30Dias;
	private int qntSemanalRef;
	private int qntSemanalExerc;
	
	//Construtor
	public ContaGratuita(int qntSemanalRef, int qntSemanalExerc, boolean trial30Dias, String email, String senha, String tipoDeConta) {
		super(email, senha, tipoDeConta);
		this.trial30Dias = trial30Dias;
		this.qntSemanalRef = qntSemanalRef;
		this.qntSemanalExerc = qntSemanalExerc;
	}
	
	
	public void upgradeConta() {
		System.out.println("Upgrade realizado com sucesso!");
	}
	
	public void iniciarTrial30Dias() {
		System.out.println("Trial de 30 dias iniciado com sucesso!");
	}
	
	public boolean verificarQntRef(int qntSemanalRef) {
		
		return true;
	}
	
	public boolean verificarQntExerc(int qntSemanalExerc) {
		
		return true;
	}
	
	// Metodos Especiais - Getters/Setters
	public boolean isTrial30Dias() {
		return trial30Dias;
	}
	public void setTrial30Dias(boolean trial30Dias) {
		this.trial30Dias = trial30Dias;
	}
	public int getQntSemanalRef() {
		return qntSemanalRef;
	}
	public void setQntSemanalRef(int qntSemanalRef) {
		this.qntSemanalRef = qntSemanalRef;
	}
	public int getQntSemanalExerc() {
		return qntSemanalExerc;
	}
	public void setQntSemanalExerc(int qntSemanalExerc) {
		this.qntSemanalExerc = qntSemanalExerc;
	}
	
	

}
