import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	Map<String, String> dicionario;

	public Dicionario() {
		this.dicionario = new HashMap<String, String>();
	}

	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		dicionario.remove(palavra);
	}

	public void exibirPalavras() {
		System.out.println(dicionario.entrySet());
	}

	public void pesquisarPorPalavra(String palavra) {
		System.out.println(dicionario.get(palavra));
	}
}
