public class UsaBicicleta {
    public static void main(String[] args) {
        Bicicleta minhaBike = new Bicicleta(){

            @Override
            void aplicarFreios(int decremento) {
                velocidade = velocidade - 2 * decremento;

            }
        };

        minhaBike.aumentarVelocidade(20);
        minhaBike.printStates();  

        minhaBike.aplicarFreios(5);
        minhaBike.printStates();  

        minhaBike.mudarMarcha(3);
        minhaBike.printStates();
    }
}
