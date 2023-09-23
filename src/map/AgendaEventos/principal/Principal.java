package map.AgendaEventos.principal;

import map.AgendaEventos.modelos.AgendaEventos;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023,8,26), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023,10,26), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023,9,26), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023,11,26), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023,7,26), "Evento 5", "Atracao 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
