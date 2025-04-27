

//7 - Escreva um programa com os seguintes passos: 
//1) Peça ao usuário que informe quantos funcionários existem na empresa. 
//2) Instancie um array de strings e um array de doubles com o tamanho informado. 
//3) Peça ao usuário que informe o nome e o salário de cada funcionário e armazene o nome no array de strings e o salário no array de doubles. 
//4)Calcule a média salarial da empresa. 
//5) Imprima a lista de nomes/salários que estão acima da média salarial. 
//Obs.: Faça o tratamento das entradas de dados. Se o usuário informar um salário inválido, peça para ele informar novamente. 
//Imprima os salários com duas casas decimais. Os nomes devem conter ao menos 3 caracteres.

package T03;

import java.util.Scanner;

public class Empresa {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de funcionários da empresa: ");
        int qtd = s.nextInt();
        s.nextLine(); // Consumir a quebra de linha

        float[] salarios = new float[qtd];
        String[] funcionario = new String[qtd];
        float media = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String nome = s.nextLine();
            
            while (nome.length() < 3) {
                System.out.println("O nome deve ter no mínimo 3 caracteres!");
                System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
                nome = s.nextLine();
            }
           
            funcionario[i] = nome;

            System.out.print("Digite o salário do funcionário " + funcionario[i] + ": ");
            while (!s.hasNextFloat()) {
                System.out.println("Salário inválido! Digite um número válido.");
                s.next();
                System.out.print("Digite o salário do funcionário " + funcionario[i] + ": ");
            }
            float salario = s.nextFloat();
            while (salario <= 0) {
                System.out.println("O salário deve ser maior que 0!");
                System.out.print("Digite o salário do funcionário " + funcionario[i] + ": ");
                while (!s.hasNextFloat()) {
                    System.out.println("Salário inválido! Digite um número válido.");
                    s.next(); 
                    System.out.print("Digite o salário do funcionário " + funcionario[i] + ": ");
                }
                salario = s.nextFloat();
            }
            salarios[i] = salario;
            media += salario;
            s.nextLine(); 
        }

        media = media / funcionario.length;

        System.out.println("\nSalários acima da média salarial (R$ " + String.format("%.2f", media) + "):");
        for (int i = 0; i < funcionario.length; i++) {
            if (salarios[i] > media) {
                System.out.println("Funcionário: " + funcionario[i] + " com salário R$ " + String.format("%.2f", salarios[i]));
            }
        }
        
        s.close();
    }
}
