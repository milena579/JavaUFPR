package T06.SomaAreas;

public class Circunferencia implements Forma {
    private double raio;

    public Circunferencia(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * 2;
    }
}
