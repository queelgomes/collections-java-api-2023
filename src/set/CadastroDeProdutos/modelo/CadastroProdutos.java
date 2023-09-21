package set.CadastroDeProdutos.modelo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    public void exibirProdutosPorNome(){
        Set<Produto> listaProdutosPorNome = new TreeSet<>(produtoSet);
        System.out.println("\nProdutos organizados por nome: ");
        for (Produto p : listaProdutosPorNome){
            System.out.printf("""
                  >> %s - R$%.2f - CÓD: %d | Quantidade disponivel: %d
                """, p.getNome(), p.getPreco(), p.getCodigo(), p.getQuantidade());
        }
    }
    public void exibirProdutosPorPreco(){
        Set<Produto> listaProdutosPorPreco = new TreeSet<>(new ComparadorPorPreco()); // o TreeSet permite colocar um comparator como parametro. O HashSet nao.
        listaProdutosPorPreco.addAll(produtoSet);
        System.out.println("\nProdutos organizados por preço: ");
        for (Produto p : listaProdutosPorPreco){
            System.out.printf("""
                  >> %s - R$%.2f - CÓD: %d | Quantidade disponivel: %d
                """, p.getNome(), p.getPreco(), p.getCodigo(), p.getQuantidade());
        }
    }
}
