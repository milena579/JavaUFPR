public class CalculaArea {
    
    public static double calculaAreaRetangulo(double lado1, double lado2) {
        if (lado1 < 0 || lado2 < 0) {
            throw new RuntimeException("Valores negativos não são permitidos");
        }

        return lado1 * lado2;
    }
    
    public static double calculaAreaCircunferencia(double raio) {
        if (raio < 0) {
            throw new RuntimeException("Valores negativos não são permitidos");
        }

        return raio * 2;
    }
    
    public static double calculaAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new RuntimeException("Valores negativos não são permitidos");
        }

        return (base * altura) / 2;
    }
}
