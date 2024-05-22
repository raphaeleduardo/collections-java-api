import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	public List<Tarefa> tarefas;
	
	public ListaTarefas() {
		this.tarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao)  {
		Tarefa tarefa = new Tarefa(descricao);
		tarefas.add(tarefa);
		System.out.println("Tarefa adicionada com sucesso.");
	}
	
	public void removerTarefa(String descricao) {
		if (!tarefas.isEmpty()) {
			if (tarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao))) {
				System.out.println("Tarefa removida com sucesso...");
			} else {
					System.out.println("Esta tarefa não está na lista.");
			}
		} else {
			System.out.println("A lista está vazia...");
		}
	}
	
	public void obterNumeroTotalTarefas() {
		System.out.println("O número total de tarefas é: " + tarefas.size());
	}
	
	public void obterDescricoesTarefas() {
		for (Tarefa tarefa : tarefas) {
			System.out.println(tarefa.getDescricao());
		}
	}
}
