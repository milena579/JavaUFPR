public class ItemDePedido {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemDePedido(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            throw new  System.err.println("O nome do item não pode ser vazio!");
            return;
        }
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0 ){
            throw new System.err.println("O preço deve ser maior que 0!");
            return;
        }
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        if(quantidade < 0 || quantidade == 0){
            throw new System.err.println("A quantidade deve sair maior que 0!");
            return;
        }
        this.quantidade = quantidade;
    }
}
