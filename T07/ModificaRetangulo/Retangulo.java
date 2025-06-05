package T07.ModificaRetangulo;

// Modifique a classe Retangulo, para que uma exceção
// IllegalArgumentException seja lançada se os lados informados forem negativos. Adapte
// adequadamente o programa principal, para que a exceção seja capturada.

public class Retangulo implements Forma {
    private double base;
    private  double  altura;

    public Retangulo(double base, double altura){
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("Base e altura devem ser não-negativas.");
        }

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
