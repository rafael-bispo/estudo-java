public class RodarAplicacao {
    public static void main(String[] args) {
        //Criação de vetor contendo com upcast
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //Usando um for each para percorrer os objetos
        /*
        * Para a ClasseFilha1 e ClasseFilha2 ocorrerá polimorfismo, porque ao executar,
        *  as classes assumirão o comportamento de objeto da ClasseFilha1 e ClasseFilha 2
        *  respectivamente, mesmo sendo ambas do tipo ClasseMae
        * Já a ClasseMae assume seu comportamento usual
        */
        System.out.println("\nDemonstração do método 1:\n");
        for(ClasseMae classeAtual: classes) {
            classeAtual.metodo1();
        }

        /*
        * Já nesta outra execução, vê-se a ClasseFilha1 assumindo o comportando
        * da ClasseMae de quem ela herda os métodos, exatamente por não ter um método 2
        * que sobrescreveria o método 2 de sua ClasseMar.
        * Na ClassFilha2 ocorrerá polimorfirmos mais uma vez pois também possui método 2
        * que sobrescreve o método de sua ClasseMae, mesmo ela sendo so tipo ClasseMae.
        * Já a ClasseMae apresenta seu comportamento normal
        * */
        System.out.println("\nDemonstração do método 2:\n");
        for(ClasseMae classeAtual: classes) {
            classeAtual.metodo2();
        }

        /*
        * Aqui temos o compotamento de sobrescita direta da ClasseFilha2
        * implementeado pelo override realizado no método 2 dentro da
        * própria ClasseFilha2
        * */
        System.out.println("\nDemonstração do método 2 apenas da classe filha 2:\n");
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}