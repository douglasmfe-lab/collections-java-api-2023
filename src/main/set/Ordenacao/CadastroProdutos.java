package main.set.Ordenacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo,nome,preco,quantidade));
    }

    //Exibir produtos por nome
    //Ordem natural vamos adotar por nome
    public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos newProdutos = new CadastroProdutos();

        newProdutos.adicionarProduto(1L,"Produto 5", 15d, 5);
        newProdutos.adicionarProduto(2L,"Produto 0", 20d, 10);
        newProdutos.adicionarProduto(1L,"Produto 3", 10d, 2);
        newProdutos.adicionarProduto(9L,"Produto 9", 02d, 2);

        System.out.println(newProdutos.produtoSet);

        System.out.println("Exibir por nome: " + newProdutos.exibirProdutosPorNome());

        System.out.println("Exibir por preco: " + newProdutos.exibirProdutosPorPreco());
    }


}
