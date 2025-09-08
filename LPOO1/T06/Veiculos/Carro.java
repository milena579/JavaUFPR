package T06.Veiculos;

public class Carro extends  VeiculoTerrestre {
    private int qtdPortas;
    private double motor;

    public Carro(String marca, String modelo, int anoFabricacao, int capacidadePassageiros, int numeroRodas, int qtdPortas, double motor) {
        super(marca, modelo, anoFabricacao, capacidadePassageiros, numeroRodas);
        this.qtdPortas = qtdPortas;
        this.motor = motor;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public double getMotor() {
        return motor;
    }

    @Override
    public void andar() {
        System.out.println("-> O carro '" + super.getModelo() + "' está acelerando na estrada com seu motor " + getMotor() + ".");
    }
    
    
}
