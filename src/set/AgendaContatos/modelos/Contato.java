package set.AgendaContatos.modelos;

import java.util.Objects;

public class Contato {

    // atirbutos
    private String nome;
    private int numero;

    // construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //metodos
    @Override
    public String toString() {
        return "\nContato: " + nome + " - numero: " + numero;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
