import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class VelocidadeMedia {

    BigDecimal velocidadeBigDecimal(String dist, String temp){
        double distD = Double.parseDouble(dist);
        double tempD = Double.parseDouble(temp);

        BigDecimal distancia = new BigDecimal(distD).setScale(3, RoundingMode.HALF_UP);
        BigDecimal tempo = new BigDecimal(tempD).setScale(3, RoundingMode.HALF_UP);

        BigDecimal velocidade = distancia.divide(tempo, 3, RoundingMode.HALF_UP);

        return velocidade.setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String distancia;
        String tempo;

        System.out.print("Digite a distancia percorrida: ");
        distancia = s.nextLine();

        System.out.print("Digite o tempo gasto");
        tempo = s.nextLine();

        VelocidadeMedia vm = new VelocidadeMedia();

        BigDecimal velocidadeBD = vm.velocidadeBigDecimal(distancia, tempo);
        System.out.println("Velocidade média (BigDecimal) = " + velocidadeBD + " Km/h");

    }
}
