// Modifique a classe Bicicleta para encapsular seus atributos como
// privados, crie os métodos de acesso a estes atributos e crie dois
// construtores para ela:
// a. Um construtor que recebe como parâmetro o número máximo de marchas
// da bicicleta (crie um atributo privado para armazenar este valor)
// b. Um construtor padrão (sem argumentos) que inicie o número máximo de
// marchas como 18.
// c. Ambos os construtores devem criar uma bicicleta parada.
// d. Os métodos que mudam a marcha devem avaliar se o número máximo de
// marchas foi alcançado e não permitir a mudança nestes casos. 

package T05;

public class Bicicleta {
    private double velocidade;
    private int marcha;
    private int maxMarchas;

    public Bicicleta(int maxMarchas){
        this.maxMarchas = maxMarchas;
        this.marcha = 1;
        this.velocidade = 0;
    }

    public Bicicleta(){
        this.maxMarchas = 18;
        this.marcha = 1;
        this.velocidade = 0;
    }

    public double getVelocidade() {
        return velocidade;
    }
    
    public int getMarcha() {
        return marcha;
    }
    
    public int getMaxMarchas() {
        return maxMarchas;
    }
    

    public void mudarMarcha(int novoValor){
        if(novoValor > maxMarchas || novoValor < 1){
            System.out.println("Marcha inválida! Deve estar entre 1 e " + maxMarchas);
        } else {
            marcha = novoValor;
        }
    }

    public void pedalar(int pedalada, double forca){
        velocidade = velocidade + pedalada * forca;
    }

    public void frear(double forca){
        velocidade = velocidade - forca * velocidade;
    }

    public void imprimeEstado(){
        System.out.println(
            "velocidade=" + velocidade +
            " marcha=" + marcha);
    }
}
