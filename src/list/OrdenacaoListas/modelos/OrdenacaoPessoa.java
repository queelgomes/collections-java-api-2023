package list.OrdenacaoListas.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    // atributos :::
    private List<Pessoa> pessoaList;

    // construtor :::
    public OrdenacaoPessoa() {
    pessoaList = new ArrayList<>();
    }

    // getters :::
    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    //metodos :::
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenarPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(ordenarPorIdade);
        return ordenarPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenarPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(ordenarPorAltura, new ComparadorPorAltura());
        return ordenarPorAltura;
    }
}
