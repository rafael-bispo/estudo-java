import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

        /*
         * É apenas necessário printar as barras.
         * Este programa poderia ser melhorado com uma entrada e saída mais amigável.
         * Além disso seria interessante ter um limitador para não exceder 100% ou 100 barras.
         * Deixei da forma que entreguei à DIO. Pois este é o formato que eles aceitam
         * para poder passa nos testes com sucesso.
         * */
        for(int count = 0;count < tamanho; count++){
            System.out.print("/");
        }
    }
}