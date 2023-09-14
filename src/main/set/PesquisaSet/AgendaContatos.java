package main.set.PesquisaSet;
import java.util.HashSet;
import java.util.Set;
public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        if (!contatoSet.isEmpty()) {
            System.out.println("Lista de contatos: " + contatoSet);
        } else System.out.println("A lista esta vazia!");
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Maria",111111);
        agenda.adicionarContato("Maria",0);
        agenda.adicionarContato("Maria Silva",222222);
        agenda.adicionarContato("Maria Cavalcanti",333333);
        agenda.adicionarContato("Afonso",444444);
        agenda.adicionarContato("Roberta",222222);

        agenda.exibirContatos();

        System.out.println("Pesquisa por Nome: " + agenda.pesquisarPorNome("Roberta"));

        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Afonso", 988896235));

        agenda.exibirContatos();

    }

}