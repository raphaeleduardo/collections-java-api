import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	Set<String> palavras;

	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<String>();
	}
	
	public void adicionarPalavars(String palavra) {
		palavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		palavras.remove(palavra);
	}
	
	public void verificarPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			for (String p : palavras) {
				if (p.equalsIgnoreCase(palavra)) {
					System.out.println("A palavra pertence ao conjunto");
				} 
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
	}
	
	public void exibirPalavrasUnicas() {
		if (!palavras.isEmpty()) {
			for (String p : palavras) {
				System.out.println(p);
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
	}
	
	
	
}
