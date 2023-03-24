import one.digitalinnovation.gof.SingletonBasico;
import one.digitalinnovation.gof.SingletonBasicoMelhorado;
import one.digitalinnovation.gof.SingletonRapido;

public class Main {
    public static void main(String[] args) {

        //Repare que não é possível criar uma nova instância usando new, mas é necessário usar o get da função
        SingletonBasico basico = SingletonBasico.getInstancia();

        System.out.println(basico);

        //instanciando novamente para ver se apontará para mesmo endereço de memória
        basico = SingletonBasico.getInstancia();

        System.out.println(basico);

        //Fazendo para os outros dois métodos e confirmando a instanciação

        SingletonRapido rapido = SingletonRapido.getInstancia();

        System.out.println(rapido);

        //instanciando novamente para ver se apontará para mesmo endereço de memória
        rapido = SingletonRapido.getInstancia();

        System.out.println(rapido);




        SingletonBasicoMelhorado melhorado = SingletonBasicoMelhorado.getInstancia();

        System.out.println(melhorado);

        //instanciando novamente para ver se apontará para mesmo endereço de memória
        melhorado = SingletonBasicoMelhorado.getInstancia();

        System.out.println(melhorado);
    }
}