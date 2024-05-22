import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoCodigoConvite(int codigoConvite) {
		if (!convidados.isEmpty()) {
			for (Convidado c : convidados) {
				if (codigoConvite == c.getCodigoConvite()) {
					convidados.remove(c);
					System.out.println("O convidado foi removido do conjunto com sucesso!");
				} 
			}
		} else {
			System.out.println("A lista está vázia...");
		}
	}
	
	public void contarConvidados() {
		System.out.println("O número total de convidados é: " + convidados.size());
	}
	
	public void exibirConvidados() {
		if (!convidados.isEmpty()) {
			for (Convidado c : convidados) {
				System.out.println("Nome: " + c.getNome() + ", Código Convite: " + c.getCodigoConvite());
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
	}
	
	
}
