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
public class ControleDaTv {
    public static void main(String[] args) throws Exception {
       
        //O comando abaixo cria um objeto tv do tipo SmartTv
        SmartTv tv = new SmartTv();

        exibirEstadoDaTv(tv);

        tv.ligar();

        exibirEstadoDaTv(tv);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        
        tv.avancarCanal();
        tv.avancarCanal();
        tv.avancarCanal();
        tv.avancarCanal();
        tv.avancarCanal();
        tv.voltarCanal();
        tv.voltarCanal();

        exibirEstadoDaTv(tv);

        tv.mudarCanal(42);
        
        tv.desligar();

        exibirEstadoDaTv(tv);
    }
    
    /**
   * Este método é utilizado para mudar o canal diretamente
   * @param tv2 é o objeto do tipo SmartTv que recebe os parâmetros a serem exibidos
   * @return Não retorna nenhum valor
   */
    public static void exibirEstadoDaTv(SmartTv tv2){
        
        System.out.println("\n\nEstados atuais dos atributos da TV: ");
        System.out.println("Está ligada?: "+tv2.ligada);
        System.out.println("Em qual canal está atualmente?: "+tv2.canal);
        System.out.println("Qual o volume atual?: "+tv2.volume);
    }
}
