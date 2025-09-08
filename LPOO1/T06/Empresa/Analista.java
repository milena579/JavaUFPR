public class Analista extends Funcionario {
    
    public Analista(String nome, double salario){
        super(nome,"Analista",salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario();
    }
}