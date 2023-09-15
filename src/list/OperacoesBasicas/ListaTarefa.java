package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        //Como a classe tarefa esta em outro arquivo, devemos chama-la colocando o new (nao tenho certeza sobre isso).
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //preciso criar uma lista onde guarda os itens procurados. Pois se tiver item repetido, ele apaga todos.
        List<Tarefa> itensParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            //como getDescricao e descricao são uma String, deve usar o equals para comparar.
            if (descricao.equalsIgnoreCase(t.getDescricao())){
                itensParaRemover.add(t);
            }
        }
        //Pego tudo o que esta em itensParaRemover e removo da tarefaList.
        tarefaList.removeAll(itensParaRemover);
    }

    public int obterNumeroTotaltarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
        // Nao aconselha-se usar sout em objetos/classes que nao sejam o programa principal.
        // Nesse caso fariamos um return e o toString para nomear a impressao do sout no programa.
    }


}
