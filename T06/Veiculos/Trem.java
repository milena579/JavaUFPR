package T06.Veiculos;

public class Trem extends VeiculoTerrestre{
    private  int qtdVagoes;

    public Trem(String marca, String modelo, int anoFabricacao, int capacidadePassageiros, int numeroRodas, int qtdVagoes) {
        super(marca, modelo, anoFabricacao, capacidadePassageiros, numeroRodas);
        this.qtdVagoes = qtdVagoes;
    }

    public int getQtdVagoes() {
        return qtdVagoes;
    }

    @Override
    public void andar() {
        System.out.println("-> O trem '" + getModelo() + "' está percorrendo os trilhos com seus " + getQtdVagoes() + " vagões.");
    }
    
    
}
