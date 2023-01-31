/**
* <h1>SmartTv</h1>
* Este é um exemplo para o entedimento relativo a classes, atributos e métodos.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Rafael Bispo (feito como base no exemplo do curso do professor Gleyson Sampaio)
* @version 1.1
* @since   31/01/2023
*/
public class SmartTv {
    boolean ligada = false;
    int volume = 10;
    int canal = 1;

   /**
   * Este método é utilizado para mudar o valor da variável ligada para true
   * @return Não retorna nenhum valor
   */
    public void ligar(){
        ligada=true;
    }
    /**
   * Este método é utilizado para mudar o valor da variável ligada para false
   * @return Não retorna nenhum valor
   */
    public void desligar(){
        ligada=false;
    }

    /**
   * Este método é utilizado para incrementar o valor da variável volume de 1 em 1
   * @return Não retorna nenhum valor
   */
    public void aumentarVolume(){
        volume++;
    }
    /**
   * Este método é utilizado para decrementar o valor da variável volume de 1 em 1
   * @return Não retorna nenhum valor
   */
    public void diminuirVolume(){
        volume--;
    }

    /**
   * Este método é utilizado para incrementar o valor da variável canal de 1 em 1
   * @return Não retorna nenhum valor
   */
    public void avancarCanal(){
        canal++;
    }
    /**
   * Este método é utilizado para decrementar o valor da variável canal de 1 em 1
   * @return Não retorna nenhum valor
   */
    public void voltarCanal(){
        canal--;
    }

    /**
   * Este método é utilizado para mudar o canal diretamente
   * @param novoCanal este valor representa o número do canal para o qual a
   * televisão mudará
   * @return Não retorna nenhum valor
   */
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
}
