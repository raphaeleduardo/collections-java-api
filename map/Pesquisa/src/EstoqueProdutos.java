import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	Map<Long, Produto> produtos;

	public EstoqueProdutos() {
		this.produtos = new HashMap<Long, Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		produtos.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProduto()  {
		System.out.println(produtos.entrySet());
	}
	
	public Double calcularValorTotalEstoque() {
		double totalEstoque = 0;
		if (!produtos.isEmpty()) {
			for (Produto p : produtos.values()) {
				totalEstoque += p.getPreco() * p.getQuantidade();
			}
		} else {
			System.out.println("O mapa está vázio...");
		}
		return totalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto maisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!produtos.isEmpty()) {
			for (Produto p : produtos.values()) {
				if (p.getPreco() > maiorPreco) {
					maisCaro = p;
					maiorPreco = p.getPreco();
				} 
			}
		} else {
			System.out.println("O mapa está vázio...");
		}
		return maisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto maisBarato = null;
		double menorValor = Double.MAX_VALUE;
		if (!produtos.isEmpty()) {
			for (Produto p : produtos.values()) {
				if (p.getPreco() < menorValor) {
					menorValor = p.getPreco();
					maisBarato = p;
				}
			}
		} else {
			System.out.println("O mapa está vázio...");
		}
		return maisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto maiorEstoque = null;
		double maiorValorTotal = Double.MIN_VALUE;
		if (!produtos.isEmpty()) {
			for (Produto p : produtos.values()) {
				if ((p.getPreco() * p.getQuantidade()) > maiorValorTotal) {
					maiorEstoque = p;
					maiorValorTotal = p.getPreco() * p.getQuantidade();
				}
			}
		} else {
			System.out.println("O mapa está vázio...");
		}
		return maiorEstoque;
	}	
}
