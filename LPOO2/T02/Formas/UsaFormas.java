import java.util.Scanner;

public class UsaFormas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdFormas;

        System.out.println("Digite a quantidade de formas que deseja adicionar: ");
        qtdFormas = scan.nextInt();

        for(int i =0; i < qtdFormas; i++){
            System.out.println("Forma " + i+1 + ":");
            System.out.println("1 - Tringulo"); 
            System.out.println(" 2 - Retângulo");
            System.out.println(" 3 - Triangulo");
            int forma = scan.nextInt();

            switch (forma) {
                case 1:
                    
                    break;
                case 2:

                case 3:
                
                default:
                    break;
            }
        }
    }
}
