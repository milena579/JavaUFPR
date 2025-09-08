public class CalculaSalario {

    static double[] parametrosUsuario;
    
    public static boolean dadosUsuario (double salarioHora, double horasMes, double perINSS) {
        
        if( salarioHora < 0 || horasMes < 0 || horasMes > 744) {
            throw new RuntimeException("Valores inválidos.");
        }
        
        parametrosUsuario[0] = salarioHora;
        parametrosUsuario[1] = horasMes;
        parametrosUsuario[2] = perINSS;

        return true;
    }
    
    public static double calculaSalarioBruto (double salarioHora, double horasMes) {
        return salarioHora * horasMes;
    }

    public static double calculaSalarioLiquido (double salarioHora, double horasMes, double perINSS) {
        double reducoes = (salarioHora * horasMes) * perINSS;
        return (salarioHora * horasMes) -reducoes;
    }

    public static boolean imprimeExtrato () {
        
        double salarioBruto = calculaSalarioBruto(parametrosUsuario[0], parametrosUsuario[1]);
        double salarioLiquido = calculaSalarioLiquido(parametrosUsuario[0], parametrosUsuario[1], parametrosUsuario[2]);
        
        System.out.println("\nExtrato de salário ");
        System.out.println("Valor Hora: " + parametrosUsuario[0]);
        System.out.println("Horas trabalhadas: " + parametrosUsuario[1]);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);

        return true;
    }
    
}
