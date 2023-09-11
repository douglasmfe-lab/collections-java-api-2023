package main.list.OperacoesBasicas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        itemList.removeAll(itemParaRemover);
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        }

    public void exibirItens(){
        if (itemList.isEmpty()){
            System.out.println("Lista vazia");
        }
        else System.out.println("Itens no carrinho: " + itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("mouse",10.99, 3);
        carrinhoDeCompras.adicionarItem("teclado",26.30, 3);
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho: R$ " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("mouse");
        carrinhoDeCompras.exibirItens();

    }




}
