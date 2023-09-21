package set.ConjuntoConvidados;

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
        return "Nome: " + nome + "Codigo Convite: " + codigoConvidado;
    }
}
