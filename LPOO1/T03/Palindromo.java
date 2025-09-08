package T03;

// 9 - Faça um programa que leia uma frase e informe se ela é um palíndromo ou não. Uma frase é um palíndromo quando pode ser lida tanto da forma usual, 
// quanto de trás para frente. O programa deve ignorar maiúsculas e minúsculas na avaliação. Insira as frases sem acentuação; 
// Dica: será necessário verificar os métodos disponíveis na classe String; 
// "Socorram-me, subi no ônibus em Marrocos” 
// "A Rita, sobre vovô, verbos atira." 
// "Olé! Maracujá, caju, caramelo." 

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;

        System.out.println("Insira uma frase: ");
        frase = scan.nextLine();

        String fraseInvertida = "";

		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInvertida = fraseInvertida + frase.charAt(i);
		}

        System.out.println("");

        String a = frase.replaceAll(" ", "");
        String b = fraseInvertida.replaceAll(" ", "");

        if(a.equalsIgnoreCase(b)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        System.out.println("Frase: " + frase.toLowerCase());
        System.out.println("Frase invertida: " + fraseInvertida.toLowerCase());
    }
}