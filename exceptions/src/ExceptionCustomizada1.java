import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        }
        /*
        * Essa exceção por herdar da outra fica por cima
        * */
        catch (ImpossivelAbrirArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            //e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAbrirArquivoException {

        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            /*
            * Aqui é como se lança uma nova exceção, do tipo que você criou.
            * */
            throw new ImpossivelAbrirArquivoException(file.getName(), file.getPath());
        }
    }

}

/*
 * Criando Class por fora
 * Para poder criar exception
 * */
class ImpossivelAbrirArquivoException extends Exception{

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAbrirArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encotrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAbrirArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}



