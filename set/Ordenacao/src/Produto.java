import java.util.Objects;

public class Produto {

	private long cod;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(long cod, String nome, double preco, int quantidade) {
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public long getCod() {
		return cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

}
