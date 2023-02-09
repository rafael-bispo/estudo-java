import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada

        /*
         * Foi feita a multiplicação já na saída, com a variável doces sendo multiplicada por 2,
         * e assim entregando o número de doces que será obtido.
         * Conforme pedido nos testes a saída ficou mais amigável, porém poderia ser feita uma entrada
         * mais amigável. Deixei desta forma pois é a forma que os testes são aceitos.
         * */
        System.out.println("O cliente obteve "+(doce*2)+" doces");
    }
}