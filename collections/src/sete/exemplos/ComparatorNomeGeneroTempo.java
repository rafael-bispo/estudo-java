package set.exemplos;

import java.util.Comparator;

public class ComparatorNomeGeneroTempo implements Comparator<Series> {

    @Override
    public int compare(Series s1, Series s2) {
        //Declarando variável que receberá valor resultante da comparação
        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        int genero = s1.getGenero().compareTo((s2.getGenero()));
        int nome = s1.getNome().compareTo((s2.getNome()));

        //Esta verificação feita com o if faz com que se os valores forem iguais sejam comparados os tempos de duração e nome.
        if(nome != 0){
            return tempoEpisodio;
        }
        else {
            if (genero != 0) {
                return genero;
            } else {
                return tempoEpisodio;
            }
        }
    }
}
