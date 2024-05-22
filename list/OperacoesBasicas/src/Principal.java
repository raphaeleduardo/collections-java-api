import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Teste lista de tarefas
		ListaTarefas tarefas = new ListaTarefas();
		
		System.out.println("Digite a descrição da tarefa que deseja adicionar: ");
		String adicionar = sc.nextLine();
		
		tarefas.adicionarTarefa(adicionar);
		tarefas.obterDescricoesTarefas();
		tarefas.obterNumeroTotalTarefas();
		
		System.out.println("Digite a descrição da tarefa que deseja remover: ");
		String remover = sc.nextLine();
		tarefas.removerTarefa(remover);
		
		
		// Teste carrinho de compras
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		System.out.println("Digite o nome do item: ");
		String nome = sc.nextLine();
		System.out.println("Digite o preco do item: ");
		double preco = sc.nextDouble();
		System.out.println("Digite a quantidade do item: ");
		int quantidade = sc.nextInt();
		
		carrinho.adicionarItem(nome, preco, quantidade);
		carrinho.calcularValorTotal();
		carrinho.exibirItens();
		
		
		System.out.println("Digite o nome do produto que deseja remover do carrinho: ");
		String retirar = sc.next();
		
		carrinho.removerItem(retirar);
		
		sc.close();
	}
}
