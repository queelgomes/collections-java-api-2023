package list.OrdenacaoListas.principal;

import list.OrdenacaoListas.modelos.OrdenacaoPessoa;

public class principal {
    public static void main(String[] args) {
        OrdenacaoPessoa ordemPessoa = new OrdenacaoPessoa();

        ordemPessoa.adicionarPessoa("Raquel", 30, 1.68);
        ordemPessoa.adicionarPessoa("Glauber", 32, 1.82);
        ordemPessoa.adicionarPessoa("Leonardo", 3, 1);
        ordemPessoa.adicionarPessoa("Fatima", 63, 1.63);

        System.out.println(ordemPessoa.getPessoaList());
        System.out.println(ordemPessoa.ordenarPorAltura());
        System.out.println(ordemPessoa.ordenarPorIdade());
    }
}
