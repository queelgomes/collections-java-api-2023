package list.DesafioSomaDeNumeros.principal;

import list.DesafioSomaDeNumeros.modelos.SomaNumeros;

public class principal {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(6);

        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());
        System.out.println(numeros.exibirNumeros());
    }
}
