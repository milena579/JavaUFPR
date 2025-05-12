
import java.util.Scanner;

// Implemente uma classe contendo apenas métodos estáticos
// capazes de realizar todas as conversões de temperatura possíveis entre as
// unidades Celsius, Farenheit e Kelvin. São conhecidas as seguintes
// relações de conversão: F = 9*C/5 + 32 e K = C + 273. Demonstre a
// utilização do objeto. Utilize, neste programa, uma estrutura de controle
// switch para identificar a conversão solicitada pelo usuário;

public class ConverteTemperatura{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha qual será a conversão");
        System.out.println("1 - Farenheit para Celcius");
        System.out.println("2 - Farenheit para Kelvin");
        System.out.println("3 - Celcius para Farenheit");
        System.out.println("4 - Celcius para Kelvin");
        System.out.println("5 - Kelvin para Farenheit");
        System.out.println("6 - Kelvin para Celcius");
        System.out.print("Digite o numero da conversao que deseja: ");
        int op = s.nextInt();

        double temp;
        
        switch (op) {
            case 1:
                System.out.println("Farenheit para Celcius");
                System.out.print("Digite o valor da temperatura em Farenheit: ");
                temp = s.nextDouble();
                ferenheitCelcius(temp);
                break;
            case 2:
                System.out.println("Farenheit para Kelvin");
                System.out.print("Digite o valor da temperatura em Farenheit: ");
                temp = s.nextDouble();
                ferenheitCelcius(temp);
                break;
            case 3:
                System.out.println(" Celcius para Farenheit ");
                System.out.print("Digite o valor da temperatura em Celcius: ");
                temp = s.nextDouble();
                celciusFerenheit(temp);
                break;
            case 4:
                System.out.println("Celcius para Kelvin");
                System.out.print("Digite o valor da temperatura em Celcius: ");
                temp = s.nextDouble();
                celciusKelvin(temp);
                break;
            case 5:
                System.out.println("Kelvin para Farenheit ");
                System.out.print("Digite o valor da temperatura em Kelvin: ");
                temp = s.nextDouble();
                kelvinFarenheit(temp);
                break;
            case 6:
                System.out.println("Kelvin para Celcius");
                System.out.print("Digite o valor da temperatura em Kelvin: ");
                temp = s.nextDouble();
                kelvinCelcius(temp);
                break;
            
            default:
                throw new AssertionError();
        }

    }

    public static void ferenheitCelcius(double temperatura){
        double C = (temperatura - 32) * (5/9);

        System.out.println("A conversão é: " + C + "°C");
    }

    public static void ferenheitKelvin(double temperatura){
        double K = (temperatura - 32) / 1.8 + 273.15;

        System.out.println("A conversão é: " + K + "°K");
    }

    public static void celciusFerenheit(double temperatura){
        double F = 9 * (temperatura / 5.0) + 32;

        System.out.println("A conversão é: " + F + "°F");
    }

    public static void celciusKelvin(double temperatura){
        double K = temperatura + 273;

        System.out.println("A conversão é: " + K + "°K");
    }

    public static void kelvinFarenheit(double temperatura){
        double F= (9/5 * (temperatura - 273 + 32));

        System.out.println("A conversão é: " + F + "°F");

    }

    public static void kelvinCelcius(double temperatura){
        double C = temperatura - 273.15;

        System.out.println("A conversão é: " + C + "°C");

    }
}
