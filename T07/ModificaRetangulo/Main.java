package T07.ModificaRetangulo;

public class Main {
    public static void main(String[] args) {
        try {
            Forma[] vetorFormas = new Forma[3];
            vetorFormas[1] = new Triangulo(3, 6);     
            vetorFormas[2] = new Circunferencia(2);   
            vetorFormas[0] = new Retangulo(-4, 5);     
            double total = SomandoAreas.Areas(vetorFormas);
            System.out.printf("A soma das áreas é: %.2f\n", total);
           
        } catch (IllegalArgumentException  e) {
            System.out.println("Erro ao criar retângulo: " + e.getMessage());

        }

    }
}

