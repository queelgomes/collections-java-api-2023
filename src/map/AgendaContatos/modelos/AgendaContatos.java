package map.AgendaContatos.modelos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
            System.out.println("Contato '" + nome + "' removido com sucesso!");
        } else {
            System.out.println("Lista encontra-se vazia.");
        }
    }
    public void exibirContatos(){
        if (!agendaContatos.isEmpty()){
            System.out.println(agendaContatos);
        } else {
            System.out.println("Agenda vazia.");
        }

    }
    public void pesquisarPorNome(String nome){
        if (agendaContatos.get(nome) == null){
            System.out.println("Contato '" + nome + "' não encontrado");
        } else {
            System.out.println("Telefone do " + nome + ": " + agendaContatos.get(nome));
        }
    }
}
