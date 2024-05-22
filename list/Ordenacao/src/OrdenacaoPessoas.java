import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	List<Pessoa> pessoas;

	public OrdenacaoPessoas() {
		this.pessoas = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> idades = new ArrayList<>(pessoas);
		if (!pessoas.isEmpty()) {
			Collections.sort(idades);
		} else {
			System.out.println("A lista está vázia.");
		}
		return idades;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> alturas = new ArrayList<>(pessoas);
		if (!pessoas.isEmpty()) {
			Collections.sort(alturas, new ComparatorAltura());
		} else {
			System.out.println("A lista está vázia.");
		}
		return alturas;
	}

}
