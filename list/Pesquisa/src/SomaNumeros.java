import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	List<Numero> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		Numero n = new Numero(numero);
		numeros.add(n);
		System.out.println("Número adicionado com sucesso...");
	}

	public int calcularSoma() {
		int soma = 0;
		for (Numero n : numeros) {
			soma = soma + n.getNumero();
		}
		return soma;
	}

	public int encontrarMaiorNumero() {
		int maiorValor = Integer.MIN_VALUE;
		for (Numero n : numeros) {
			if (maiorValor < n.getNumero()) {
				maiorValor = n.getNumero();
			}
		}
		System.out.print("Maior: ");
		return maiorValor;
	}

	public int encontrarMenorNumero() {
		int menorValor = Integer.MAX_VALUE;
		for (Numero n : numeros) {
			if (menorValor > n.getNumero()) {
				menorValor = n.getNumero();
			} 
		}
		System.out.print("Menor: ");
		return menorValor;
	}
	
	public void exibirNumeros() {
		for (Numero n : numeros) {
			System.out.println(n.getNumero());
		}
	}

}
