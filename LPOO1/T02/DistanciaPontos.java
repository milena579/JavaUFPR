import java.util.Scanner;

// Construa um programa que leia do teclado dois pontos em um plano (x,y) e informe a distância entre eles.

public class DistanciaPontos {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Valores ponto A ");

        System.out.print("Xa: ");
        int xa = s.nextInt();

        System.out.print("Ya: ");
        int ya = s.nextInt();

        
        System.out.println("Valores ponto B ");
        
        System.out.print("Xb: ");
        int xb= s.nextInt();

        System.out.print("Yb: ");
        int yb = s.nextInt();

        double distancia = Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));

        System.out.printf("A distancia entre o ponto (%d,%d) e o ponto (%d,%d) eh : %.2f%n", xa, ya, xb, yb, distancia);
        
        s.close();
        
    }
}
