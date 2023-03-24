package one.digitalinnovation.strategy;

public class Robo {

    //Atributo comportamenteo, que é a nossa strategy
    private Comportamento comportamento;

    //set
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    //Método que também se chama mover, ou seja, implementa aqui que uma de suas ações é o método mover, já que comportamente é do tipo Comportamento, que é a interface que estabelece esse método.
    public void mover() {
        comportamento.mover();
    }
}