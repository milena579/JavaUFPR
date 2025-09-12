import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private List<ItemDePedido> itensPedido;
    private double valTotalPermitido;

    public Pedido(String cliente, double valTotalPermitido){
        setCliente(cliente);
        if(valTotalPermitido < 0){
            System.out.println("O valor deve ser maior que 0!");
            return;
        }
        this.valTotalPermitido = valTotalPermitido;
        this.itensPedido = new ArrayList<>();
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if(cliente == null || cliente.isEmpty()){
            throw new IllegalArgumentException("O nome do cliente nao pode ser vazio!");
        }

        this.cliente = cliente;
    }

    public List<ItemDePedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemDePedido> itensPedido) {
        if(itensPedido == null){
            throw new IllegalArgumentException("O item nao pode ser nulo!");
        }
        this.itensPedido = itensPedido;
    }

    void acrescentaItem(ItemDePedido item){
        if (item == null) {
            throw new IllegalArgumentException("Item de Pedido não pode ser nulo.");
        }

        if (valorTotalPermitido == 0) {
            throw new IllegalStateException("Cliente não tem nenhum crédito.");
        }

        for (ItemDePedido existente : itensPedido) {
            if (existente.getNome().equalsIgnoreCase(item.getNome())) {

                int novaQuantidade = existente.getQuantidade() + item.getQuantidade();
                double novoTotal = calcularTotal() - existente.calcularTotal() + (item.getPreco() * novaQuantidade);

                if (novoTotal > valorTotalPermitido) {
                    throw new IllegalStateException("Item de Pedido não incluído. Valor do pedido excedido.");
                }

                existente.setQuantidade(novaQuantidade);
                return;
            }
        }

        double totalDepois = calcularTotal() + item.calcularTotal();
        if (totalDepois > valorTotalPermitido) {
            throw new IllegalStateException("Item de Pedido não incluído. Valor do pedido excedido.");
        }

        itensPedido.add(item);
    }

    public double calcularTotal() {
        double soma = 0;
        for (ItemDePedido item : itensPedido) {
            soma += item.calcularTotal();
        }
        return soma;
    }

   public void retirarItem(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do item inválido.");
        }

        for (int i = 0; i < itensPedido.size(); i++) {
            if (itensPedido.get(i).getNome().equalsIgnoreCase(nome)) {
                itensPedido.remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------\n");
        sb.append("Nome do Cliente: ").append(cliente).append("\n");
        sb.append(String.format("Total do Pedido: R$%.2f\n", calcularTotal()));
        sb.append("Item | Preço\n");

        for (ItemDePedido item : itensPedido) {
            sb.append(item.getNome())
            .append(" | ")
            .append(String.format("R$%.2f", item.calcularTotal()))
            .append("\n");
        }

        return sb.toString();
    }


}
