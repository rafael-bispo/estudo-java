class ClasseFilha1 extends ClasseMae {
    //a aplicação da sobrescrita é feit através de Override
    @Override
    //Observer que tem o mesmo nome do método da classe mãe
    void metodo1(){
        System.out.println("Este é o método 1 da classe Filha 1");
    }
}
