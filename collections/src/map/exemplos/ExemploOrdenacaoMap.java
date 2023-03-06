package map.exemplos;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        //Mostrando em ordem aleatória
        Map<String, Livros> meusLivros = new HashMap<>() {{
            put(" Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};

        System.out.println("\nLivros em ordem aleatória: ");
        for (Map.Entry<String, Livros> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        //Mostrando via ordem de inserção
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};

        System.out.println("\nLivros em ordem de inserção: ");
        for (Map.Entry<String, Livros> livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        //Mostrar por Ordem alfabética das chaves
        Map<String, Livros> meusLivros2 = new TreeMap<>() {{
            put(" Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};

        System.out.println("\nLivros em ordem de alfabética de autor (key): ");
        for (Map.Entry<String, Livros> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        //Ordem alfabética dos nomes dos livros
        //transformado em TreeSet para poder ordenar os values
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNomeLivro());

        //recebendo os livros via add all
        meusLivros3.addAll(meusLivros.entrySet());

        System.out.println("\nLivros em ordem de alfabética de nome (value): ");
        for (Map.Entry<String, Livros> livro: meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
    }
}
