import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Teste ordenação de pessoas
		OrdenacaoPessoas op = new OrdenacaoPessoas();
		
		op.adicionarPessoa("Raphael", 26, 1.65);
		op.adicionarPessoa("Natalia", 25, 1.59);
		op.adicionarPessoa("Wemilly", 26, 1.78);
		op.adicionarPessoa("Vinicius", 27, 1.82);
		
		System.out.println(op.pessoas);
		System.out.println(op.ordenarPorIdade());
		System.out.println(op.ordenarPorAltura());
		
		//Teste ordenação de numeros
		OrdenacaoNumeros on = new OrdenacaoNumeros();
		on.adicionarNumero(1);
		on.adicionarNumero(2);
		on.adicionarNumero(3);
		on.adicionarNumero(4);
		on.adicionarNumero(5);
		
		System.out.println(on.ordenarAscendente());
		System.out.println(on.ordenarDescendente());
		on.exibirNumeros();
		
		sc.close();
	}

}
