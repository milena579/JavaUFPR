import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> equipe;
    
    public Gerente(String nome, double salario, List<Funcionario> equipe) throws CondicaoInvalidaException {
        super(nome,"Gerente",salario);
        if (equipe == null || equipe.size() < 5) {
            throw new CondicaoInvalidaException("A equipe do gerente deve ter no mínimo 5 funcionários.");
        }
        this.equipe = new ArrayList<>(equipe);
    }

    public List<Funcionario> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Funcionario> equipe) throws CondicaoInvalidaException {
        if (equipe == null || equipe.size() < 5) {
            throw new CondicaoInvalidaException("A equipe do gerente deve ter no mínimo 5 funcionários.");
        }
        this.equipe = new ArrayList<>(equipe);
    }

    @Override
    public double getBonus() {
        double result = (this.getEquipe().size() * 100) + (2 * this.getSalario()); 
        return result;
    }
}