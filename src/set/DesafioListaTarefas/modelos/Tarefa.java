package set.DesafioListaTarefas.modelos;

import java.util.Objects;

public class Tarefa {
    private String descricaoTarefa;
    private boolean tarefaConcluida;

    public Tarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
        this.tarefaConcluida = false;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }
    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }


    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricaoTarefa(), tarefa.getDescricaoTarefa());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getDescricaoTarefa());
    }

    @Override
    public String toString() {
        return String.format("\nTarefa: %s - %s", descricaoTarefa, (tarefaConcluida) ? "Concluida" : "Pendente");
    }
}
