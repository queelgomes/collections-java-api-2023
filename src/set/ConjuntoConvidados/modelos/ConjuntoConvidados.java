package set.ConjuntoConvidados.modelos;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // atributos :::
    private Set<Convidado> convidadosSet;

    // construtor :::
    public ConjuntoConvidados() {
        convidadosSet = new HashSet<>();
    }

    // métodos :::

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaExcluir = null;
        for (Convidado c : convidadosSet){
            if (c.getCodigoConvidado() == codigoConvite){
                convidadoParaExcluir = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaExcluir);
    }

    public void contarConvidados(){
        System.out.printf("Quantidade de convidados: %d", convidadosSet.size());
    }

    public void exibitConvidados(){
        System.out.println(convidadosSet);
    }
}
