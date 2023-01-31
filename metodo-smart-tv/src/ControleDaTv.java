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
    //Método para exibir o estado atual da TV
    public static void exibirEstadoDaTv(SmartTv tv2){
        //Exibindo o estado atual
        System.out.println("\n\nEstados atuais dos atributos da TV: ");
        System.out.println("Está ligada?: "+tv2.ligada);
        System.out.println("Em qual canal está atualmente?: "+tv2.canal);
        System.out.println("Qual o volume atual?: "+tv2.volume);
    }
}
