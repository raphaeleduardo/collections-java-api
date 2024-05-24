import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {

		// Teste Agenda de Eventos
		AgendaEventos ae = new AgendaEventos();
		
		ae.adicionarEvento(LocalDate.of(2024, 5, 31), "Maior São João do Mundo", "Flavio José");
		ae.adicionarEvento(LocalDate.of(2024, 6, 14), "Maior São João do Mundo", "Matuê");
		ae.adicionarEvento(LocalDate.of(2024, 6, 22), "Maior São João do Mundo", "Gustavo Lima");
		ae.adicionarEvento(LocalDate.of(2024, 5, 30), "Maior São João do Mundo", "Jorge & Mateus");
		ae.adicionarEvento(LocalDate.of(2024, 5, 29), "Maior São João do Mundo", "Wesley Safadão");
		ae.adicionarEvento(LocalDate.of(2024, 5, 15), "Gravação de DVD", "Luan Santana");
		
		System.out.println(ae.exibirAgenda());
		ae.obterProximoEvento();
		
		// Teste Livraria Online
		LivrariaOnline lo = new LivrariaOnline();
		
		lo.adicionarLivro("www.amazon.com.br/livros/gatilhos_mentais", "Gatilhos Mentais: O Guia Completo com Estratégias de Negócios e Comunicações Provadas Para Você Aplicar", "Gustavo Ferreira", 37.53);
		lo.adicionarLivro("www.amazon.com.br/livros/cafe_com_deus_pai", "Café com Deus Pai 2024: Porções Diárias de paz", " Júnior Rostirola", 49.90);
		lo.adicionarLivro("www.amazon.com.br/livros/metodo_financeiro", "Método Financeiro Do Primo Rico", "Thiago Nigro", 44.84);
		lo.adicionarLivro("www.amazon.com.br/livros/apaixonar_se_pelo_problema", "Apaixone-se pelo problema, não pela solução", "Uri Levine", 57.68);
		lo.adicionarLivro("www.amazon.com.br/livros/atitude_mental", "Atitude mental positiva", "Napoleon Hill", 35.40);
		lo.adicionarLivro("www.amazon.com.br/livros/mais_esperto", "Mais esperto que o Diabo: O mistério revelado da liberdade e do sucesso", "Napoleon Hill", 29.90);
		
		lo.removerLivro("Atitude mental positiva");
		
		System.out.println(lo.exibirLivrosOrdenadorPorPreco());
		System.out.println(lo.exibirLivrosOrdenadosPorAutor());
		
		System.out.println(lo.obterLivroMaisCaro());
		System.out.println(lo.obterLivroMaisBarato());

	}
}
