public class UsaCircunferencia {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.0);
        System.out.println("Raio: " + c1.getRaio());
        System.out.println("Área: " + c1.calcularArea());

        Circunferencia c2 = new Circunferencia(10.0);
        System.out.println("\nRaio: " + c2.getRaio());
        System.out.println("Área: " + c2.calcularArea());
    }
}
