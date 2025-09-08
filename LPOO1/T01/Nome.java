import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.print("Escreva o nome: ");
        String nome = scanner.nextLine();
        
        String[] dividir = nome.split(" ");
        int tamanho = dividir.length;
        
        
        for(int i = tamanho - 1; i >= 0; i--){
            System.out.println(dividir[i]);
        }

    }
}