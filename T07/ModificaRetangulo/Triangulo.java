package T07.ModificaRetangulo;

public class Triangulo  implements  Forma{
    private double base;
    private  double  altura;

    public Triangulo(double base, double altura){
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
        return (getBase() * getAltura()) / 2;
    }
}
