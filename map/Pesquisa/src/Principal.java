
public class Principal {

	public static void main(String[] args) {
		
		// Teste Estoque de Produtos
		EstoqueProdutos ep = new EstoqueProdutos();
		
		ep.adicionarProduto(1, "Macarrão", 500, 2.50);
		ep.adicionarProduto(2, "Arroz", 300, 5.75);
		ep.adicionarProduto(3, "Feijão", 300, 16.15);
		ep.adicionarProduto(4, "Cuscuz", 500, 1.09);
		ep.adicionarProduto(5, "Molho de Tomate", 750, 2.50);
		ep.adicionarProduto(6, "Picanha", 50, 99.90);
		ep.adicionarProduto(7, "Filé de Peito de Frango", 250, 22.35);
		
		ep.exibirProduto();
		
		System.out.println(ep.calcularValorTotalEstoque());
		System.out.println(ep.obterProdutoMaisCaro());
		System.out.println(ep.obterProdutoMaisBarato());
		System.out.println(ep.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
		// Teste Contagem de Palavras
		ContagemPalavras cp = new ContagemPalavras();
		
		cp.adicionarPalavra("Amor", 10);
		cp.adicionarPalavra("Paz", 2);
		cp.adicionarPalavra("Felicidade", 5);
		
		cp.removerPalavra("Luz");
		cp.exibirContagemPalavras();
		
		cp.removerPalavra("Amor");
		cp.encontrarPalavraMaisFrequente();

	}

}
