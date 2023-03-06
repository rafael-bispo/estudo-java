package map.exemplos;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println("Dicionário de carros populares: ");

        System.out.println(carrosPopulares.toString());

        System.out.println("Substituindo o consumo do gol por 15,2 km/l: ");

        carrosPopulares.put("Gol", 15.2);

        System.out.println(carrosPopulares);

        System.out.println("Verificando se existe uma determinada chave, no caso 'polo': " + carrosPopulares.containsKey("polo"));

        Set<String> modelos = carrosPopulares.keySet();

        Collection<Double> consumos = carrosPopulares.values();

        System.out.println("Exibindo modelos (Set), e consumos (Collection): ");
        System.out.println(modelos);
        System.out.println(consumos);

        //Obtendo maior valor

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";


        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
            }
        }

        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente);
        System.out.println("Km/l: " + consumoMaisEficiente);

        //Obtendo menor valor

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entradas = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";


        for (Map.Entry<String, Double> entry : entradas) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
            }
        }

        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente);
        System.out.println("Km/l: " + consumoMenosEficiente);
        System.out.println();


        //Exibindo a soma dos consumos:
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("O somatório dos consumos é: "+soma);

        System.out.println("A média dos consumos é: "+soma/carrosPopulares.size());

        //Removendo consumo = 15.6
        //Ésempre necessário reinicializar o iterator antes de usar de novo
        iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(15.6)){
                iterator.remove();
            }
        }

        System.out.println("Depois de romover os valores com 15.6: ");
        System.out.println(carrosPopulares);

        //Exibindo na ordem que foi inserido via lInked HashMap
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        //Exibindo ordenado pelo modelo, no caso, a chave
        Map<String, Double> carrosPopulares2 = new TreeMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        //Apagando o dicionário de carros
        carrosPopulares2.clear();
        System.out.println("O dicionário de carros está vazio?: "+carrosPopulares2.isEmpty());
    }
}