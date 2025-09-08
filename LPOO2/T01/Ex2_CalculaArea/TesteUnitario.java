import LPOO2.T01.Ex3_CalculaSalario.CalculaSalario;

public class TesteUnitario {

    public static void main(String[] args){
        CalculaArea area = new CalculaArea();
    }

    @Test
    public void testeCalculaAreaRetangulo() {
        CalculaArea area = new CalculaArea();
        double areaEsperada1 = area.calculaAreaRetangulo(3, 3);
        assertEquals(9.0, areaEsperada1, 0.0);
        double areaEsperada2 = area.calculaAreaRetangulo(15, 10);
        assertEquals(150.0, areaEsperada2, 0.0);
    }

    @Test
    public void testeCalculaAreaCircunferencia() {
        CalculaArea area = new CalculaArea();
        double areaEsperada1 = area.calculaAreaCircunferencia(6);
        assertEquals(12.0, areaEsperada1, 0.0);
        double areaEsperada2 = area.calculaAreaCircunferencia(20);
        assertEquals(40.0, areaEsperada2, 0.0);
    }

    @Test
    public void testeCalculaAreaTriangulo() {
        CalculaArea area = new CalculaArea();
        double areaEsperada1 = area.calculaAreaTriangulo(5, 2);
        assertEquals(5.0, areaEsperada1, 0.0);
        double areaEsperada2 = area.calculaAreaTriangulo(9, 10);
        assertEquals(45.0, areaEsperada2, 0.0);
    }
}
