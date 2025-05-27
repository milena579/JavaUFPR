package T06.SomaAreas;

public class Main {
    public static void main(String[] args) {
        Forma[] vetorFormas = new Forma[3];

        vetorFormas[0] = new Retangulo(4, 5);     // área = 20
        vetorFormas[1] = new Triangulo(3, 6);     // área = 9
        vetorFormas[2] = new Circunferencia(2);   // área ≈ 12.566

        double total = SomandoAreas.Areas(vetorFormas);

        System.out.printf("A soma das áreas é: %.2f\n", total);
    }
}

