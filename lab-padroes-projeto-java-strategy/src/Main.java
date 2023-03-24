import one.digitalinnovation.strategy.*;

public class Main {
    public static void main(String[] args) {

        //Criando os comportamentos
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        //Criando o robô
        Robo robo = new Robo();

        //Setando seu comportamento com o objeto normal (ou seja, setamos qual estratégia ele está usando)
        robo.setComportamento(normal);

        //Colocando o robô para se mover
        robo.mover();
        robo.mover();

        //Mudando a estratégia e setando outros valores para o robô e colocando-o para mover-se de acordo com aestratégia.

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        System.out.println("Hello world!");
    }
}