package br.com.fiap.tds;
import java.util.Date;
/**
 * @author Ellen Gomes
 * @author Gabriel Almeida
 * @author Pablo Witt
 * @author Rafael Costa
 * @version 1.0
 *
 * */

public class TesteMain {
	public static void main(String[]args) {
		/**
		 * Instancia da classe usuario
		 */
		Usuario user1 = new Usuario();
		Date nascimento = new Date();
		user1.adicionarUsuario("Haka", nascimento, "masculino", "estudante", 1.69f);
		user1.editarAltura(1.71f);
		user1.editarGenero("Nao desejo informar");
		user1.editarIdade(nascimento);
		user1.editarNome("Grupo Haka");
		user1.editarProfissao("desenvolvedor");
		user1.visualizarUsuario();
		user1.deletarUsuario();
	
		/**
		 * Instancia da classe treinamento
		 */
		Treinamento treinamento1 = new Treinamento();
		Date dataExercicio = new Date();
		Date dataDuracao = new Date();
		Date dataHorario = new Date();
		treinamento1.criarTreinamento(dataExercicio, dataDuracao, "Alta", 5, dataHorario);
		Exercicio exercicio1 = new Exercicio();
		exercicio1.name = "Pular corda";
		treinamento1.adicionarExercicio(exercicio1);
		treinamento1.editarDuracao(dataExercicio);
		treinamento1.editarIntensidade("Media");
		treinamento1.visualizarTreinamento();
		treinamento1.deletarTreinamento();
		
		
	}
}
	
	
