package map.exemplos;

import java.util.Objects;

public class Livros {

    //Atributos
    String nome;
    Integer paginas;

    //Construtor

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    //Equals e HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    //toString
    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
