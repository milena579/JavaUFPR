public class AuxiliarDeLimpeza extends Funcionario {

    public AuxiliarDeLimpeza(String nome, double salario) {
        super(nome, "Auxiliar de Limpeza", salario);
    }

    @Override
    public double getBonus() {
        return 0.5 * this.getSalario();
    }
}
