package T06.Veiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos veículos deseja informar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        Veiculo[] veiculos = new Veiculo[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nInforme o tipo de veículo (1-Carro, 2-Trem, 3-Avião, 4-Barco): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Ano Fabricação: ");
            int anoFab = scanner.nextInt();

            System.out.print("Capacidade Passageiros: ");
            int capacidadePassageiros = scanner.nextInt();
            
            switch (tipo) {
                case 1: 
                    System.out.print("Número de rodas: ");
                    int rodasCarro = scanner.nextInt();
                    scanner.nextLine();

                    int qtdPortas = scanner.nextInt();
                    scanner.nextLine();

                    double motor = scanner.nextInt();
                    scanner.nextLine();

                    veiculos[i] = new Carro(marca, modelo, anoFab, capacidadePassageiros, rodasCarro, qtdPortas, motor);
                    break;

                case 2: 
                    System.out.print("Número de rodas: ");
                    int rodaTrem = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Qtd de vagões: ");
                    int qtdVagoes = scanner.nextInt();
                    scanner.nextLine();

                    veiculos[i] = new Trem(marca, modelo, anoFab, capacidadePassageiros, rodaTrem, qtdVagoes);
                    break;

                case 3: 
                    System.out.print("Numero de turbinas: ");
                    int turbinas = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Altitude Máxima: ");
                    double altMax = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Denominação: ");
                    String denominacao = scanner.next();
                    scanner.next();

                    veiculos[i] = new Aviao(marca, modelo, anoFab, capacidadePassageiros, turbinas, altMax, denominacao);
                    break;

                case 4: // Barco
                    System.out.print("Comprimento: ");
                    int comprimentoBarco = scanner.nextInt();

                    System.out.print("Qtd de velas: ");
                    int velas = scanner.nextInt();

                    veiculos[i] = new Barco(marca, modelo, anoFab, capacidadePassageiros, comprimentoBarco, velas);
                    break;

                default:
                    System.out.println("Tipo inválido! Recomeçando este veículo.");
                    i--;
                    break;
            }
        }

        System.out.println("\n--- Executando método andar() dos veículos ---");
        for (Veiculo v : veiculos) {
            System.out.print(v.getClass().getSimpleName() + ": ");
            v.andar();
        }

        scanner.close();
    }
}

