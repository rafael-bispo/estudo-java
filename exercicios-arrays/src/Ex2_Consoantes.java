/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        
        //declarando scanner
        Scanner leitura = new Scanner(System.in);

        //declarando funções de string
        String[] consoantes = new String[6];

        //declarando variáveis inteiras
        int quantidadeConsoantes = 0, contador = 0;

        do {
            //lendo letras
            System.out.print("Digite uma letra: ");
            String letra = leitura.next();

            if ( !(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) ) {

                //atribuindo consoantes ao
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }
            
            //incremento de contador
            contador++;
        } while (contador < consoantes.length);

        //Usando o for-each para percorrer o array de consoantes e exibí-las
        System.out.println("\nAs consoantes digitadas:\n");
        for (String temporaria : consoantes) {
            if(!(temporaria.equalsIgnoreCase("a") || temporaria.equalsIgnoreCase("e") || temporaria.equalsIgnoreCase("i") || temporaria.equalsIgnoreCase("o") || temporaria.equalsIgnoreCase("u"))){
                System.out.println(temporaria);
            }
            
        }
        System.out.println("O total de consoantes digitadas foi: "+quantidadeConsoantes+"\n\n");
    }
}
