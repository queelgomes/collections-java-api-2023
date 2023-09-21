package set.DesafioListaDeAlunos.modelo;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int matricula;
    private double media;

    public Aluno(String nome, int matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return String.format("Aluno: %s - Matricula: %d - Média: %.1f", getNome(), getMatricula(),getMedia());
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }
}

class ComparadorPorMatricula implements Comparator<Aluno>{
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Long.compare(o1.getMatricula(), o2.getMatricula());
    }
}

class ComparadorPorMedia implements Comparator<Aluno>{
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
