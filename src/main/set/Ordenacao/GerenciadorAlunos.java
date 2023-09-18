package main.set.Ordenacao;

import main.set.OperacoesBasicas.Convidado;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> gerenciadorAlunos;

    public GerenciadorAlunos() {
        this.gerenciadorAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        gerenciadorAlunos.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for (Aluno a : gerenciadorAlunos){
            if (a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        gerenciadorAlunos.remove(alunoParaRemover);
    }
    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(gerenciadorAlunos);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunoPorMedia() {
        Set<Aluno> alunoPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunoPorMedia.addAll(gerenciadorAlunos);
        return alunoPorMedia;
    }


    public void exibirAlunos(){
        if(!gerenciadorAlunos.isEmpty()){
            System.out.println("Alunos do conjunto: " + gerenciadorAlunos);
        }
        else System.out.println("O Conjunto esta vazio!");
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("Joao",123L, 10.0);
        gerenciador.adicionarAluno("Maria",321L, 8.0);
        gerenciador.adicionarAluno("Francisco",456L, 7.0);
        gerenciador.adicionarAluno("Joana",654L, 9.0);

        gerenciador.exibirAlunos();
        System.out.println("Aluno por nome: " + gerenciador.exibirAlunoPorNome());

        System.out.println("Aluno por média: " + gerenciador.exibirAlunoPorMedia());


    }








}

