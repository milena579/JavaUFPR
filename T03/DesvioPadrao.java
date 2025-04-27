package T03;

// 13 - Faça um programa que calcule o desvio padrão de um determinado 
// número de amostras. O número de amostras deve ser pedido ao usuário 
// no início do programa. Utilize array para armazenar as amostras. Os 
// valores das amostras devem ser digitadas pelo usuário, uma a uma, como números decimais.  

import java.util.Scanner;

public class DesvioPadrao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numAmostras = 0;

        System.out.println("\n---------Cálculo de Desvio Padrão---------");
        System.out.print("\nDigite a quantidade de amostras: ");
        numAmostras = scan.nextInt();

        Float[] amostras = new Float[numAmostras];
        Float desvioQuad = 0.0f;
        Float somaDesvio = 0.0f;
        Float soma = 0.0f;
        Float media = 0.0f;
        Float s = 0.0f;
        
        System.out.print("\nDigite os valores: \n");
        for(int i = 0; i < numAmostras; i++) {
            System.out.print(">> Amostra " + (i+1) + ": ");
            amostras[i] = scan.nextFloat();
            soma += amostras[i];
        }

        media = soma / numAmostras;

        for (int i = 0; i < numAmostras; i++) {
            desvioQuad = (float) Math.pow((amostras[i]-media), 2);
            somaDesvio += desvioQuad;
        }

        s = (float) Math.sqrt((somaDesvio / (numAmostras-1)));

        System.out.println("\nDesvio Padrão: " + String.format("%.2f", s));

    }
}
