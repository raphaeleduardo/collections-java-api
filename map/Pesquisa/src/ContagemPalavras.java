import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	Map<String, Integer> palavras;

	public ContagemPalavras() {
		this.palavras = new HashMap<String, Integer>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
			palavras.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if (palavras.containsKey(palavra)) {
			palavras.remove(palavra);
		} else {
			System.out.println("A palavra não estpa na contagem...");
		}
	}
	
	public void exibirContagemPalavras() {
		int contagem = 0;
		for (int i : palavras.values()) {
			contagem += i;
		}
		System.out.println(contagem);
	}
	
	public void encontrarPalavraMaisFrequente() {
		int maisFrequente = Integer.MIN_VALUE;
		String palavra = "";
		if (!palavras.isEmpty()) {
			for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
				if (entry.getValue() > maisFrequente) {
					maisFrequente = entry.getValue();
					palavra = entry.getKey();
				}
			}
		} else {
			System.out.println("O mapa está vázio...");
		}
		System.out.println("A palavra mais frequente do mapa é: " + palavra + ", com " + maisFrequente + " repetições...");
	}
}
