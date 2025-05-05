import java.util.Scanner;

public class UsaPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        pessoa.fazAniversario();
        pessoa.fazAniversario(); 

        System.out.println("\nDados da pessoa após aniversários:");
        pessoa.imprime();
    }
}
