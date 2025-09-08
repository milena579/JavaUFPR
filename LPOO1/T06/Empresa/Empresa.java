import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static void main(String[] args) {

        // Departamentos
        Departamento d1 = new Departamento("RH");
        Departamento d2 = new Departamento("TI");

        // Diretor
        Diretor diretor = new Diretor("Carlos", 20000);
        diretor.getDepartamentos().add(d1);
        diretor.getDepartamentos().add(d2);

        // Gerentes
        Gerente g1 = new Gerente("Fernanda", 12000);
        Gerente g2 = new Gerente("João", 11000);

        // Funcionários
        Analista a1 = new Analista("Ana", 8000);
        Programador p1 = new Programador("Ingrid", 7000);
        Programador p2 = new Programador("Milena", 7200);
        AuxiliarDeLimpeza aux1 = new AuxiliarDeLimpeza("José", 4000);

        // Vínculo com gerentes
        a1.setGerente(g1);
        p1.setGerente(g1);
        p2.setGerente(g2);
        aux1.setGerente(g2);

        // Lista geral
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(diretor);
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(a1);
        funcionarios.add(p1);
        funcionarios.add(p2);
        funcionarios.add(aux1);

        // Relatório
        String relatorio = SistemaRH.imprimeRelatorio(funcionarios);
        System.out.println(relatorio);
    }
}
