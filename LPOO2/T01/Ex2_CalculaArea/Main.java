import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalculaArea area = new CalculaArea();
        Integer op;
        Double resultado, lado1, lado2, base, altura, raio;

        System.out.println("\n1 - Área do Retângulo");
        System.out.println("2 - Área da Circunferência");
        System.out.println("3 - Área do Triângulo");

        System.out.print("\nDigite a área que será calculada: ");
        op = scan.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("\nLado 1: ");
                lado1 = scan.nextDouble();
                System.out.println("\nLado 2: ");
                lado2 = scan.nextDouble();
                resultado = area.calculaAreaRetangulo(lado1, lado2);
                break;
            case 2:
                System.out.println("\nRaio: ");
                raio = scan.nextDouble();
                resultado = area.calculaAreaCircunferencia(raio);
                break;
            case 3:
                System.out.println("\nBase: ");
                base = scan.nextDouble();
                System.out.println("\nAltura: ");
                altura = scan.nextDouble();
                resultado = area.calculaAreaTriangulo(base, altura);
                break;
            default:
                throw new AssertionError();
        }

        System.out.println("\nÁrea calculada: " + resultado);
    }
}
