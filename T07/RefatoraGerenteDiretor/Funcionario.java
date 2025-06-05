// 3. Crie e implemente uma hierarquia de classes para a classe Funcionario. 
// Imagine que Funcionario represente uma classe em um sistema de uma Empresa. Crie 
// classes para herdar de funcionário (Gerente, Diretor e Analista). O gerente deve conter 
// um array de Funcionarios e o Diretor deve conter um array de Departamentos. 
// Implemente um método abstrado na classe Funcionario chamado getBonus. O cálculo do 
// bônus anual segue as seguintes regras. Implemente estas regras utilizando conceitos de polimorfismo: 
// a. Para Diretor: 4 salários + R$3000,00 por departamento gerenciado 
// b. Para Gerente: 2 salários + R$100,00 por pessoa gerenciada 
// c. Analista: 1 salário 
// d. Programador: 0,8 salário 
// e. Auxiliar de Limpeza: 0,5 salário 
// Crie uma classe chamada SistemaRH que instancie os objetos e imprima um relatório 
// com os funcionários da empresa. A classe SistemaRH deve ter um método estático para 
// imprimir o relatório: public static void imprimeRelatorio(Funcionario[] listaFuncionarios) 

abstract public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private Gerente gerente;

    public Funcionario(String nome, String cargo, double salario) {
        super(nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
        gerente.getEquipe().add(this);
    }

    abstract public double getBonus();
}
