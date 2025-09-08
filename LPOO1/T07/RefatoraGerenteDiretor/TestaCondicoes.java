import java.util.ArrayList;
import java.util.List;

public class TestaCondicoes {
    public static void main(String[] args) {

        List<Funcionario> equipePequena = new ArrayList<>();
        equipePequena.add(new Analista("João", 3000));

        try {
            Gerente gerente = new Gerente("Carlos", 8000, equipePequena);
        } catch (CondicaoInvalidaException e) {
            System.out.println("Erro ao criar gerente: " + e.getMessage());
        }
       
        List<Departamento> poucosDepartamentos = new ArrayList<>();
        poucosDepartamentos.add(new Departamento("TI"));

        try {
            Diretor diretor = new Diretor("Fernanda", 15000, poucosDepartamentos);
        } catch (CondicaoInvalidaException e) {
            System.out.println("Erro ao criar diretor: " + e.getMessage());
        }

        List<Funcionario> equipeCompleta = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            equipeCompleta.add(new Programador("Funcionario" + i, 2500));
        }

        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(new Departamento("RH"));
        departamentos.add(new Departamento("Financeiro"));

        try {
            Gerente gerenteOk = new Gerente("Lucia", 9000, equipeCompleta);
            Diretor diretorOk = new Diretor("Roberto", 20000, departamentos);
            System.out.println("Gerente criado com sucesso: " + gerenteOk.getNome());
            System.out.println("Diretor criado com sucesso: " + diretorOk.getNome());
        } catch (CondicaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
