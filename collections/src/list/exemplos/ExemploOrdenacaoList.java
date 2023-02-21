package list.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("José", 11, "marrom"));
            add(new Gato("Plínio", 9, "laranja"));
            add(new Gato("José", 18, "cinza"));
        }};

        System.out.println("Ordem de Inserção: ");
        System.out.println(meusGatos);

        System.out.println("Ordem Aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural (Alfabética): ");
        //Ordenando os gatos
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de idade: ");
        //Ordenando os gatos por idade, exixstem as duas formas abaixo
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem de cor: ");
        //Ordenando os gatos por idade, exixstem as duas formas abaixo
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem por nome/cor/idade: ");
        //Ordenando os gatos por idade, exixstem as duas formas abaixo
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
class Gato implements Comparable<Gato> {
    //Declarando atributos
    private String nome;
    private Integer idade;
    private String cor;

    //Declarando o construtor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //Declarando Gets
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //Serve para mostrar o conteúdo, ao invés do endereço de memória
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        //Observe que aqui ele realiza a comparação de string retornando int
        //Aqui usa-se o this por estar dentro da Classe gato
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
class ComparatorIdade implements Comparator<Gato>{

    //Método que realiza comparação entre dois inteiros e retorna inteiro
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    //Método que realiza comparação entre dois inteiros e retorna inteiro
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    //Comaprado com vários critérios
    @Override
    public int compare(Gato g1, Gato g2) {
        int comparaNome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(comparaNome!=0) {
            return comparaNome;
        }

        int comparaCor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(comparaCor!=0) {
            return comparaNome;
        }

        //este return se torna o padrão de retorno
        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}