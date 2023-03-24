package one.digitalinnovation.gof;

/**
 * Singleton Básico
 * @author Rafael Bispo
 *
 */
public class SingletonBasico {
    //Repare abaixo que o Singleton instancia a própria classe
    private static SingletonBasico instancia;

    //Construtor

    /**
     * Este cosntrutor precisa ser privado para garantir que
     * ninguém de fora instanciá-lo externamente
     */
    private SingletonBasico() {
    }

    //Criando get que retorna instância somente se ela já não existir
    public static SingletonBasico getInstancia() {
        if(instancia == null){
            return instancia = new SingletonBasico();
        }
        return instancia;
    }
}
