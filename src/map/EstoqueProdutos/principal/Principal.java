package map.EstoqueProdutos.principal;

import map.EstoqueProdutos.modelos.EstoqueProdutos;

public class Principal {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(2323, "Produto 1", 45, 18.60);
        estoqueProdutos.adicionarProduto(4454, "Produto 2", 15, 23.50);
        estoqueProdutos.adicionarProduto(2243, "Produto 3", 18, 2.40);
        estoqueProdutos.adicionarProduto(7667, "Produto 4", 27, 7.99);
        estoqueProdutos.adicionarProduto(7666, "Produto 5", 94, 5.10);
        estoqueProdutos.adicionarProduto(9899, "Produto 6", 17, 35.60);
        estoqueProdutos.adicionarProduto(5345, "Produto 7", 26, 12.40);

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.obterProdutoMaisBarato();
        estoqueProdutos.obterProdutoMaisCaro();
    }
}
