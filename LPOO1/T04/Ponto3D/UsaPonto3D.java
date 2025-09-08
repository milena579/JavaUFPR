public class UsaPonto3D {
    public static void main(String[] args) {
        Ponto3D ponto1 = new Ponto3D(1.0, 2.0, 3.0, "vermelho", 0.8);
        Ponto3D ponto2 = new Ponto3D(4.0, 6.0, 8.0, "azul", 0.5);

        double distancia = ponto1.calculaDistancia(ponto2);

        System.out.println("Distância entre os pontos: " + distancia);
    }
    
}
