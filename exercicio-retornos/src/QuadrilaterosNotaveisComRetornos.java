public class QuadrilaterosNotaveisComRetornos {
    //area do quadrado
    public static double area(double lado){
        return lado*lado;
    }

    //area do retângulo
    public static double area(double lado1, double lado2){
        return lado1*lado2;
    }

    //area do losango
    public static float area(float diagonal1, float diagonal2){
        return (diagonal1*diagonal2)/2;
    }

    //area do trapézio
    public static double area(float baseMaior, float baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
}
