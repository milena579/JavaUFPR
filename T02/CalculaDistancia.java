package T02;
// Faça uma classe executável que dados a distância percorrida (em Km) e o tempo gasto em uma viagem (em horas), informe a velocidade 
// média do carro, sabendo que Velocidade = S / T (variação de distância variação do tempo). Imprima o valor com duas casas decimais. 

import java.util.Scanner;

public class CalculaDistancia {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em KM: ");
        float distancia = s.nextFloat(); 

        System.out.print("Tempo gasto em HORAS: ");
        int horas = s.nextInt(); 

        float variacao = distancia/horas;


        System.out.println("A velocidade média é: " + variacao);
    }
}
