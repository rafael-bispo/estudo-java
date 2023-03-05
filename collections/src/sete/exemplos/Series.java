package set.exemplos;

import java.util.Objects;

class Series implements Comparable <Series>{
    //Declarando atributos
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    //Construtores
    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    //Necessário fazer Override de Hash e equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) && genero.equals(series.genero) && tempoEpisodio.equals(series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    //Implementando o comparable
    @Override
    public int compareTo(Series series) {
        //Declarando variável que receberá valor resultante da comparação
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
        int genero = this.getGenero().compareTo((series.getGenero()));
        int nome = this.getNome().compareTo((series.getNome()));

        //Esta verificação feita com o if faz com que se os valores forem iguais sejam comparados os tempos de duração e nome.
        if(tempoEpisodio != 0){
            return tempoEpisodio;
        }
        else {
            if (genero != 0) {
                return genero;
            } else {
                return nome;
            }
        }
    }
}