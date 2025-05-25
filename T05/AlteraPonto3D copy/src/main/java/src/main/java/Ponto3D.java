package src.main.java;

// 3. (Tarefa 5) Altere o código da classe Ponto 3D para que os métodos tenham
// o modificador public, protected e private.
// a. Para cada uma das alterações tente compilar e rodar.
// b. Em algum dos casos ocorreu erro de compilação ou execução? Quais e
// porque?

public class Ponto3D {
    
    public double x;
    public double y;
    public double z;
    public String cor;
    public double intensidade;

    public Ponto3D(double x, double y, double z, String cor, double intensidade) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.cor = cor;
        this.intensidade = intensidade;
    }

    public double calculaDistancia(Ponto3D p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        double dz = this.z - p.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }
}