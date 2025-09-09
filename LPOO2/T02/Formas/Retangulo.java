public class Retangulo implements ValorNegativoException{
    public double lado1;
    public double altulado2ra;

    public Retangulo (double lado1, double lado2){
        if(lado1 < 0){
            throw new ValorNegativoException("A base não pode ser negativa");
        }
        else if(lado2 < 0){
            throw new ValorNegativoException("A altura não pode ser negativa");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double area(double lado1, double lado2){
        double area =  lado1 * lado2;

        return area;
    }

    public double perimetro(double lado1, double lado2){
        double perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

}
