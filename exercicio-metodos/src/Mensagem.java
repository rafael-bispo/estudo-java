public class Mensagem {
    public static void enviarMensagem(int hora){
        switch (hora) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> Mensagem.bomDia();
            case 13, 14, 15, 16, 17, 18 -> Mensagem.boaTarde();
            case 19, 20, 21, 22, 23 -> Mensagem.boaNoite();
            default -> System.out.println("Hora inválida!");
        }
    }

    public static void bomDia(){
        System.out.println("Bom dia!");
    }
    public static void boaTarde(){
        System.out.println("Bom tarde!");
    }
    public static void boaNoite(){
        System.out.println("Boa noite!");
    }
}
