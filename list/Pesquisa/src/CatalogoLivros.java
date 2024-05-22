import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	List<Livro> livros;

	public CatalogoLivros() {
		this.livros = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		livros.add(livro);
		System.out.println("Livro adicionado com sucesso...");
	}

	public void pesquisarPorAutor(String autor) {
		if (!livros.isEmpty()) {
			System.out.println("Livros de " + autor + ":");
			for (Livro l : livros) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					System.out.println("Titulo: " + l.getTitulo() + ", Ano: " + l.getAnoPublicacao());
				}
			}
		} else {
			System.out.println("A lista está vázia...");
		}
	}

	public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		if (!livros.isEmpty()) {
			System.out.println("Livros disponiveis no intervalo " + anoInicial + "-" + anoFinal);
			for (Livro l : livros) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					System.out.println("Titulo: " + l.getTitulo() + ", Autor: " + l.getAutor() + ", Ano de Publicação: "
							+ l.getAnoPublicacao());
				} 
			}
		} else {
			System.out.println("O catálogo está vázio...");
		}
	}

	public void pesquisarPorTitulo(String titulo) {
		if (!livros.isEmpty()) {
			for (Livro l : livros) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					System.out.println("Titulo: " + l.getTitulo() + ", Autor: " + l.getAutor() + ", Ano: " + l.getAnoPublicacao());
				} 
			}
		} else {
			System.out.println("A lista está vázia...");
		}
	}

}
