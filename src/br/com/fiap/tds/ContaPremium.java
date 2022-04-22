package br.com.fiap.tds;

import java.util.Date;

public class ContaPremium extends Conta{

	private float anualidade;
	private Date dataAbertura;
	private boolean pgAutomatico;
	private boolean opcaoDarkMode;
	private int qntReferencialNovosUsuarios;
	
	//Construtor
	public ContaPremium(float anualidade, Date dataAbertura, boolean pgAutomatico, boolean opcaoDarkmode,String email, String senha, String tipoDeConta) {
		super(email, senha, tipoDeConta);
		this.anualidade = anualidade;
		this.dataAbertura = new Date();
		this.pgAutomatico = true;
	}
	
	// Metodos Personalizados
	
	/** 
	 * Vizualizar historico de pagamentos
	 */
	public void visualizarHistoricoPg() {
		System.out.println("Historico de pagamento");
	}
	
	/** 
	 * Aplicar desconto de acordo com a quantidade de referencias
	 */
	public float aplicarDesconto(int qntReferencialNovosUsuarios) {
		if(qntReferencialNovosUsuarios >= 10 ) {
			this.anualidade = ((5 / 100f)  * this.anualidade);
		}else if(qntReferencialNovosUsuarios >= 20) {
			this.anualidade = ((10 / 100f)  * this.anualidade);
		}else if (qntReferencialNovosUsuarios >= 30) {
			this.anualidade = ((15 / 100f)  * this.anualidade);
		}
		
		return this.anualidade;
	}
	
	/** 
	 * Aplicar o tema escuro
	 */
	public void aplicarDarkMode() {
		System.out.println("Dark mode aplicado");
	}
	
	
	// Metodos Especiais - Getters/Setters
	public Date getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}


	public boolean isPgAutomatico() {
		return pgAutomatico;
	}


	public void setPgAutomatico(boolean pgAutomatico) {
		this.pgAutomatico = pgAutomatico;
	}


	public boolean isOpcaoDarkMode() {
		return opcaoDarkMode;
	}


	public void setOpcaoDarkMode(boolean opcaoDarkMode) {
		this.opcaoDarkMode = opcaoDarkMode;
	}


	public int getQntReferencialNovosUsuarios() {
		return qntReferencialNovosUsuarios;
	}


	public void setQntReferencialNovosUsuarios(int qntReferencialNovosUsuarios) {
		this.qntReferencialNovosUsuarios = qntReferencialNovosUsuarios;
	}



	public float getAnualidade() {
		return anualidade;
	}

	public void setAnualidade(float anualidade) {
		this.anualidade = anualidade;
	}
	
}
