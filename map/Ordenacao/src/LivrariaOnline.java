import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {

	Map<String, Livro> livros;

	public LivrariaOnline() {
		this.livros = new HashMap<String, Livro>();
	}

	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		livros.put(link, new Livro(titulo, autor, preco));
	}

	public void removerLivro(String titulo) {
		if (!livros.isEmpty()) {
			for (Livro l : livros.values()) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livros.remove(l, titulo);
				}
			}
		} else {
			System.out.println("O mapa está vázio...");
		}
	}

	public Map<String, Livro> exibirLivrosOrdenadorPorPreco() {
		List<Map.Entry<String, Livro>> porPreco = new ArrayList<>(livros.entrySet());
		Collections.sort(porPreco, new ComparatorPreco());

		Map<String, Livro> ordenados = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : porPreco) {
			ordenados.put(entry.getKey(), entry.getValue());
		}
		return ordenados;

	}

	public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
		List<Map.Entry<String, Livro>> porAutor = new ArrayList<>(livros.entrySet());
		Collections.sort(porAutor, new ComparatorAutor());

		Map<String, Livro> ordenados = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : porAutor) {
			ordenados.put(entry.getKey(), entry.getValue());
		}
		return ordenados;
	}

	public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
		Map<String, Livro> pesquisar = new LinkedHashMap<>();
		for (Map.Entry<String, Livro> entry : livros.entrySet()) {
			Livro livro = entry.getValue();
			if (livro.getAutor().equals(autor)) {
				pesquisar.put(entry.getKey(), livro);
			}
		}
		return pesquisar;
	}

	public List<Livro> obterLivroMaisCaro() {
		List<Livro> livrosPorPreco = new ArrayList<>();
		double maisCaro = Double.MIN_VALUE;

		if (!livros.isEmpty()) {
			for (Livro livro : livros.values()) {
				if (livro.getPreco() > maisCaro) {
					maisCaro = livro.getPreco();
				}
			}
		} else {
			throw new NoSuchElementException("A livraria está vazia!");
		}

		for (Map.Entry<String, Livro> entry : livros.entrySet()) {
			if (entry.getValue().getPreco() == maisCaro) {
				Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
				livrosPorPreco.add(livroComPrecoMaisAlto);
			}
		}
		return livrosPorPreco;
	}

	public List<Livro> obterLivroMaisBarato() {
		List<Livro> livrosPorPreco = new ArrayList<>();
		double maisBarato = Double.MAX_VALUE;

		if (!livros.isEmpty()) {
			for (Livro livro : livros.values()) {
				if (livro.getPreco() < maisBarato) {
					maisBarato = livro.getPreco();
				}
			}
		} else {
			throw new NoSuchElementException("A livraria está vazia!");
		}

		for (Map.Entry<String, Livro> entry : livros.entrySet()) {
			if (entry.getValue().getPreco() == maisBarato) {
				Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
				livrosPorPreco.add(livroComPrecoMaisBaixo);
			}
		}
		return livrosPorPreco;
	}

}
