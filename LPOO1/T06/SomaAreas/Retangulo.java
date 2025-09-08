package T06.SomaAreas;

public class Retangulo implements Forma {
    private double base;
    private  double  altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }
}
