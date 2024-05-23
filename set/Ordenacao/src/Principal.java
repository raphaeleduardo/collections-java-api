
public class Principal {
	public static void main(String[] args) {

		// Teste cadastro de produtos
		CadastroProdutos cp = new CadastroProdutos();
		
		cp.adicionarProduto(1548786, "Arroz", 6.50, 2);
		cp.adicionarProduto(4845165, "Feijão", 15.75, 1);
		cp.adicionarProduto(3521474, "Macarrão", 2.15, 5);
		cp.adicionarProduto(7584512, "Batata", 2.30, 10);
		
		System.out.println(cp.exibirProdutosPorNome());
		System.out.println(cp.exibirProdutosPorPreco());		
		
		// Teste lista de alunos
		GerenciadorAlunos ga = new GerenciadorAlunos();
		
		ga.adicionarAluno("Rodrigo", 1L, 8.75);
		ga.adicionarAluno("Rubens", 3L, 6.5);
		ga.adicionarAluno("Rodolfo", 2L, 7.0);
		ga.adicionarAluno("Raphael", 4L, 10.0);
		
		System.out.println(ga.exibirAlunos());
		
		ga.removerAluno(3L);
		
		System.out.println(ga.exibirAlunos());
		
		System.out.println(ga.exibirAlunoPorNome());
		System.out.println(ga.exibirAlunoPorNota());
	}
}
