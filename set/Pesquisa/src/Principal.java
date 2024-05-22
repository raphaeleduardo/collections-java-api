
public class Principal {

	public static void main(String[] args) {

		// Teste agenda de contatos
		AgendaContatos ac = new AgendaContatos();

		ac.adicionarContatos("Joaquim", 999999999);
		ac.adicionarContatos("Joaquina", 888888888);
		ac.exibirContatos();

		ac.pesquisarPorNome("Joaquim");

		ac.atualizarNumeroContato("Joaquina", 777777777);

		// Lista de tarefas
		ListaTarefa lt = new ListaTarefa();

		lt.adicionarTarefa("Comer");
		lt.adicionarTarefa("Dançar");
		lt.adicionarTarefa("Pedalar");
		lt.adicionarTarefa("Correr");
		lt.adicionarTarefa("Beber Água");
		lt.exibirTarefas();
		System.out.println();

		lt.removerTarefa("Dançar");
		lt.exibirTarefas();
		System.out.println();

		lt.contarTarefas();
		System.out.println();

		lt.marcarTarefaConcluida("Beber Água");
		lt.marcarTarefaConcluida("Pedalar");
		lt.marcarTarefaConcluida("Correr");
		System.out.println();

		lt.marcarTarefaPendente("Correr");

		System.out.println(lt.obterTarefasConcluidas());
		System.out.println(lt.obterTarefasPendentes());

		lt.limparListaTarefas();

		lt.exibirTarefas();
		lt.obterTarefasConcluidas();
		lt.obterTarefasPendentes();
	}

}
