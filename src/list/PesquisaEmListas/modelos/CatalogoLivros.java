package list.PesquisaEmListas.modelos;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // atributos :::
        private List<Livro> livroList;

    // construtor :::
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // métodos :::
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listaAutor.add(l);
                }
            }
        }
        return listaAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    listaAno.add(l);
                }
            }
        }
        return listaAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPesquisado = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPesquisado = l;
                    break;
                }
            }
        }
        return livroPesquisado;
    }
}
