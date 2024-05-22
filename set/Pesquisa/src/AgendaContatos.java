import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	Set<Contato> contatos;

	public AgendaContatos() {
		this.contatos = new HashSet<Contato>();
	}

	public void adicionarContatos(String nome, int numero) {
		contatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		if (!contatos.isEmpty()) {
			for (Contato c : contatos) {
				System.out.println("Nome: " + c.getNome() + ", Número: " + c.getNumero());
			}
		} else {
			System.out.println("O conjunto está vazio...");
		}
	}
	
	public void pesquisarPorNome(String nome) {
		if (!contatos.isEmpty()) {
			for (Contato c : contatos) {
				if (nome.equalsIgnoreCase(c.getNome())) {
					System.out.println("O número do contato " + c.getNome() + " é: " + c.getNumero());
				}
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
	}
	
	public void atualizarNumeroContato(String nome, int numero) {
		if (!contatos.isEmpty()) {
			for (Contato c : contatos) {
				if (nome.equalsIgnoreCase(c.getNome())) {
					c.setNumero(numero);
					System.out.println("O número do contato " + c.getNome() + " foi atualizado para: " + c.getNumero());
				}
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
	}
	
}
