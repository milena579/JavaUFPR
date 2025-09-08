import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> equipe = new ArrayList();
    
    public Gerente(String nome, double salario){
        super(nome,"Gerente",salario);
    }

    public List<Funcionario> getEquipe() {
        return equipe;
    }

    @Override
    public double getBonus() {
        double result = (this.getEquipe().size() * 100) + (2 * this.getSalario()); 
        return result;
    }
}