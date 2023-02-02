import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {
        //declaradno variável random
        Random random = new Random();

        //declarando array de inteiros
        int[] numerosAleatorios = new int[20];

        //Rotina de criação de números aleatórios
        for(int contador = 0; contador < numerosAleatorios.length; contador++){
            numerosAleatorios[contador] = random.nextInt(100);
        }

        //Rotina de exibição de números aleatórios
        System.out.println("\nExibindo os 20 números aleatórios gerados: ");
        for (int num : numerosAleatorios) {
            System.out.println("Aleatório: "+num+"  Sucessor: "+(num+1)+"  Antecessor: "+(num-1));
        }
    }
}