package set.exercicios.arcoiris;

import java.util.HashSet;
import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class CoresArcoIris {
    public static void main(String[] args) {
        Set<String> arcoiris = new HashSet<>();
        arcoiris.add("Vermelho");
        arcoiris.add("Amarelo");
        arcoiris.add("Laranja");
        arcoiris.add("Verde");
        arcoiris.add("Azul");
        arcoiris.add("Violeta");
        arcoiris.add("Anil");

        //cores do arco íris exibidas uma abaixo da outra
        System.out.println("\nCores do arco-íris: ");
        for (String cores: arcoiris) {
            System.out.println(cores);
        }

        //quantidade de cores do arco-íris
        System.out.println("Quantidade de cores do arco-íris: "+arcoiris.size());

        //Ordenando em ordem alfabética
        Set<String> arcoiris2 = new TreeSet<>(arcoiris);
        System.out.println("\nCores do arco-íris em ordem alfabética: ");
        for (String cores1: arcoiris2) {
            System.out.println(cores1);
        }

        //Exibindo na ordem inversa que foi informada
        Set<String> arcoiris3 = new LinkedHashSet<>(Arrays.asList("Vermelho", "Amarelo", "Laranja", "Verde", "Azul", "Violeta", "Anil"));
        List<String> arcoirisList = new ArrayList<>(arcoiris3);
        Collections.reverse(arcoirisList);
        System.out.println("\nCores do arco-íris em ordem inversa da que foi informada: ");
        for (String cores2: arcoirisList) {
            System.out.println(cores2);
        }

        //cores do arco íris que começam com letra V
        System.out.println("\nCores do arco-íris que começam com a letra V (não ordenado): ");
        for (String cores: arcoiris) {
            if((cores.startsWith("V"))||(cores.startsWith("v"))){
                System.out.println(cores);
            }
        }

        //Removendo cores do arco íris que não começam com letra V e exibindo com as letras removidas
        Iterator<String> iterator1 = arcoiris.iterator();
        while (iterator1.hasNext()) {
            if (!(iterator1.next().startsWith("V")) || !(iterator1.next().startsWith("v"))){
                iterator1.remove();
            }
        }
        System.out.println("\nAgora alista somente contém itens iniciados com a letra V(não ordenado): ");
        for (String cores5: arcoiris) {
            System.out.println(cores5);
        }

        //Limpando o conjunto
        arcoiris.clear();

        //Verificando se está vazio;oyhouiyh
        System.out.println("\nVerificando se foi limpo o conjunto: "+arcoiris.isEmpty());
    }
}
