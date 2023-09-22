package map.EstoqueProdutos.modelos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos() {
        for (Long p : estoqueProdutosMap.keySet()) {
            System.out.println("Cód: " + p + " >>> " + estoqueProdutosMap.get(p));
        }
    }
    public void calcularValorTotalEstoque(){
        double calcularValorTotal = 0;
        for (Produto p : estoqueProdutosMap.values()){
            calcularValorTotal += p.getPreco() + p.getQuantidade();
        }
        System.out.println("Valor total do estoque é " + calcularValorTotal);
    }
    public void obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
            System.out.println("O produto mais caro é " + produtoMaisCaro.getNome() + " por R$" + produtoMaisCaro.getPreco());
        }
    }
    public void obterProdutoMaisBarato(){
            Produto produtoMaisBarato = null;
            double menorPreco = Double.MAX_VALUE;
            if (!estoqueProdutosMap.isEmpty()){
                for (Produto p : estoqueProdutosMap.values()){
                    if (p.getPreco() < menorPreco){
                        menorPreco = p.getPreco();
                        produtoMaisBarato = p;
                    }
                }
                System.out.println("O produto mais barato é " + produtoMaisBarato.getNome() + " por R$" + produtoMaisBarato.getPreco());
            }
    }



}
