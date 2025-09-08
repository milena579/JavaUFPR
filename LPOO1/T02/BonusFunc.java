import java.util.Scanner;

public class BonusFunc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cargo;
        double salarioAtual;
        double salarioNovo = 0.0;
        String funcao = "";

        System.out.println("-----------------------------");
        System.out.println("1 - Diretor");
        System.out.println("2 - Gerente");
        System.out.println("3 - Analista");
        System.out.println("4 - Programador");
        System.out.println("5 - Auxiliar de Limpeza");
        System.out.println("-----------------------------");

        System.out.print("Digite o número do cargo do funcionário: ");
        cargo = s.nextInt();

        System.out.print("Digite o salário atual do funcionário: ");
        salarioAtual = s.nextDouble();

        switch (cargo) {
            case 1:
                System.out.print("Digite a quantidade de departamentos gerenciados: ");
                int dep = s.nextInt();
                salarioNovo = 4 * salarioAtual + 3000 * dep;
                funcao = "Diretor";
                break;
            case 2:
                System.out.print("Digite a quantidade de pessoas gerenciadas: ");
                int func = s.nextInt();
                salarioNovo = 2 * salarioAtual + 100 * func;
                funcao = "Gerente";
                break;
            case 3:
                salarioNovo = salarioAtual * 1;
                funcao = "Analista";
                break;
            case 4:
                salarioNovo = salarioAtual * 0.8;
                funcao = "Programador";
                break;
            case 5:
                salarioNovo = salarioAtual * 0.5;
                funcao = "Auxiliar de Limpeza";
                break;
            default:
                System.out.println("Cargo inválido. Encerrando o programa.");
                return;
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Funcionário: " + funcao);
        System.out.printf("Salário antigo: R$%.2f\n", salarioAtual);
        System.out.printf("Salário com bônus: R$%.2f\n", salarioNovo);
    }
}
