/*
* Acontece erro na linha 17 por conta do downcast!
* */
class RodarAplicacao {
    public static void main(String[] args) {
        //criando objetos padrão
        Funcionario funcionario = new Funcionario();

        Gerente gerente = new Gerente();
        Faxineiro faxineiro = new Faxineiro();
        Vendedor vendedor = new Vendedor();

        //criando updcast
        Funcionario gerente1 = new Gerente();

        //criando downcast (gera erro de compilação)
        Faxineiro funcionario1 = (Faxineiro) new Funcionario();
    }
}
