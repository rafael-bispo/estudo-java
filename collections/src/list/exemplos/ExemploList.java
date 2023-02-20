package list.exemplos;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //Declarando uma List
        List<Double> notas = new ArrayList<>();

        //Inicializando List usando método add
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        //Exibindo a lista
        System.out.println(notas);

        //Segunda forma de exibir a lista
        System.out.println(notas.toString());
        //o método toString retorna uma representação String de um objeto

        //Descobrindo a posição de um elemento
        System.out.println("Exibindo a posição do elemento 5: posição " + notas.indexOf(5.0));
        //No caso exibe a posição do índice, lembrando que o índice começa em 0 em java.
        //Além disso se houver item repetido, mostra primeira posição que ele aparece

        //Adicionando um elemento em uma determinada posição
        notas.add(4, 8.0);

        //Lista com novo elemento
        System.out.println(notas);

        //Susbstituindo valor e exibindo
        notas.set(notas.indexOf(5.0), 6.2);
        System.out.println(notas);

        //conferindo se existe a nota 5 na lista (não existe, foi substituida por 6.4)
        System.out.println("Conferir se existe nota 5 na lista: " + notas.contains(5.0));
        //conferindo se existe a nota 6.2 na lista (existe, substituiu o 5)
        System.out.println("Conferir se existe nota 6.2 na lista: " + notas.contains(6.2));

        //Exibindo notas com for each
        for(Double nota : notas){
            System.out.println(nota);
        }

        //Obtendo elemento através do índice
        System.out.println("Exibindo a terceira nota: " + notas.get(2));

        //Exibindo a menor nota
        System.out.println("Exibindo a terceira menor: " + Collections.min(notas));

        //Exibindo a maior nota
        System.out.println("Exibindo a terceira maior: " + Collections.max(notas));

        //Somando os elementos através de iterador
        Iterator<Double> iterator = notas.iterator();

        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exibindo somatório das notas: " + soma);

        //Exibindo a média das notas
        System.out.println("Exibindo a média das notas: " + (soma/notas.size()));

        //Removendo a nota 0
        notas.remove(0d);

        //Removendo a nota na posição 0
        notas.remove(0);

        System.out.println(notas);

        //Removendo notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7.0){
                iterator1.remove();
            }
        }

        System.out.println(notas);

        //Apagando a lista
        notas.clear();
        System.out.println("A lista está vazia: " + notas);

        //Verificando se a lista está vazia:
        System.out.println("Verificando se a lista está vazia: " + notas.isEmpty());
    }
}
