package list.DesafioOrdenacaoNumeros.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenada = new ArrayList<>(listaNumeros);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }


}
