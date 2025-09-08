package T07.ExcecoesBike;

public class UsaBicicleta {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta(1, 0, 0);

        try {
            bike.setVelocidade(120);
        } catch (VelocidadeInvalidaException e) {
            System.out.println("Erro de velocidade: " + e.getMessage());
        }

        try {
            bike.setCadencia(-10);
        } catch (RPMInvalidoException e) {
            System.out.println("Erro de RPM: " + e.getMessage());
        }

        try {
            bike.setMarcha(30);
        } catch (MarchaInvalidaException e) {
            System.out.println("Erro de marcha: " + e.getMessage());
        }

        bike.printStates();
    }
}
