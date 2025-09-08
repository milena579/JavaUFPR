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
