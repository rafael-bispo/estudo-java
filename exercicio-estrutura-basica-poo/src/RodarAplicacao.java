class RodarAplicacao {
    public static void main(String[] args) {

        System.out.println("\n\nPrimeiro Exemplo:\n");

        //criando um objeto
        Carro carro1 = new Carro();

        //Realizando os sets
        carro1.setCor("Azul");
        carro1.setModelo("Toyota Corolla");
        carro1.setCapacidadeTanque(50);

        //Exibindo utilizando os gets
        System.out.println("O modelo do carro é: "+carro1.getModelo());
        System.out.println("A cor do carro é: "+carro1.getCor());
        System.out.println("A capacidade do tanque de combustível do carro é: "+carro1.getCapacidadeTanque()+" L");
        System.out.println("O valor total gasto para encher o tanque é de R$ "+carro1.calcularTanqueCheio(5.69)+"   (Com o preço da gasolina de R$ 5,69)");

        /*
        * Segundo exemplo: utilizando o construtor que recebe parâmetros, ao invés de utilizar
        * o get para iniciar os atributos;
        * */

        System.out.println("\n\n\nSegundo Exemplo:\n");

        Carro carro2 = new Carro("Branco", "Ford Fusion", 51);
        //Exibindo utilizando os gets
        System.out.println("O modelo do carro é: "+carro2.getModelo());
        System.out.println("A cor do carro é: "+carro2.getCor());
        System.out.println("A capacidade do tanque de combustível do carro é: "+carro2.getCapacidadeTanque()+" L");
        System.out.println("O valor total gasto para encher o tanque é de R$ "+carro2.calcularTanqueCheio(5.69)+"   (Com o preço da gasolina de R$ 5,69)");

    }
}
