package list.pesquisa.principal;

import list.pesquisa.modelos.CatalogoLivros;
import list.pesquisa.modelos.Livro;

public class principal {
    public static void main(String[] args) {
        CatalogoLivros catalogoDeLivros = new CatalogoLivros();
        catalogoDeLivros.adicionarLivro("Livro 1 do Autor 1", "Autor 1", 2019);
        catalogoDeLivros.adicionarLivro("Livro 1 do Autor 2", "Autor 2", 2017);
        catalogoDeLivros.adicionarLivro("Livro 2", "Autor 2", 2019);
        catalogoDeLivros.adicionarLivro("Livro 1 do Autor 3", "Autor 3", 2018);
        catalogoDeLivros.adicionarLivro("Livro 1 do Autor 4", "Autor 4", 2022);
        catalogoDeLivros.adicionarLivro("Livro 1 do Autor 5", "Autor 5", 2008);
        catalogoDeLivros.adicionarLivro("Livro 2", "Autor 5", 2012);
        catalogoDeLivros.adicionarLivro("Livro 3 do Autor 5", "Autor 5", 2021);

//        System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor 2"));
//        System.out.println(catalogoDeLivros.pesquisarPorIntervaloAnos(2008, 2018));
        System.out.println(catalogoDeLivros.pesquisarPorTitulo("Livro 2"));
    }
}
