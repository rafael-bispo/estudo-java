/*
*Exercício Map com  estados do Nordeste
*
 */

package map.exercicios;

import java.util.*;

public class ExercicioPopulacaoMap {
    public static void main(String[] args) {
        Map<String, Integer> estadosNordeste = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        //Exibindo por ordem aeatória
        System.out.println(estadosNordeste);

        //Susbtituindo a população do RN
        estadosNordeste.put("RN", 3534165);
        System.out.println(estadosNordeste);

        //Verificado se existe o estado PB incluso
        System.out.println("Estado PB está incluso? : " + estadosNordeste.containsKey("PB"));

        //Adicionando PB
        estadosNordeste.put("PB", 4039277);
        System.out.println("Grupo de estados incluind PB: ");
        System.out.println(estadosNordeste);

        //Exibindo pop de PE:
        System.out.println("A população de PE é: " + estadosNordeste.get("PE"));

        //Exibindo os estados na ordem que foram informados
        Map<String, Integer> estadosNordeste1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534165);
            put("PB", 4039277);
        }};

        System.out.println("Estados do Nordeste na ordem que foram informados: ");
        System.out.println(estadosNordeste1);

        //Exibindo por ordem alfabética
        Map<String, Integer> estadosNordeste2 = new TreeMap<>(estadosNordeste1);
        System.out.println("Estados do Nordeste na ordemalfabética: ");
        System.out.println(estadosNordeste2);

        //Exibindo o estado com menor população
        Integer menorPopulacao = Collections.min(estadosNordeste.values());

        Set<Map.Entry<String, Integer>> entries = estadosNordeste.entrySet();
        String estadoMenorPopulacao = "";


        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();
            }
        }

        System.out.println("O estado com a menor população: " + estadoMenorPopulacao + ": " + menorPopulacao);

        //Exibindo o estado com maior população
        Integer maiorPopulacao = Collections.max(estadosNordeste.values());

        Set<Map.Entry<String, Integer>> entradas = estadosNordeste.entrySet();
        String estadoMaiorPopulacao = "";


        for (Map.Entry<String, Integer> entry : entradas) {
            if (entry.getValue().equals(maiorPopulacao)) {
                estadoMaiorPopulacao = entry.getKey();
            }
        }

        System.out.println("O estado com a maior população: " + estadoMaiorPopulacao + ": " + maiorPopulacao);

        //Soma dos estados
        Iterator<Integer> iterator = estadosNordeste.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma+= iterator.next();
        }

        System.out.println("Soma da população dos estados: " + soma);

        //Média da populção
        System.out.println("A média da população: " + soma/estadosNordeste.size());

        //Removendo estados menores que 4 milhões
        iterator = estadosNordeste.values().iterator();
        while (iterator.hasNext()){
            if(iterator.next()<4000000) {
                iterator.remove();
            }
        }
        System.out.println("Estados depois de remover os menores que 4.000.000: ");
        System.out.println(estadosNordeste);

        //Apagando o dicionário de estador
        estadosNordeste.clear();

        //Verificando se está vazio
        System.out.println("Verificando se o dicionário está vazio: " + estadosNordeste.isEmpty());

    }
}
