package one.digitalinnovation.gof;

/**
 * Singleton Básico
 * @author Rafael Bispo
 *
 */
public class SingletonBasicoMelhorado {
    //O atributo é criado dentro de uma classe interna que precisa ser publica para que o atributo seja acessado pela classe externa
    private static class DetentorInstancia {
        private static SingletonBasicoMelhorado instancia = new SingletonBasicoMelhorado();
    }


    //Construtor
    /**
     * Este cosntrutor precisa ser privado para garantir que
     * ninguém de fora instanciá-lo externamente
     */
    private SingletonBasicoMelhorado() {
    }

    //Criando get que retorna instância da classe interna
    public static SingletonBasicoMelhorado getInstancia() {
        return DetentorInstancia.instancia;
    }
}
