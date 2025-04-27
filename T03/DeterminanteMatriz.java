package T03;

// 11 - Construa um programa que calcule o determinante de uma matriz 3 x 3 fornecida pelo usuário;

import java.util.Scanner;

public class DeterminanteMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[][] matriz = new Integer[3][3];

        System.out.println("Defina os valores da matriz: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("L" + (i+1) + " x C" + (j+1) + " >> ");
                matriz[i][j] = scan.nextInt();
            }
        }

        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[1][0];
        int e = matriz[1][1];
        int f = matriz[1][2];
        int g = matriz[2][0];
        int h = matriz[2][1];
        int i = matriz[2][2];

        int determinante = a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);

        System.out.println("\nMatriz:");
        for(int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        System.out.println("Determinante: " + determinante);
    }
}
