import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Teste catálogo de livros

		System.out.println("Digite o titulo do livro que deseja adicionar ao catálogo: ");
		String titulo = sc.nextLine();

		System.out.println("Digite o autor do livro: ");
		String autor = sc.nextLine();

		System.out.println("Digite o Ano de Publicação: ");
		int ano = sc.nextInt();

		CatalogoLivros livros = new CatalogoLivros();

		livros.adicionarLivro(titulo, autor, ano);

		System.out.println("Digite o nome do autor que deseja buscar: ");
		String buscarAutor = sc.next();
		livros.pesquisarPorAutor(buscarAutor);

		System.out.println("Digite o Titulo do livro que deseja buscar: ");
		String buscarLivro = sc.next();
		livros.pesquisarPorTitulo(buscarLivro);

		System.out.println("Digite o intervalo que deseja buscar: ");
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		livros.pesquisarPorIntervaloAnos(inicio, fim);

		// Teste soma de números
		SomaNumeros numeros = new SomaNumeros();
		
		System.out.println("Digite o número que deseja adiconar: ");
		int numero = sc.nextInt();
		
		numeros.adicionarNumero(numero);
		
		System.out.println(numeros.encontrarMaiorNumero());
		System.out.println(numeros.encontrarMenorNumero());
		
		System.out.println(numeros.calcularSoma());
		numeros.exibirNumeros();
		
		
		sc.close();
	}

}
