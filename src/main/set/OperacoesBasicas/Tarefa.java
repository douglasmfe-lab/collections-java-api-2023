package main.set.OperacoesBasicas;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private Boolean concluida;

    public Tarefa(String descricao, Boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(descricao, tarefa.descricao) && Objects.equals(concluida, tarefa.concluida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, concluida);
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
