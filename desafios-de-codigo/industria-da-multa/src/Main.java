import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

        /*
         * Foi feita apenas a verificação da velocidade atual com um if, e assim
         * exibida a saída adequada.
         * Conforme pedido nos testes a saída ficou mais amigável, porém poderia ser feita uma entrada
         * mais amigável. Deixei desta forma pois é a forma que os testes são aceitos.
         * */
        if(velocidadeAtual <= 60){
            System.out.println("Nao foi multado");
        }
        else{
            System.out.println("Foi multado");
        }
    }
}