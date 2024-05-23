import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<Produto>();
	}

	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtos.add(new Produto(cod, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> nomes = new TreeSet<>(new ComparatorNome());
		if (produtos.isEmpty()) {
			System.out.println("O conjunto está vázio...");
		} else {
			nomes.addAll(produtos);
		}
		return nomes;
	}

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> precos = new TreeSet<>(new ComparatorPreco());
		if (!produtos.isEmpty()) {
			precos.addAll(produtos);
		} else {
			System.out.println("O conjunto está vázio...");
		}
		return precos;
	}

}
