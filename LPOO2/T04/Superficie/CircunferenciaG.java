public class CircunferenciaG implements Superficie {
    private double raio;

    public CircunferenciaG(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
