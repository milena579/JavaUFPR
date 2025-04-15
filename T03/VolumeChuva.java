// Escreva um programa que leia do teclado 7 valores reais correspondentes ao índice pluviométrico diário de uma semana. Após a leitura, o programa deve determinar o
// índice pluviométrico médio, máximo e mínimo com o respectivo dia da ocorrência;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VolumeChuva{
    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);

        String[] dias = new String[]{"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        for(int i = 0; i < 7; i++){
            System.out.print("Volume pluviométrico " + dias[i] + ": ");
            temperaturas.add(s.nextDouble());
        }

        tempSemana(temperaturas, dias);

    }

    public static void tempSemana(List<Double> temp, String[] dias){
        double max = temp.get(0);
        double min = temp.get(0);
        double media = 0;

        int diaMax = 0;
        int diaMin = 0;


        for (int i = 0; i < temp.size(); i++) {
            double valor = temp.get(i);
            media += valor;

            if (valor > max) {
                max = valor;
                diaMax = i;
            }

            if (valor < min) {
                min = valor;
                diaMin = i;
            }
        }

        media = media / temp.size();

        System.out.println("\n--- Resultados ---");
        System.out.println("Média: " + media);
        System.out.println("Máximo: " + max + " (" + dias[diaMax] + ")");
        System.out.println("Mínimo: " + min + " (" + dias[diaMin] + ")");
    }
}
