package set.DesafioConjuntoPalavrasUnicas.modelos;

import java.util.*;

public class ConjuntoPalavrasUnicas {
    // atributos :::
    private Set<String> palavraSet;

    // construtor :::
    public ConjuntoPalavrasUnicas() {
        palavraSet = new HashSet<>();
    }

    // metodos :::
    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removerPalavra (String palavra){
        for (String p : palavraSet){
            if (p.equalsIgnoreCase(palavra)){
                palavraSet.remove(p);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra){
        String existePalavra = null;
        for (String p : palavraSet){
            if (p.equalsIgnoreCase(palavra)){
                System.out.printf("Palavra %s já consta na lista.\n", p);
                existePalavra = p;
                break;
            }
        }
        if (existePalavra == null){
            System.out.printf("Palavra %s disponível.\n", palavra);
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavraSet, that.palavraSet);
    }

}
