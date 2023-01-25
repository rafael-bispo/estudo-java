public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.print(nomeCompleto);

        /*Fazendo debug do trecho de código abaixo é possível
         perceber que o operador + realiza soma até achar um 
         string, depois de achar string ele concatena mesmo que 
         volte a aparecer valores tipo int. Nesse caso, importa a 
         precedência*/
        String concatenacao ="?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }
}
