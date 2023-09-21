package map.DesafioDicionario.principal;

import map.DesafioDicionario.modelo.Dicionario;

public class Principal {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Amor", "Definição de amor");
        dicionario.adicionarPalavra("Paz", "Definição de paz");
        dicionario.adicionarPalavra("Saúde", "Definição de saúde");
        dicionario.adicionarPalavra("Harmonia", "Definição de harmonia");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("Amor");
        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Paz");

    }
}
