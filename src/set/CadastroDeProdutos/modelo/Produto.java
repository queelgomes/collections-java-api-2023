package set.CadastroDeProdutos.modelo;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    //atributos
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;


    // construtor
    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    // getters
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }


    // metodos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return codigo == produto.codigo;
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    @Override
    public String toString() {
        return String.format("""
                Produto: %s
                Preço unitário: %.2f
                Código: %d
                Quantidade disponivel: %d
                """, nome, preco, codigo, quantidade);
    }
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparadorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

