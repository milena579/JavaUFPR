import java.util.Scanner;

public class UsaFormas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdFormas;

        System.out.println("Digite a quantidade de formas que deseja adicionar: ");
        qtdFormas = scan.nextInt();

        for (int i = 0; i < qtdFormas; i++) {
            System.out.println("\nForma " + (i + 1) + ":");
            System.out.println("1 - Triângulo");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circunferência");
            int forma = scan.nextInt();

            switch (forma) {
                case 1:
                    System.out.println("Digite a base do triângulo: ");
                    double base = scan.nextDouble();
                    System.out.println("Digite a altura do triângulo: ");
                    double altura = scan.nextDouble();
                    Triangulo t = new Triangulo(base, altura);
                    System.out.println("Área do triângulo: " + t.calcularArea());
                    System.out.println("Perímetro do triângulo: " + t.calcularPerimetro());
                    break;

                case 2:
                    System.out.println("Digite a largura do retângulo: ");
                    double largura = scan.nextDouble();
                    System.out.println("Digite a altura do retângulo: ");
                    double altRet = scan.nextDouble();
                    Retangulo r = new Retangulo(largura, altRet);
                    System.out.println("Área do retângulo: " + r.calcularArea());
                    System.out.println("Perímetro do retângulo: " + r.calcularPerimetro());
                    break;

                case 3:
                    System.out.println("Digite o raio da circunferência: ");
                    double raio = scan.nextDouble();
                    Circunferencia c = new Circunferencia(raio);
                    System.out.println("Área da circunferência: " + c.calcularArea());
                    System.out.println("Perímetro (circunferência): " + c.calcularPerimetro());
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    i--; 
                    break;
            }
        }
        scan.close();
    }
}
