package set.AgendaContatos.principal;

import set.AgendaContatos.modelos.AgendaContatos;

public class principal {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Camila", 983838383);
        agendaContatos.atualizarNumeroContato("Joyce", 960606060);
        agendaContatos.adicionarContato("Raquel", 950505050);
        agendaContatos.adicionarContato("Glauber", 970707070);
        agendaContatos.adicionarContato("Joyce", 965656565);

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Joyce");
    }
}
