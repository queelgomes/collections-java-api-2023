package set.DesafioListaTarefas.principal;

import set.DesafioListaTarefas.modelos.ListaTarefas;

import java.util.List;

public class principal {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Compromisso 1");
        listaTarefas.adicionarTarefa("Compromisso 2");
        listaTarefas.adicionarTarefa("Compromisso 3");
        listaTarefas.adicionarTarefa("Compromisso 4");
        listaTarefas.adicionarTarefa("Compromisso 5");
        listaTarefas.adicionarTarefa("Compromisso 6");
        listaTarefas.adicionarTarefa("Compromisso 6");


        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Compromisso 4");
        listaTarefas.adicionarTarefa("Compromisso 5");
        listaTarefas.adicionarTarefa("Compromisso 6");
        listaTarefas.adicionarTarefa("Compromisso 6");

        listaTarefas.obterTarefasPendentes();

        listaTarefas.marcarTarefaConcluida("Compromisso 2");
        listaTarefas.marcarTarefaConcluida("Compromisso 5");
        listaTarefas.marcarTarefaConcluida("Compromisso 4");

        listaTarefas.obterTarefasConcluidas();

        listaTarefas.marcarTarefaPendente("Compromisso 4");

        listaTarefas.obterTarefasPendentes();

    }

}
