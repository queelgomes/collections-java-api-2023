package set.DesafioListaDeAlunos.modelo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        for (Aluno a: alunosSet){
            if (a.getMatricula() == matricula){
                alunoRemover = a;
            }
        }
        alunosSet.remove(alunoRemover);
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> listaPorNome = new TreeSet<>(alunosSet);
        System.out.println("\nAlunos Matriculados (nome): ");
        for (Aluno a : listaPorNome){
            System.out.printf(" > Aluno: %s - Matricula: %d - Média: %.1f\n", a.getNome(), a.getMatricula(), a.getMedia());
        }
    }
    public void exibirAlunosPorMedia(){
        Set<Aluno> listaPorMedia = new TreeSet<>(new ComparadorPorMedia());
        listaPorMedia.addAll(alunosSet);
        System.out.println("\nAlunos Matriculados (media): ");
        for (Aluno a : listaPorMedia){
            System.out.printf(" > Aluno: %s - Matricula: %d - Média: %.1f\n", a.getNome(), a.getMatricula(), a.getMedia());
        }
    }
    public void exibirAlunosPorMatricula(){
        Set<Aluno> listaPorMatricula = new TreeSet<>(new ComparadorPorMatricula());
        listaPorMatricula.addAll(alunosSet);
        System.out.println("\nAlunos Matriculados: (matricula)");
        for (Aluno a : listaPorMatricula){
            System.out.printf(" > Aluno: %s - Matricula: %d - Média: %.1f\n", a.getNome(), a.getMatricula(), a.getMedia());
        }
    }


}
