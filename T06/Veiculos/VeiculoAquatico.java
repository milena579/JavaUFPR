package T06.Veiculos;

public abstract class VeiculoAquatico extends Veiculo{

    private double comprimento; 

    
    public VeiculoAquatico(String marca, String modelo, int anoFabricacao, int capacidadePassageiros, int comprimento) {
        super(marca, modelo, anoFabricacao, capacidadePassageiros);
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    @Override
    public void andar() {
        // TODO Auto-generated method stub
        
    }
}
