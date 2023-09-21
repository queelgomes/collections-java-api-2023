package set.ConjuntoConvidados.principal;

import set.ConjuntoConvidados.modelos.ConjuntoConvidados;

public class principal {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Raquel", 2324);
        conjuntoConvidados.adicionarConvidado("Glauber", 2325);
        conjuntoConvidados.adicionarConvidado("Leonardo", 2326);
        conjuntoConvidados.adicionarConvidado("Leonardo", 2327);

        conjuntoConvidados.exibitConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2326);

        conjuntoConvidados.exibitConvidados();
    }
}
