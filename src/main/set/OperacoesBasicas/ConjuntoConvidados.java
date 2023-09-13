package main.set.OperacoesBasicas;

import main.list.OperacoesBasicas.Item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if (!convidadoSet.isEmpty()){
            System.out.println("A lista de convidados: " + convidadoSet);
        }
        else System.out.println("A Lista esta vazia!");
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " convidado(s) dentro do Set de Convidados!");

        System.out.println();

        convidados.adicionarConvidado("Convidado 1", 1234);
        convidados.adicionarConvidado("Convidado 2", 1235);
        convidados.adicionarConvidado("Convidado 3", 1236);
        convidados.adicionarConvidado("Convidado 4", 1237);

        convidados.exibirConvidados();

       System.out.println("Existem " + convidados.contarConvidados() + " convidado(s) dentro do Set de Convidados!");

        //System.out.println();


    }




}
