package main.Ordenacao;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public void exibirLista(){
        if (!numeros.isEmpty()){
            System.out.println("Numeros da Lista: " + numeros);
        }
        else System.out.println("Lista vazia");
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenaAscendente = new ArrayList<>(numeros);
        Collections.sort(numeros);
        return numeros;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> OrdenaDescendente = new ArrayList<>(numeros);
        Collections.sort(numeros,Collections.reverseOrder());
        return numeros;
    }



    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(6);

        ordenacaoNumeros.exibirLista();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
