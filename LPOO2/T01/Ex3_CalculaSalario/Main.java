import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CalculaSalario salario = new CalculaSalario();
        double salarioHora, horasMes, perINSS;

        System.out.println("\nPor favor, informe os seguintes dados: ");
        System.out.println("Valor do salário por hora: ");
        salarioHora = scan.nextDouble();
        System.out.println("Número de horas trabalhadas no mês: ");
        horasMes = scan.nextDouble();
        System.out.println("Percentual de desconto do INSS: ");
        perINSS = scan.nextDouble();

        salario.dadosUsuario(salarioHora, horasMes, perINSS);
        salario.imprimeExtrato();

    }
}
