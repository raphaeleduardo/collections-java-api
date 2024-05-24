import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	Map<String, Integer> contatos;

	public AgendaContatos() {
		this.contatos = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		contatos.put(nome, telefone);
	}

	public void removerContato(String nome) {
		contatos.remove(nome);
	}

	public void exibirContatos() {
		System.out.println(contatos.entrySet());
	}

	public void pesquisarPorNome(String nome) {
		System.out.println(contatos.get(nome));
	}

}
