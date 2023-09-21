package map.AgendaContatos.principal;

import map.AgendaContatos.modelos.AgendaContatos;

public class Principal {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 987878787);
        agendaContatos.adicionarContato("Contato 2", 948484848);
        agendaContatos.adicionarContato("Contato 3", 930303030);
        agendaContatos.adicionarContato("Contato 4", 950505050);
        agendaContatos.adicionarContato("Contato 5", 927272772);
        agendaContatos.adicionarContato("Contato 6", 978787878);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Contato 4");
        agendaContatos.pesquisarPorNome("Contato 3");
        agendaContatos.pesquisarPorNome("Contato 4");
        agendaContatos.exibirContatos();
    }
}
