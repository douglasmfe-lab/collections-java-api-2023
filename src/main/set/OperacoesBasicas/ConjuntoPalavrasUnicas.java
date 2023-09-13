package main.set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;
import java.lang.String;
public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(new String(palavra));
    }

    public void exibirPalavrasUnicas(){
        if (!palavras.isEmpty()){
            System.out.println("Conjunto de palavras: " + palavras);
        }
    }

    public int contaPalavrasUnicas(){
        return palavras.size();
    }

    public void removerPalavra(String palavra){

        if (palavras.contains(palavra)){
            palavras.remove(palavra);
        }
        else System.out.println("A palavra não existe no conjunto!");

    }

    public String verificarPalavra(String palavra){
        Set<String> ExistePalavra = new HashSet<String>();
        if (palavras.contains(palavra)){
            ExistePalavra.add(palavra);
            System.out.print("A palavra existe: ");
            return ExistePalavra.toString();
        }
        else System.out.print("A palavra '" + palavra + "' não existe no conjunto: ");
        return palavras.toString();
    }



    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Moda");
        conjunto.adicionarPalavra("Casa");
        conjunto.adicionarPalavra("Ferro");
        conjunto.adicionarPalavra("Roupa");
        conjunto.adicionarPalavra("Martelo");
        conjunto.adicionarPalavra("Mirante");

        conjunto.exibirPalavrasUnicas();
        System.out.println(conjunto.contaPalavrasUnicas());

        conjunto.removerPalavra("Laura");
        conjunto.exibirPalavrasUnicas();
        System.out.println(conjunto.contaPalavrasUnicas());
        System.out.println(conjunto.verificarPalavra("Joia"));

    }
}
