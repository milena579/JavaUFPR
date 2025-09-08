// 5. Crie uma classe com um método main, que receba do usuário valores de
// entrada (utilize a classe Scanner) e retorne a soma e a média destes valores. Por meio
// de tratamento de exceção, o programa deve pedir ao usuário que repita a digitação,
// quando o valor digitado não for um numérico válido. O usuário também tem a opção de
// sair do programa digitando a letra “S” ou “s” no lugar de um número. Abaixo está um
// exemplo de saída para este programa:


import java.util.Scanner;
import java.util.ArrayList;

public class ValidaEntrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> entradas = new ArrayList<>(); 
        int soma = 0;
        int count = 0;

        System.out.println("\nInforme os números na sequência solicitada. Para sair digite 'S'.");
        
        while (true) {
            System.out.print("\nNúmero " + (count + 1) + ": ");
            
            String input = scan.nextLine();
            
            if (input.equalsIgnoreCase("S")) {
                break;
            }

            try {
                int valor = Integer.parseInt(input);
                entradas.add(valor);
                soma += valor;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Erro de entrada. O valor '" + input + "' não é um número válido. \nTente novamente ou digite 'S' para sair.");
            }
        }

        double media = (count > 0) ? (double) soma / count : 0;

        System.out.println("\nSoma dos valores de entrada: " + soma);
        System.out.println("Média dos valores de entrada: " + media);
        
        scan.close();
    }
}

