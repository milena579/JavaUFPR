public class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, "Programador", salario);
    }

    @Override
    public double getBonus() {
        return 0.8 * this.getSalario();
    }
}
