import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

        /*
         * Foi acrescentado um if, para verificar se o número de páginas é múltiplo de 3,
         * de modo que não sendo, sobrarão páginas, que necessitarão de mais 1 dias para serem lidas.
         * Conforme pedido nos testes a saída ficou mais amigável, porém poderia ser feita uma entrada
         * mais amigável. Deixei desta forma pois é a forma que os testes são aceitos.
         * */
        int dias;
        if(paginas%paginasLidas==0){
            dias = paginas / paginasLidas;
        }
        else{
            dias = (paginas / paginasLidas) + 1;
        }
        System.out.println(dias+" dias");
    }
}