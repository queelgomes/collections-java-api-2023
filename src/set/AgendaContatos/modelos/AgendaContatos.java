package set.AgendaContatos.modelos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }
    public void pesquisarPorNome(String nome){
        Contato pesquisaContato = null;
        for (Contato c : contatosSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                pesquisaContato = c;
                break;
            }
        }
        if (pesquisaContato == null){
            System.out.println("\nContato de " + nome + " não localizado.");
        } else {
            System.out.println("\nPesquisa realizada:");
            System.out.println("Nome: " + pesquisaContato.getNome() + " - Numero: " + pesquisaContato.getNumero());
        }
    }
    public void atualizarNumeroContato(String nome, int novoNumero){
        Contato pesquisaContato = null;
        for (Contato c : contatosSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                pesquisaContato = c;
                c.setNumero(novoNumero);
                System.out.println("Contato de " + c.getNome() + " atualizado com sucesso!");
                break;
            }
        }
        if (pesquisaContato == null){
            System.out.println("\nContato de " + nome + " não localizado.");
        }
    }


}
