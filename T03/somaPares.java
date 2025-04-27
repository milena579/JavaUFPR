package T03;

//3 - Faça uma classe executável que dado um conjunto de 20 elementos numéricos, informe a soma de todos os números pares. 
//Faça a validação de dados inválidos informando o usuário, e fazendo-o repetir a digitação.

import java.util.Scanner;

public class somaPares {
    public static void main(String[] args) {
        int soma = 0;
        Integer[] elementos = new Integer[20];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            while (true) { 
                System.out.print("Elemento " + (i + 1) + ": ");
                try {
                    elementos[i] = scan.nextInt();

                    if (elementos[i] % 2 == 0) {
                        soma += elementos[i]; 
                    }
                    break; 
                } catch (Exception e) {
                    System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                    scan.nextLine(); 
                }
            }
        }

        System.out.println("\nSoma dos números pares: " + soma);
    }
}
