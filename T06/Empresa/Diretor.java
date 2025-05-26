import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario {
    private List<Departamento> departamentos = new ArrayList();
    
    public Diretor(String nome, double salario){
        super(nome,"Diretor",salario);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public double getBonus() {
        double result = (this.getDepartamentos().size() * 3000) + (4 * this.getSalario()); 
        return result;
    }
}