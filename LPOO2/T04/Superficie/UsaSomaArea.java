public class UsaSomaArea {
 public static void main(String[] args) {
    QuadradoG quad[] = {new QuadradoG(2.0), new QuadradoG(5.0)};
    CircunferenciaG circ[] = {new CircunferenciaG(3.0), new 
    CircunferenciaG(2.0)};

    Superficie superf[] = new Superficie[quad.length + circ.length];
    superf[0] = quad[0];
    superf[1] = quad[1];
    superf[2] = circ[0];
    superf[3] = circ[1];

    SomaAreas soma = new SomaAreas();

    System.out.println("Area dos quadradados = " + soma.calculaArea(quad));
    System.out.println("Area das circunferencias = " + soma.calculaArea(circ));
    System.out.println("Soma de todas as áreas = " + soma.calculaArea(superf));
 }
}
