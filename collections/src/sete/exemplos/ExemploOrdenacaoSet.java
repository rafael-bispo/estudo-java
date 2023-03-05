/*
*Exemplo usando séries como objetos para buscar ordená-los com Set
*
 */

package set.exemplos;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Séries em ordem aleatória: ");

        //Usando HashSet e ordem aleatória
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("Dark", "Ficção", 50));
            add(new Series("Rick and Morty", "Ficção", 20));
            add(new Series("After Life", "Drama", 30));
        }};
        for (Series serie: minhasSeries) {
            System.out.println(serie);
        }

        //transformando em LinkedHashSet e exibindo por ordem de inserção
        System.out.println("Séries em ordem de inserção: ");
        Set<Series> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Series("Rick and Morty", "Ficção", 60));
            add(new Series("Dark", "Ficção", 60));
            add(new Series("After Life", "Drama", 30));
        }};
        for (Series serie: minhasSeries1) {
            System.out.println(serie);
        }

        //TreeSet e ordem natural
        System.out.println("Séries em ordem natural (pelo tempo de exibição): ");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Series serie: minhasSeries2) {
            System.out.println(serie);
        }

        //Comparando via comparator por nome
        System.out.println("Séries em ordem natural Nome/Gênero/Tempo: ");
        Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries2);
        for (Series serie: minhasSeries2) {
            System.out.println(serie);
        }
    }
}