package T06.Veiculos;

public abstract class VeiculoAereo extends Veiculo {

    private int numeroTurbinas;
    private double altitudeMaxima;
    
    public VeiculoAereo(String marca, String modelo, int anoFabricacao, int capacidadePassageiros, int numeroTurbinas, double altitudeMaxima) {
        super(marca, modelo, anoFabricacao, capacidadePassageiros);
        this.numeroTurbinas = numeroTurbinas;
        this.altitudeMaxima = altitudeMaxima;
    }

    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }

    @Override
    public void andar() {}
}
