package map.DesafioDicionario.modelo;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavraMap;

    public Dicionario() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavraMap.put(palavra, definicao);
        System.out.println("Palavra '" + palavra + "' adicionada com sucesso!");
    }

    public void removerPalavra(String palavra){
        if (!palavraMap.isEmpty()){
            palavraMap.remove(palavra);
            System.out.println("Palavra '" + palavra + "' removida com sucesso!");
        } else {
            System.out.println("A lista encontra-se vazia.");
        }
    }

    public void exibirPalavras(){
        System.out.println(palavraMap);
    }

    public void pesquisarPorPalavra(String palavra){
        System.out.println(palavra + " : " + palavraMap.get(palavra));
    }

}
