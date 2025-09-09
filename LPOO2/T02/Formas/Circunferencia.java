public class Circunferencia implements ValorNegativoException{
    public double raio;

    public Circunferencia(double raio){
        if(raio < 0){
            throw new ValorNegativoException("O valor do raio não pode ser negativo");
        }
        this.raio = raio;
    }

    public double area(double raio){
        double area = Math.PI * raio * raio;
        return area;
    }
}