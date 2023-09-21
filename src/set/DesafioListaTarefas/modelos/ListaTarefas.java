package set.DesafioListaTarefas.modelos;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                tarefasSet.remove(t);
            }
        }
    }
    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }
    public void contarTarefas(){
        System.out.println("Sua lista de tarefas possui " + tarefasSet.size() + " tarefas.");
    }
    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet){
            if (t.isTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        System.out.println("Tarefas concluidas: ");
        for (Tarefa t : tarefasConcluidas){
            System.out.println("  >> " + t.getDescricaoTarefa());
        }
    }
    public void obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet){
            if (!t.isTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        System.out.println("Tarefas pendentes: ");
        for (Tarefa t : tarefasPendentes){
            System.out.println("  >> " + t.getDescricaoTarefa());
        }
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                if (t.isTarefaConcluida()){
                    System.out.println("Tarefa já consta como concluida.");
                } else {
                    System.out.println("Tarefa modificada como concluida.");
                    t.setTarefaConcluida(true);
                }
                break;
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                if (!t.isTarefaConcluida()){
                    System.out.println("Tarefa já consta como pendente.");
                } else {
                    System.out.println("Tarefa modificada como pendente.");
                    t.setTarefaConcluida(false);
                }
                break;
            }
        }
    }
    public void limparListaTarefas(){
        tarefasSet.clear();
    }

}
