public class Triangulo implements ValorNegativoException{
    public double base;
    public double altura;

    public Triangulo(double base, double altura){
        if(base < 0){
            throw new ValorNegativoException("A base não pode ser negativa");
        }
        else if(altura < 0){
            throw new ValorNegativoException("A altura não pode ser negativa");
        }

        this.base = base;
        this.altura = altura;
    }

    public double area(double base, double altura){
        double area = (base * altura) / 2;
    }

}