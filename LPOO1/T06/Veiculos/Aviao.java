package T06.Veiculos;

public class Aviao extends VeiculoAereo {
    private String denominacao;

    public String getdenominacao() {
        return denominacao;
    }

    public Aviao(String marca, String modelo, int anoFabricacao, int capacidadePassageiros, int numeroTurbinas, double altitudeMaxima, String denominacao) {
        super(marca, modelo, anoFabricacao, capacidadePassageiros, numeroTurbinas, altitudeMaxima);
        this.denominacao = denominacao;
    }

    @Override
    public void andar() {
        System.out.println("-> O avião '" + super.getMarca() + "' está decolando e voando pelos céus com suas " + super.getNumeroTurbinas() + " turbinas.");

    }
    
    
}
