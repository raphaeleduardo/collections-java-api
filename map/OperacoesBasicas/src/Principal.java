
public class Principal {
	public static void main(String[] args) {
	
	// Teste agenda de contatos
	AgendaContatos ac = new AgendaContatos();

	ac.adicionarContato("John", 999999999);
	ac.adicionarContato("Mike", 787878878);
	ac.adicionarContato("Mary", 656565655);
	ac.adicionarContato("Liam", 323232356);
	
	ac.removerContato("John");
	
	ac.pesquisarPorNome("Mary");
	
	ac.exibirContatos();
	
	// Teste dicionario
	Dicionario d = new Dicionario();
	
	d.adicionarPalavra("Amor", "Sentimento que faz com que uma pessoa queira o bem de outra: ao vê-la bem senti amor.");
	d.adicionarPalavra("Vida", "Conjunto dos hábitos e costumes de alguém; maneira de viver: tinha uma vida de milionário.");
	d.adicionarPalavra("Ação", "Manifestação de uma força que age sobre outra coisa ou pessoa: a ação do remédio; a ação das leis sobre a sociedade.");
	d.adicionarPalavra("Arte", "Aptidão inata para aplicar conhecimentos, usando talento ou habilidade, na demonstração uma ideia, um pensamento; o resultado dessa demonstração: esta escultura representa a arte de Michelangelo.");
	
	d.exibirPalavras();
	
	d.removerPalavra("Ação");
	
	d.pesquisarPorPalavra("Amor");
	
	}
}