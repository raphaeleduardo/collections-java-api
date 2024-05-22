import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		itens.add(item);
	}

	public void removerItem(String nome) {
		if (!itens.isEmpty()) {
			if (itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome))) {
				System.out.println("Item removido com sucesso...");
			} else {
				System.out.println("O item não existe nesta lista...");
			}
		} else {
			System.out.println("A lista está vazia...");
		}
	}

	public void calcularValorTotal() {
		double valorTotal = 0;
		for (Item item : itens) {
			double soma = item.getPreco() * item.getQuantidade();
			valorTotal = valorTotal + soma;
		}
		System.out.println("O valor total da compra é: " + valorTotal);
	}

	public void exibirItens() {
		for (Item item : itens) {
			System.out.println("Item: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: "
					+ item.getQuantidade());
		}
	}

}
