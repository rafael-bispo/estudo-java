import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        //colocando do while para rodar enquanto nao for digitado numero valido
        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            /*
            * Try é o bloco onde se coloca a lógica onde pode ocorrer a exception
            * Catch é para capturar a
            * */
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                continueLooping = false;
                //System.out.println("Resultado: " + resultado);
            } catch (NumberFormatException e) {
                /*Definindo que, quando a exceção ocorrer, deve
                * ser exibida na tela uma frase para o usuário
                * digitar corretamente.
                * */
                JOptionPane.showMessageDialog(null, "Entrada inválida! Informe um número inteiro! " + e.getMessage());
                //As mensagens abaixo serve para o programador, a mensagem acima, para o usuário
                //throw new RuntimeException(e);
                //e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Entrada inválida! Impossível dividir por zero" + e.getMessage());
            }
            finally {
                System.out.println("Chegou no finally");
            }

        }while(continueLooping);


        System.out.println("Chegou até aqui...");
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}