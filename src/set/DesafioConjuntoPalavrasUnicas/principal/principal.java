package set.DesafioConjuntoPalavrasUnicas.principal;

import set.DesafioConjuntoPalavrasUnicas.modelos.ConjuntoPalavrasUnicas;

public class principal {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("amor");
        conjuntoPalavrasUnicas.adicionarPalavra("paz");
        conjuntoPalavrasUnicas.adicionarPalavra("alegria");
        conjuntoPalavrasUnicas.adicionarPalavra("harmonia");
        conjuntoPalavrasUnicas.adicionarPalavra("prosperidade");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("amor");
        conjuntoPalavrasUnicas.adicionarPalavra("saúde");
        conjuntoPalavrasUnicas.adicionarPalavra("sucesso");
        conjuntoPalavrasUnicas.adicionarPalavra("alegria");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
