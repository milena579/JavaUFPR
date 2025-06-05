import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario {
    private List<Departamento> departamentos;
    
    public Diretor(String nome, double salario, List<Departamento> departamentos) throws CondicaoInvalidaException {
        super(nome, "Diretor", salario);

        if (departamentos == null || departamentos.size() < 2) {
            throw new CondicaoInvalidaException("O diretor deve ter no mínimo 2 departamentos.");
        }
        this.departamentos = new ArrayList<>(departamentos);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) throws CondicaoInvalidaException {
        if (departamentos == null || departamentos.size() < 2) {
            throw new CondicaoInvalidaException("O diretor deve ter no mínimo 2 departamentos.");
        }
        this.departamentos = new ArrayList<>(departamentos);
    }

    @Override
    public double getBonus() {
        double result = (this.getDepartamentos().size() * 3000) + (4 * this.getSalario());
        return result;
    }
}
