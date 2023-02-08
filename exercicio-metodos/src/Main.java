import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double resultado, numero1, numero2;
        int verificador;


        System.out.println("Digite:\n1-Para soma\n2-Para subtração\n3-Para multiplicação\n4-Para divisão\n\nOpção: ");
        verificador = leitura.nextInt();

        System.out.print("\n\nDigite o primeiro número para realizar operação: ");
        numero1 = leitura.nextDouble();

        System.out.print("\n\nDigite o segundo número para realizar operação: ");
        numero2 = leitura.nextDouble();



        switch(verificador) {
            case 1:
                resultado = Calculadora.soma(numero1, numero2);
                System.out.println(numero1+" + "+numero2+" = "+resultado+"\n\n");
                break;
            case 2:
                resultado = Calculadora.subtracao(numero1, numero2);
                System.out.println(numero1+" - "+numero2+" = "+resultado+"\n\n");
                break;
            case 3:
                resultado = Calculadora.multiplicacao(numero1, numero2);
                System.out.println(numero1+" * "+numero2+" = "+resultado+"\n\n");
                break;
            case 4:
                resultado = Calculadora.divisao(numero1, numero2);
                System.out.println(numero1+" / "+numero2+" = "+resultado+"\n\n");
                break;
            default:
                System.out.println("Opção inválida! Execute novamente para usar a calculadora");
                break;
        }


        //System.out.println(resultado);
    }
}