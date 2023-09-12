package main.Pesquisa;

import main.list.OperacoesBasicas.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Integer;

public class SomaNumeros {
    private List<NumerosInteiros> numerosInteirosList;

    public SomaNumeros() {
        this.numerosInteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteirosList.add(new NumerosInteiros(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        if (!numerosInteirosList.isEmpty()){
            for(NumerosInteiros n : numerosInteirosList) {
                soma += n.getNumero();

            }
            return soma;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirNumeros() {
        if (!numerosInteirosList.isEmpty()){
            System.out.println("Numeros inteiros da lista: " + numerosInteirosList);
        }
        else System.out.println("Lista vazia");
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosInteirosList.isEmpty()) {
            for (Integer numero : numerosInteirosList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosInteirosList.isEmpty()) {
            for (Integer numero : numerosInteirosList) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }




    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();
        System.out.println("A soma dos inteiros é: " + somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());


    }
}
