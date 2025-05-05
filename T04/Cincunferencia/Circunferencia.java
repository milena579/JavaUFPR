/* 9. (Tarefa 4) Crie uma classe Circunferencia, que armazene o valor do raio e 
seja capaz de informar sua área. Crie uma classe UsaCircunferencia para 
testar objetos da classe Circunferencia.
*/

public class Circunferencia {
    public double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double area(double raio) {
        double area = Math.PI * raio * raio;
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
