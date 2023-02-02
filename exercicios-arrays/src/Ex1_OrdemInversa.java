import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {
        //declaração de vetor de números inteiros
        int[] vetorNumeros = {15, -9, 35, -987, 67, 90};
        
        System.out.println("\nNumeros armazenados em vetor na seguinte sequencia: \n");

        //declaração e inicialização de contador
        int contador = 0;
        //condição será exibir até o tamanho do vetor-1 (pelo indice do vetor começar em 0)
        while(contador<(vetorNumeros.length))
        {
            //exibição do elemento atual do vetor e incremento de contador
            System.out.println(vetorNumeros[contador]);
            contador++;
        }

        System.out.println("\nAgora eles serão exibidos em ordem inversa: \n");

        //declaração e inicialização de contador no tamanho-1 para ficar com o indice correto
        contador = vetorNumeros.length - 1;
        //condição será até exibir número do índice 0 do vetor (primeiro número)
        while(contador>=0)
        {
            //exibição do elemento atual do vetor e decremento de contador
            System.out.println(vetorNumeros[contador]);
            contador--;
        }
    }
}
