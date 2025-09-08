import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
    		System.out.print("Calculadora Java: ");
    		String input = s.nextLine();
    
    		String[] partes = input.split(" ");
    
    
            float num1 = Float.parseFloat(partes[0]);
            float num2 = Float.parseFloat(partes[1]);
            String op = partes[2];
    
            float total = 0;
            
            
            switch(op) {
                case "+":
                    total = num1 + num2;
                    break;
                    
                case "-":
                    total = num1 - num2;
                    break;
                    
                case "x":
                    total = num1 * num2;
                    break;
                    
                case "/":
                    if (num2 != 0) {
                        total = num1 / num2;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }
                    break;
                    
                default:
                    System.out.println("Operação inválida");
                    return;
            }
            
            System.out.println("Resultado: " + total);
        }
    }
}
