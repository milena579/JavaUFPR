package T03;

import java.util.Scanner;

// 12 - Escreva um programa que calcule a soma das diagonais principal e secundária. O programa deve perguntar ao 
// usuário a dimensão da matriz. Baseado na dimensão da matriz o programa deve pedir ao usuário para preencher os 
// valores da matriz (faça um método estático que receba a referência de uma matriz e a preencha). Com a matriz 
// preenchida faça outro método estático que calcule a soma das diagonais. Imprima o resultado. 

public class somaDiagonais {
    public static void main(String[] args) {
        int linhas, colunas = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas:");
        linhas = s.nextInt();

        System.out.println("Digite a quantidade de colunas:");
        colunas = s.nextInt();


        Preencher(linhas, colunas);
    }


    public static void Preencher(int linhas, int colunas){
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite o valor da linha " + i + " coluna " + j);
                matriz[i][j] = s.nextInt();
            }
        }


        System.out.println("Matriz");
        System.out.print("[");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
            }   
        }
        System.out.print("]");


        System.out.println("Matriz principal");
        DiagonalPrincipal(matriz);

        System.out.println("Matriz secundaria");
        DiagonalSecundaria(matriz);
    }

    public static void DiagonalPrincipal(int[][] matriz){
        System.out.print("[");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]);
        }

        System.out.print("]");

    }

    public static void DiagonalSecundaria(int[][] matriz){
        int tamanho = matriz.length;

        System.out.println("[");
        for (int i = 0; i < matriz.length; i++) {
            int diagonal = tamanho - 1 - i;

            System.out.print(matriz[i][diagonal]);
        }
        System.out.println("]");

    }
}
