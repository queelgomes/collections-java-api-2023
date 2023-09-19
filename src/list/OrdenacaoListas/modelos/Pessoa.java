package list.OrdenacaoListas.modelos;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

    //atributos :::
    private String nome;
    private int idade;
    private double altura;

    // construtor :::
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }


    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade() + " | Altura: " + getIdade();
    }
}

class ComparadorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
