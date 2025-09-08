package T03;

//2 - Construa um programa que seja capaz de efetuar a média de todos os argumentos inteiros ou reais recebidos do teclado e 
//imprimi-los. Argumentos inválidos devem ser desconsiderados (Imprimir uma mensagem para cada valor inválido.), sem provocar
//a exibição de exceções (Exiba uma mensagem para o usuário pedindo a ele que informe novamente o valor). O usuário deve 
//digitar S quando desejar encerrar a entrada de dados;

import java.util.Scanner;

public class ValidarArgumento {
    public static void main(String[] args) {
        double soma = 0;   
        double media = 0;   
        int count = 0;    
        double num;
        String input;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro ou real (ou 'S' para encerrar): ");
            input = scan.nextLine();  

            if (input.equalsIgnoreCase("S")) {  
                break; 
            }

            try {
                num = Double.parseDouble(input);
                soma += num;  
                count++;        
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro ou real.");
            }
        }

        if (count > 0) {
            media = soma / count;
            System.out.println("\nMédia dos argumentos: " + media);
        } else {
            System.out.println("\nNenhum número válido foi inserido.");
        }
    }
}