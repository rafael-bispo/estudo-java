public class Main {
    public static void main(String[] args) {
        //Exemplos para invovar métodos de sobrecarga:

        //Área do quadrado
        System.out.println();
        System.out.println("A área do quadrado é: "+ QuadrilaterosNotaveisComRetornos.area(5));

        /*
        *Observação: nas sobrecargas onde existem valores float e double
        *com mesma quantidade de parâmetros, se faz necessário identificar
        * no momento em que se invoca. Para isso, após o valor, utilizar
        * f para float e d para double.
        */
        //Área do retângulo
        System.out.println();
        System.out.println("A área do retângulo é: "+ QuadrilaterosNotaveisComRetornos.area(4d, 7d));

        //Área do losango
        System.out.println();
        System.out.println("A área do losango é: "+ QuadrilaterosNotaveisComRetornos.area(5f, 6f));

        //Área do losango
        System.out.println();
        System.out.println("A área do trapézio é: "+ QuadrilaterosNotaveisComRetornos.area(7,5,4));
    }
}