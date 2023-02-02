import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        //declarando random
        Random random = new Random();
        
        //declarando a matriz
        int[][] matriz = new int[4][4];

        //Rotina para preencher array com valores aleatórios até 9
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }

        //Rotina para exibir array preenchido
        System.out.println("Matriz 4x4 preenchida com numeros aleatorios de 1 a 9: \n\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+"    ");
            }
            System.out.println("\n");
        }

        System.out.println();
    }
}
