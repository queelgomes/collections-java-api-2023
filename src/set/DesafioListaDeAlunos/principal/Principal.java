package set.DesafioListaDeAlunos.principal;

import set.DesafioListaDeAlunos.modelo.GerenciadorAlunos;

public class Principal {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 3341, 8.7);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 3124, 9.3);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 1233, 8.9);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 3134, 9.1);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 5456, 7.5);
        gerenciadorAlunos.adicionarAluno("Aluno 5", 7657, 7.5);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 3755, 8.9);

        gerenciadorAlunos.exibirAlunosPorMatricula();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorMedia();

        gerenciadorAlunos.removerAluno(3134);
        gerenciadorAlunos.exibirAlunosPorMatricula();
        gerenciadorAlunos.exibirAlunosPorNome();
    }
}
