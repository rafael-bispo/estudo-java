import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {
    public static void main(String[] args) {

        String nomeDoArquivo = "romanc-blake-crouch.txt";

        /*
        * Abaixo existem 2 catchs para poder separar o erro do
        * nome do arquivo errado ou não encontrado, de algum
        * erro relaciona a leitura escrita, ou coisa do tipo.
        * No caso, se uma classe for filha da outra, sempre colocar a filha antes da mãe
        * Para que a filha não fique inutilizada.
        * Mais expecífica por cima e mais geral por baixo.
        * */
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
            //throw new RuntimeException(e);
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contao com o suporte!" + e.getCause());
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Lembre-se: o finally é opcinal!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    /*
    * Dessa vez demos "sorte" no fato de uma classe
    * ser filha da outra e assim colocando a mais geral já sanar o problema.
    * */
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}