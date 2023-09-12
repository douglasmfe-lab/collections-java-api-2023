package main.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> OrdenaIdade = new ArrayList<>(pessoaList);
        Collections.sort(OrdenaIdade);
        return OrdenaIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> OrdenaAltura = new ArrayList<>(pessoaList);
        Collections.sort(OrdenaAltura,new ComparatorPorAltura());
        return OrdenaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        ordenacaoPessoa.adicionarPessoa("Nome1",20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome2",30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome3",25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome4",17, 1.56);

        System.out.println("Ordenado por idade: " + ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordenado por altura: " + ordenacaoPessoa.ordenarPorAltura());

    }

}
