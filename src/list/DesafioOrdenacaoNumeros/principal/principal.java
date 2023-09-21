package list.DesafioOrdenacaoNumeros.principal;

import list.DesafioOrdenacaoNumeros.modelos.OrdenacaoNumeros;

public class principal {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(90);
        ordenacaoNumeros.adicionarNumero(26);
        ordenacaoNumeros.adicionarNumero(45);
        ordenacaoNumeros.adicionarNumero(78);

        System.out.println(ordenacaoNumeros.getListaNumeros());
        System.out.println(ordenacaoNumeros.ordenarAscendente());

    }
}
