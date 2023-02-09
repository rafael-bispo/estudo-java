public class QuadrilaterosNotaveis {
    //area do quadrado
    public static void area(double lado)
    {
        System.out.println("A área do quadrado é: "+(lado*lado));
    }

    //area do retângulo
    public static void area(double lado1, double lado2)
    {
        System.out.println("A área do retângulo é: "+(lado1*lado2));
    }

    //area do losango
    public static void area(float diagonal1, float diagonal2)
    {
        System.out.println("A área do losango é: "+((diagonal1*diagonal2)/2));
    }

    //area do trapézio
    public static void area(float baseMaior, float baseMenor, double altura)
    {
        System.out.println("A área do trapézio é: "+(((baseMaior+baseMenor)*altura)/2));
    }
}
