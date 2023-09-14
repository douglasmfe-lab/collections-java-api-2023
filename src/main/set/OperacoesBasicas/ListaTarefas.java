package main.set.OperacoesBasicas;

import main.set.PesquisaSet.Contato;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, Boolean concluida){
        tarefas.add(new Tarefa(descricao,concluida));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefas){
            if (t.getDescricao() == descricao){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefas.remove(tarefaParaRemover);
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefas){
            if (t.getConcluida() == true){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefas){
            if (t.getConcluida() == false){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void exibirTarefas(){
        if (!tarefas.isEmpty()){
            System.out.println("Lista de tarefas" + tarefas);
        }
        else System.out.println("A lista esta vazia!");

    }

    public void contarTarefas(){
        int n = tarefas.size();
        System.out.println("Total de tarefas do conjunto: "+ n);
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa marcarTarefaConcluida = null;
        for (Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                marcarTarefaConcluida = t;
                break;
            }
        }
        return marcarTarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa marcarTarefaPendente = null;
        for (Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                marcarTarefaPendente = t;
                break;
            }
        }
        return marcarTarefaPendente;
    }

    public void limparListaTarefas(){
        if(!tarefas.isEmpty()){
                tarefas.clear();
        }
        else System.out.println("A lista esta vazia!");
        }



    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Limpar casa", true);
        listaTarefas.adicionarTarefa("Lavar carro", false);
        listaTarefas.adicionarTarefa("Arrumar mala", true);
        listaTarefas.adicionarTarefa("Estudar java", false);
        listaTarefas.adicionarTarefa("Lavar louça", false);

       // listaTarefas.exibirTarefas();
       // listaTarefas.contarTarefas();
       // listaTarefas.removerTarefa("Lavar carro");

       //listaTarefas.exibirTarefas();
       //listaTarefas.contarTarefas();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Estudar java");
        System.out.println();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Limpar casa");
        System.out.println();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();


    }

}
