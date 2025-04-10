import java.util.Scanner;

public class Locadora {
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        double valor;
        int quantidade;

        System.out.print("Digite a quantidade de DVDs: ");
        quantidade = s.nextInt();

        System.out.print("Digite o valor do aluguel: ");
        valor = s.nextDouble();

        calculoMulta(valor, quantidade);

        calculoFatura(quantidade, valor);
    }


    public static void calculoMulta(double aluguel, int quantidade){
        double mensal = (double)quantidade / 3;
        double multa = (mensal / 10) * (0.1f * aluguel);

        System.out.println("Valor ganho das multas por mês: R$" + String.format("%.2f", multa));
    }

    public static void calculoFatura(int quantidade, double aluguel){
        double mensal = quantidade / 3;
        double anual = (mensal * 12) * aluguel;

        System.out.println("Valor do faturamento anual eh: R$" + String.format("%.2f",anual));

    }
}