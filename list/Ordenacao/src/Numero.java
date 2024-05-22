
public class Numero implements Comparable<Numero>{

	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(Numero n) {
		return Integer.compare(numero, n.getNumero());
	}

}
