package set.CadastroDeProdutos.principal;

import set.CadastroDeProdutos.modelo.CadastroProdutos;

public class principal {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(2342, "Cafe", 19.20, 30);
        cadastroProdutos.adicionarProduto(2343, "Acuçar", 5.70, 30);
        cadastroProdutos.adicionarProduto(2344, "Chococlate", 7.49, 30);
        cadastroProdutos.adicionarProduto(2345, "Arroz", 26.50, 30);
        cadastroProdutos.adicionarProduto(2346, "Feijao", 12.30, 30);
        cadastroProdutos.adicionarProduto(2347, "Pão", 8.50, 30);

        cadastroProdutos.exibirProdutosPorPreco();
        cadastroProdutos.exibirProdutosPorNome();
    }
}
