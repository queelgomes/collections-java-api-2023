package list.pesquisa.modelos;

public class Livro {

    //atributos :::
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    // construtor :::

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    // getters e setters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    //métodos :::
    @Override
    public String toString() {
        return String.format("""
                
                
                Livro: %s
                Autor: %s
                Ano de Publicação: %d""", getTitulo(), getAutor(), getAnoDePublicacao());
    }
}
