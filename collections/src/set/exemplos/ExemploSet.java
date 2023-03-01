package set.exemplos;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Conjunto set de notas: ");
        System.out.println(notas);

        System.out.println("Verificando se a nota 5 está no conjunto: "+notas.contains(5d));

        System.out.println("Verificando se a nota 10.43 está no conjunto: "+notas.contains(10.43));

        System.out.println("Menor nota: "+ Collections.min(notas));
        System.out.println("Maior nota: "+ Collections.max(notas));

        //Realizando soma de valores com iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Somatório das notas do conjunto: "+soma);
        System.out.println("A média das notas é: "+(soma/(notas.size())));

        notas.remove(0.0);
        System.out.println(notas);

        //Removendo notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println("COnjunto com notas menores que 7 removidas: ");
        System.out.println(notas);

        //trabalhando agora com LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>();

        //Observar que o 7 é adicionado duas vezes, porém, por nãoa dmitir repetidos, ele coloca só um 7 na lista set
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6d);

        System.out.println("Conjunto set de notas: ");
        System.out.println(notas2);

        //Declarando TreeSEt e passando notas 2 como argumento.
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Notas em uma TreeSet:");
        System.out.println(notas3);

        //Apagando o primeiro conjunto:
        notas.clear();
        System.out.println("Verificando se o primeiro conjunto foi apagado: "+notas.isEmpty());
    }
}
