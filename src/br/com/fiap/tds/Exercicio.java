package br.com.fiap.tds;

/** 
 * Exercicios que o Usuario realiza nos treinos
 */
public class Exercicio {
	//Atributos
	/** 
	 * Nome do exercicio 
	 */
	String name;

	// Metodos Personalizados
	/** 
	* Visualizar exercicio
	* Retorna todos os atributos da classe 
	*/
	public void visualizar() {
		System.out.println("Exercicio [name=" + name + "]");
	}
	
	/** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Criar novo Exercicio
	 * @param nome do exercicio
	 * */
	public void criarExercicio(String nome) {
		this.setName(nome);
		System.out.println("Nome " + nome + " alterado com sucesso!");
	}

	// Metodos Especiais - Getters/Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

