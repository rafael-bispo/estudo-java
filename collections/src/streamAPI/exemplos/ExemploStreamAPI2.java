package streamAPI.exemplos;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ExemploStreamAPI2 {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        //Imprimindo todos os elementos dessa lista de string
        /*
        * Abaixo usando Stream, e o foreach, com um consumer como
        * argumento, é feita a impressão. Observe que nesse caso não
        * foi necessário usar aquela grande estrutura de foreach com entry
        * ou ainda usar iterator.
        * */
        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //usando lâmbda para imprimir:
        /*numerosAleatorios.stream().forEach(s -> System.out.println(s));*/

        //O List possui forEach sem usar stream:
        /*numerosAleatorios.forEach(s -> System.out.println(s));*/

        //Transformando o sout em reference method
        System.out.println("Exibindo os números usando streamAPI: ");
        numerosAleatorios.forEach(System.out::println);


        //Pegar (coletar) os 5 rpimeiros número e colocar dentro de um set.
        /*
        * Usando a função limit de stream (onde o argumento
        * é a quantidade máxima que você quer,
        * a partir do primeiro elemento):
        * */
        System.out.println("Primeiros 5 elementos colocados em um set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        /*Note acima que é possível exibir mesmo sem colocar dentro
        de uma variável. Além disso ele exibe somenete 4 elementos
        desta vez, justamente porque set não aceita elmentos
        repitidos, e lembre-se que eles também estão em uma ordem
        aleatória*/

        //transformando a lista de string em lista de inteiros:
        /*
        * Observe que map não tem nada a ver o tipo Map
        * */
        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());


        System.out.println("Exibindo números inteiros: ");
        collectList.forEach(System.out::println);

        //Pegando números pares e maiores que 2 e colocando numa lista
        /*
        * Observe que usa-se a function filter que retorna booleando
        * Ou tro detalhe é que fiz diretamente da lista já convertida, porém ela fez da lista de string
        * */
        /*List<Integer> paresMaiores2 = collectList.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if((i%2 == 0)&&(i > 2)) return true;
                else return false;
            }
        }).collect(Collectors.toList());*/

        /*Fazendo o filter com lambda*/
        List<Integer> paresMaiores2 = collectList.stream().filter(i -> (i%2 == 0)&&(i > 2)).collect(Collectors.toList());

        System.out.println("Exibindo os números pares maiores que 2: ");
        paresMaiores2.forEach(System.out::println);

        //Fazendo média usando a função average e exibindo
        /*numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(new DoubleConsumer() {
            @Override
            public void accept(double v) {
                System.out.println(v);
            }
        });*/

        /*
        * Simplificando em lambda
        * */
        System.out.println("A média é: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        //Removendo os ímpares sem usar stream
        collectList.removeIf(i -> (i%2 !=0));

        System.out.println("lista de inteiros com os ímpares remobidos: ");
        collectList.forEach(System.out::println);

        //Existem outros exercícios, porém por conta do tempo foi inviável responder
    }
}
