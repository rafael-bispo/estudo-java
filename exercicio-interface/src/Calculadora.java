/*
* Aqui é onde os métodos da interface serão implementados.
* Caso algum deles não esteja sendo implementado apresentará erro.
* Funciona como se a interface obriga a implementar as "regras" (métodos)
* criadas nela
* */
class Calculadora implements OperacoesMatematicas{
    @Override
    public void soma(double numero1, double numero2){
        System.out.println("Soma: "+(numero1 + numero2));
    }

    @Override
    public void subtracao(double numero1, double numero2){
        System.out.println("Subtração: "+(numero1 - numero2));
    }

    @Override
    public void multiplicacao(double numero1, double numero2){
        System.out.println("Multiplicação: "+(numero1 * numero2));
    }

    @Override
    public void divisao(double numero1, double numero2){
        System.out.println("Divisão: "+(numero1 / numero2));
    }
}
