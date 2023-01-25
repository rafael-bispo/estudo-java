public class MinhaClasse {
    public static void main(String [] args){
        String primeiroNome = "Rafael";
        String ultimoNome = "Bispo";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String ultimoNome){
        return "Resultado da aplicação do método: " + primeiroNome.concat(" ").concat(ultimoNome);

    }
}
