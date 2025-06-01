public class UsaSuperficie {
    public static void main(String[] args) {

        Circunferencia c = new Circunferencia(5.0);
        System.out.println("\nRaio: " + c.getRaio());
        System.out.println("Área: " + String.format("%.2f", c.area()));

        Quadrado q = new Quadrado(10.0);
        System.out.println("\nLado: " + q.getLado());
        System.out.println("Área: " + String.format("%.2f", q.area()));
    }
}