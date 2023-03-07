package streamAPI.exemplos;

import java.util.*;
import java.util.function.Function;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 2222));
            put(3, new Contato("Jon", 1111));
        }};

        //Ordem por value número de telefone usando classe anônima
        /*
        * Abaixo é implementada a a classe Comparator usando classe anônima,
        * no caso, passando como argumento, de modo a realizar a comparação.
        * */
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });*/


        //A partir daqui é feito usando FunctionalInterface(Function)
        /*
        * Aabaixo foi criada uma nova function, o primeiro elemento antes da vírgula
        * é o argumento, o segundo elemento é o tipo de retorno.
        * É necessário implementar o método e colocar o retorno correto.
        *Retorna inteiro porque é o mesmo esquema de comparação para ordenação,
        * que retorna o valor de acordo com ser maior, menor, ou igual.
        * */
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));*/

        //A partir daqui serão usados lambdas
        /*
        * No caso, você só precisa do argumento à esquerda e do corpo do retorno à difreiata da seta
        * Neste caso específico o lambda foi a simplificação máxima
        * */
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());

        System.out.println("Por ordem de numero de telefone utilizando classe anônima: ");

        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        //Ordenações pelo nome

        //Ordenando com classe anonima pelo nome
        Set<Map.Entry<Integer, Contato>> setNome = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                boolean a;
                return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
            }
        });
        //**LEMBRE-SE: compareTo retorna inteiro, equals retorna boolean

        //Ordenando com lambda pelo nome
        /*Set<Map.Entry<Integer, Contato>> setNome = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));*/

        setNome.addAll(agenda.entrySet());

        System.out.println("Por ordem de Nome utilizando lambda anônima: ");

        for (Map.Entry<Integer, Contato> entry: setNome) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        //continuar em 5:30
    }
}
