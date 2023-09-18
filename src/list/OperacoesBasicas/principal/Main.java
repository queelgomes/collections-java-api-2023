package list.OperacoesBasicas.principal;

import list.OperacoesBasicas.modelos.ListaTarefa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListaTarefa minhalista = new ListaTarefa();
        minhalista.adicionarTarefa("Ligar para o médico");
        minhalista.adicionarTarefa("Buscar o Léo na escola");
        minhalista.adicionarTarefa("Buscar encomenda");

        minhalista.obterDescricoesTarefas();
        minhalista.removerTarefa("Buscar o Léo na escola");
        minhalista.obterDescricoesTarefas();

        System.out.println(minhalista.obterNumeroTotaltarefas());
    }
}