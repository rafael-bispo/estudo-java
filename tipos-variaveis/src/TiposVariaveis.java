public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // TiposEVariaveis.java
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //usando casting para corrigir tipo de variáveis. No caso, a melhor saída seria colocar todas como int

        //declarando constante
        final double VALOR_DE_PI = 3.14;
    }
}
