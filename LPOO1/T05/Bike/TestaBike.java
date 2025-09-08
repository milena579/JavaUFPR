package T05.Bike;

public class TestaBike {

    public static void main(String[] args) {
        Bicicleta minhaBike = new Bicicleta(21);

        System.out.println("Bicicleta criada. Estado inicial:");
        minhaBike.imprimeEstado();

        System.out.println("\nPedalando...");
        minhaBike.pedalar(10, 0.5);
        minhaBike.imprimeEstado();

        System.out.println("\nMudando de marcha...");
        minhaBike.mudarMarcha(3);
        minhaBike.imprimeEstado();

        System.out.println("\nPedalando mais forte...");
        minhaBike.pedalar(20, 0.8);
        minhaBike.imprimeEstado();

        System.out.println("\nTentando mudar para marcha inválida...");
        minhaBike.mudarMarcha(30); 
        minhaBike.imprimeEstado(); 

        System.out.println("\nFreando...");
        minhaBike.frear(0.3); 
        minhaBike.imprimeEstado();

        System.out.println("\nFreando forte...");
        minhaBike.frear(0.9); 
        minhaBike.imprimeEstado();
    }
}
