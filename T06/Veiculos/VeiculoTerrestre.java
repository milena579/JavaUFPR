package T06.Veiculos;

public abstract class VeiculoTerrestre extends Veiculo {

    private int numeroRodas;
    
    public VeiculoTerrestre(String marca, String modelo, int anoFabricacao, int capacidadePassageiros, int numeroRodas) {
        super(marca, modelo, anoFabricacao, capacidadePassageiros);
        this.numeroRodas = numeroRodas;
    }
    
    public int getNumeroRodas() {
        return numeroRodas;
    }

    @Override
    public void andar() {
        // TODO Auto-generated method stub
        
    }
}
