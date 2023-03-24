package one.digitalinnovation.gof;

public class SingletonRapido{
    //Diferente do Basico ele já adianta e cria aqui o objeto
    private static SingletonRapido instancia = new SingletonRapido();

    //Construtor

    /**
     * Este cosntrutor precisa ser privado para garantir que
     * ninguém de fora instanciá-lo externamente
     */
    private SingletonRapido() {
    }

    //Get
    public static SingletonRapido getInstancia() {
        return instancia;
    }
}
