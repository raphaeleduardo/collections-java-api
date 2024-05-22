import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	List<Numero> numeros;

	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		numeros.add(new Numero(numero));
	}

	public List<Numero> ordenarAscendente() {
		List<Numero> ascendentes = new ArrayList<>(numeros);
		if (!numeros.isEmpty()) {
			Collections.sort(ascendentes);
		} else {
			System.out.println("A lista está vázia...");
		}
		return ascendentes;
	}

	public List<Numero> ordenarDescendente() {
		List<Numero> descendentes = new ArrayList<>(numeros);
		if (!numeros.isEmpty()) {
			descendentes.sort(Collections.reverseOrder());
		} else {
			System.out.println("A lista está vázia...");
		}
		return descendentes;
	}

	public void exibirNumeros() {
		if (!numeros.isEmpty()) {
			for (Numero n : numeros) {
				System.out.println(n.getNumero());
			}
		} else {
			System.out.println("A lista está vázia...");
		}
	}

}
