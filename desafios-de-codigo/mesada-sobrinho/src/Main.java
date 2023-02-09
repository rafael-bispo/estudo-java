// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

        /*
        * É apenas necessário printar a multiplicação de ambos os valores.
        * Este programa poderia ser melhorado com uma entrada e saída mais amigável.
        * Deixei da forma que entreguei à DIO. Pois este é o formato que eles aceitam
        * para poder passa nos testes com sucesso.
        * Teste para demonstrar o versionamento.
        * */
        System.out.println(mesada*entrada);

    }
}