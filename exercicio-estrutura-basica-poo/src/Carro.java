/*
* Classe e métodos abaixo criados apenas para efeito de exercício
* */
class Carro {
    /*
    * Como organizar:
    *
    * - Atributos
    * - Construtores
    * - Gets e Sets
    * - Métodos de negócio (que fazem de fato os cálculos pedidos)
    * */

    //Abaixo atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //Abaixo o construtor:
    Carro(){

    }
    //Sobrecarga do construtor com parâmetros
    //*usando parametros com nomes diferentes para não confundir
    Carro(String cor1, String modelo1, int capacidadeTanque1){
        this.cor = cor1;
        this.modelo = modelo1;
        this.capacidadeTanque = capacidadeTanque1;
    }

    //Abaixo gets e sets
    /*
    * Observe no método abaixo que:
    * color é uma cor passada por parâmetro.
    * O método setCor recebe este valor para poder "inicializar"
    * o atributo cor da classe.
    * This, é a palavra reservada para poder indicar que este é
    * o valor da instância atual.
    * */
    void setCor(String color){
        this.cor = color;
    }
    /*
     * Já aqui, o método getCor retorna o valor atual de cor,
     * quando for solicitado
     * */
    String getCor(){
        return cor;
    }

    //Abaixo está definido o set e o get do modelo
    void setModelo(String model){
        this.modelo = model;
    }
    String getModelo(){
        return modelo;
    }

    //Abaixo está definido o set e o get do tanque
    void setCapacidadeTanque(int capacidade){
        this.capacidadeTanque = capacidade;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //Abaixo métodos de negócio

    //O método abaixo serve para calcular de fato o valor do tanque cheio
    double calcularTanqueCheio(double valorCombustivel) {

        return capacidadeTanque * valorCombustivel;
    }
}