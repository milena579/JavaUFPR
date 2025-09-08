package T07.ExcecoesBike;


class Bicicleta {

    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;

    public Bicicleta(int marcha,  int velocidade, int cadencia) {
        this.cadencia = cadencia;
        this.marcha = marcha;
        this.velocidade = velocidade;
    }
    
    void aplicarFreios(int decremento){
        velocidade = velocidade - decremento;
    }
    void printStates(){
        System.out.println("cadencia = "+ cadencia+" velocidade = "+ velocidade+" marcha = "+marcha);
    }

    public void setCadencia(int cadencia) throws RPMInvalidoException {
        if (cadencia < 0) {
            throw new RPMInvalidoException(cadencia + " não é um valor RPM permitido");
        }
        this.cadencia = cadencia;
    }

    public void setVelocidade(int incrmento) throws VelocidadeInvalidaException {
        if (velocidade+incrmento < 0) {
            throw new VelocidadeInvalidaException(velocidade+incrmento + " não é válido");
        } else if (velocidade+incrmento > 100) {
            throw new VelocidadeInvalidaException(velocidade+incrmento + " é superior ao permitido");
        }
        
        this.velocidade = velocidade + incrmento;
    }

    public void setMarcha(int marcha) throws MarchaInvalidaException {
        if (marcha < 0) {
            throw new MarchaInvalidaException(marcha + " não é válido");
        } else if (marcha > 24) {
            throw new MarchaInvalidaException(marcha + " é superior ao número de marchas existentes");
        }
        this.marcha = marcha;
    }

}
