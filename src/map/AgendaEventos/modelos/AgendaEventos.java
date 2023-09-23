package map.AgendaEventos.modelos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaOrganizada = new TreeMap<>(eventoMap);
        System.out.println("Eventos da Agenda:");
        for (LocalDate p : agendaOrganizada.keySet()){
            System.out.println(p + " " + agendaOrganizada.get(p));
        }
        //System.out.println(agendaOrganizada.keySet());
    }

    public void obterProximoEvento(){
        LocalDate hoje = LocalDate.now();
        Map<LocalDate, Evento> agendaOrganizada = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : agendaOrganizada.entrySet()){
            if (entry.getKey().isEqual(hoje) || entry.getKey().isAfter(hoje)){
                System.out.println("O próximo evento será dia " + entry.getKey() + "\nDescrição: " + entry.getValue());
                break;
            }
        }
    }


}
