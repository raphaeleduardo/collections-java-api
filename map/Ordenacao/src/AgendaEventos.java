import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	Map<LocalDate, Evento> eventos;

	public AgendaEventos() {
		this.eventos = new HashMap<LocalDate, Evento>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventos.put(data, new Evento(nome, atracao));
	}
	
	public Map<LocalDate, Evento> exibirAgenda() {
		Map<LocalDate, Evento> eventoPorData = new TreeMap<LocalDate, Evento>(eventos);
		return eventoPorData;
	}
	
	public void obterProximoEvento() {
		LocalDate hoje = LocalDate.now();
		LocalDate proxima = null;
	    Evento proximoEvento = null;
	    Map<LocalDate, Evento> eventoPorData = new TreeMap<LocalDate, Evento>(eventos);
	    for (Map.Entry<LocalDate, Evento> entry : eventoPorData.entrySet()) {
	      LocalDate dataEvento = entry.getKey();
	      if (dataEvento.isEqual(hoje) || dataEvento.isAfter(hoje)) {
	        proxima = dataEvento;
	        proximoEvento = entry.getValue();
	        break;
	      }
	    }
	    if (proximoEvento != null) {
	      System.out.println("O próximo evento será: " + proximoEvento.getNome() + " acontecerá na data " + proxima);
	    } else {
	      System.out.println("Sem eventos futuros na agenda...");
	    }
	}

}
