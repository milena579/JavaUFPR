import java.util.Scanner;

public class TesteUnitario {
    public static void main(String[] args){
        CalculaSalario salario = new CalculaSalario();
    }

    @Test
    public void testeInsereDados() {
        CalculaSalario salario = new CalculaSalario();

        boolean dadosEsperados1 = salario.dadosUsuario(9.5, 90.0, 5.5);
        assertEquals(dadosEsperados1, true);
        boolean dadosEsperados2 = salario.dadosUsuario(9.5, 900.0, 5.5);
        assertEquals(dadosEsperados2, false);
        boolean dadosEsperados3 = salario.dadosUsuario(-2.5, 90.0, 5.5);
        assertEquals(dadosEsperados3, false);
    }

    @Test
    public void testeCalculaSalarioBruto() {
        CalculaSalario salario = new CalculaSalario();

        double salarioEsperado1 = salario.calculaSalarioBruto(9.5, 90.0);
        assertEquals(9.0, salarioEsperado1, 0.0);
        double salarioEsperado2 = salario.calculaSalarioBruto(9.5, 90.0);
        assertEquals(9.0, salarioEsperado2, 0.0);
    }

    @Test
    public void testeCalculaSalarioLiquido() {
        CalculaSalario salario = new CalculaSalario();

        double salarioEsperado1 = salario.calculaSalarioLiquido(9.5, 90.0, 5.5);
        assertEquals(9.0, salarioEsperado1, 0.0);
        double salarioEsperado2 = salario.calculaSalarioLiquido(9.5, 90.0, 32.0);
        assertEquals(9.0, salarioEsperado2, 0.0);
    }

    @Test
    public void testeImprimeExtrato() {
        CalculaSalario salario = new CalculaSalario();




    }
}
