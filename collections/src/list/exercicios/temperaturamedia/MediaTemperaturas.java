package list.exercicios.temperaturamedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaTemperaturas {
    public static void main(String[] args) {

        //declarando lista
        List<Double> temperaturas = new ArrayList<Double>();

        //declarando Scanner
        Scanner leitura = new Scanner(System.in);

        Double somatorio = 0.0;
        for(int cont = 0;cont < 6; cont++){
            System.out.println("Digite a temperatura média do mês " + (cont+1) + ": ");
            Double temporaria = leitura.nextDouble();
            temperaturas.add(temporaria);
            somatorio += temporaria;
        }

        Double media = somatorio/temperaturas.size();
        System.out.println("A média semestral foi: " + media + " ºC");

        Integer verificador = 0;
        System.out.println("Temperaturas acimada média: ");
        for (Double temp: temperaturas) {
            if(temp > media){
                System.out.println(temp + " ºC");
                verificador++;
            }
        }

        if (verificador == 0) System.out.println("Não há temperatura acima da média!");

    }
}