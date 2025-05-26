package T06.Veiculos;

public class Barco extends  VeiculoAquatico {
    private int qtdVelas;

    public int getQtdVelas() {
        return qtdVelas;
    }

    public Barco(String marca, String modelo, int anoFabricacao, int capacidadePassageiros, int comprimento, int qtdVelas) {
        super(marca, modelo, anoFabricacao, capacidadePassageiros, comprimento);
        this.qtdVelas = qtdVelas;
    }

    @Override
    public void andar() {
        System.out.println("-> O barco '" + super.getModelo() + "' está navegando nas águas, impulsionado por " + getQtdVelas() + "velas");

    }
    
}
