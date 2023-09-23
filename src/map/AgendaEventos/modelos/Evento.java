package map.AgendaEventos.modelos;

public class Evento {

    private String nome;
    private String evento;

    public Evento(String nome, String evento) {
        this.nome = nome;
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public String getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return "Evento: " + nome + " | Descrição: " + evento;
    }
}
