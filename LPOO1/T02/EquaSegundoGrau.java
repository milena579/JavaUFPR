import java.util.Scanner;

// Construa um programa que leia os coeficientes de uma equação do segundo grau do teclado e mostre os valores de x da equação; 
// a. Verifique na documentação Java as operações matemáticas da classe Math; 
// b. Não é necessário validar tipos de raízes; 
// c. Dados para teste: 
// x2 – 9 = 0  Resultado: x = 3 e x = -3 ;
// x2 -9x = 0  Resultado: x = 0 e x = 9 ;
// 3x2 -7x + 2 = 0  Resultado: x = 1/3 e x = 2; 
// -x2 + 4x – 4 =0  Resultado: x = 2 e x = 2 ;

public class EquaSegundoGrau {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = s.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = s.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = s.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("As raízes da equação são: x1 = %.2f e x2 = %.2f%n", x1, x2);
        }

        else {
            System.out.println("A equação não possui raízes reais.");
        }

        s.close();

    }
}
