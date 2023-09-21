package set.ConjuntoConvidados.modelos;

import java.util.Objects;

public class Convidado {

    //atributos :::
    private String nome;
    private int codigoConvidado;


    // construtor :::
    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    // getters :::
    public String getNome() {
        return nome;
    }
    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    // métodos :::
    @Override
    public String toString() {
        return "\nNome: " + nome + " - Codigo Convite: " + codigoConvidado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvidado() == convidado.getCodigoConvidado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvidado());
    }
}
