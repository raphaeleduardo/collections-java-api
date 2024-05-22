import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

	Set<Tarefa> tarefas;

	public ListaTarefa() {
		this.tarefas = new HashSet<Tarefa>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao, false));
	}
	
	public void removerTarefa(String descricao) {
		if (!tarefas.isEmpty()) {
			for (Tarefa f : tarefas) {
				if (descricao.equalsIgnoreCase(f.getDescricao())) {
					tarefas.remove(f);
					System.out.println("Tarefa removida com sucesso...");
				}
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
	}
	
	public void exibirTarefas() {
		if (!tarefas.isEmpty()) {
			for (Tarefa f : tarefas) {
				System.out.println(f.toString());
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
	}
	
	public void contarTarefas() {
		int contador = 0;
		if (!tarefas.isEmpty()) {
			for (Tarefa f : tarefas) {
				contador++;
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
		System.out.println("Quantidade de Tarefas: " + contador);
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> concluidas = new HashSet<Tarefa>();
		if (!tarefas.isEmpty()) {
			for (Tarefa f : tarefas) {
				if (f.isConcluido() == true) {
					concluidas.add(f);
				}
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
		return concluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> pendentes = new HashSet<Tarefa>();
		if (!tarefas.isEmpty()) {
			for (Tarefa f : tarefas) {
				if (f.isConcluido() == false) {
					pendentes.add(f);
				}
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
		return pendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		if (!tarefas.isEmpty()) {
			for (Tarefa f : tarefas) {
				if (descricao.equalsIgnoreCase(f.getDescricao()) && f.isConcluido() == false) {
					f.setConcluido(true);
					System.out.println("A tarefa " + f.getDescricao() + ", foi concluida com sucesso.");
				}
			}
		} else {
			System.out.println("A lista está vázia...");
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		if (!tarefas.isEmpty()) {
			for (Tarefa f : tarefas) {
				if (f.isConcluido() == true && descricao.equalsIgnoreCase(f.getDescricao())) {
					f.setConcluido(false);
					System.out.println("A tarefa " + f.getDescricao() + ", foi marcada como pendente...");
				}
			}
		} else {
			System.out.println("A lista está vázia...");
		}
	}
	
	public void limparListaTarefas() {
		tarefas.clear();
	}
	
	
	
}
