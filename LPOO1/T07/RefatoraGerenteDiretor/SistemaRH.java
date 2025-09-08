import java.util.List;

public class SistemaRH {
    public static String imprimeRelatorio(List<Funcionario> lista) {

        if(lista.size() == 0){
            return "Nenhum funcionário encontrado.";
        }    

        String retorno = "Nome (Cargo) - Salario | Bônus";
        for(Funcionario f:lista){
            retorno += "\n"+ f.getNome() + " (" + f.getCargo() + ") - R$ " + String.format("%.0f", f.getSalario()) + " | Bônus: " + String.format("%.0f", f.getBonus());;
        }
        return retorno;
    } 
}
