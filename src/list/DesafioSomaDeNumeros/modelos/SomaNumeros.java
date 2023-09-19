package list.DesafioSomaDeNumeros.modelos;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    // atributos :::
    private List<Integer> numerosInteiros;

    // construtor :::
    public SomaNumeros() {
        numerosInteiros = new ArrayList<>();
    }

    // métodos :::
    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public int calcularSoma(){
        int somaNumeros = 0;
        if (!numerosInteiros.isEmpty()){
            for(int n : numerosInteiros){
                somaNumeros += n;
            }
        }
        return somaNumeros;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numerosInteiros.isEmpty()){
            for (int n : numerosInteiros){
                if (n > maiorNumero){
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if (!numerosInteiros.isEmpty()){
            for (int n : numerosInteiros){
                if (n < menorNumero){
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return numerosInteiros;
    }

}
