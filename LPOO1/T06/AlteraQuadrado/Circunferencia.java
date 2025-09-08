public class Circunferencia implements Superficie {
    public double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        double area = Math.PI * raio * raio;
        return area;
    }
}