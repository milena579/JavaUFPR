import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import src.main.java.Ponto3D;

public class UsaPonto3D {

    @Test
    public void testCalculoDistancia() {
        Ponto3D ponto1 = new Ponto3D(1.0, 2.0, 3.0, "vermelho", 0.8);
        Ponto3D ponto2 = new Ponto3D(4.0, 6.0, 8.0, "azul", 0.5);

        double distanciaEsperada = Math.sqrt(9 + 16 + 25);
        double distanciaCalculada = ponto1.calculaDistancia(ponto2);
        assertEquals(distanciaEsperada, distanciaCalculada, 0.0001);
    }

    @Test
    public void testGettersSetters() {
        Ponto3D ponto = new Ponto3D(0.0, 0.0, 0.0, "branco", 1.0);

        ponto.setX(10.0);
        ponto.setY(20.0);
        ponto.setZ(30.0);
        ponto.setCor("verde");
        ponto.setIntensidade(0.75);

        assertEquals(10.0, ponto.getX());
        assertEquals(20.0, ponto.getY());
        assertEquals(30.0, ponto.getZ());
        assertEquals("verde", ponto.getCor());
        assertEquals(0.75, ponto.getIntensidade());
    }
}
