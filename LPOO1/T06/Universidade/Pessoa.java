package T06.Universidade;

public class Pessoa {
    private String nome;
    
    private String endereco;
    
    private int idade;
    
    public Pessoa(String nome, String endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public int getIdade() {
        return idade;
    }
    

    public String imprime() {
        return 
            "Aluno: " + nome + "\n" +
            "Idade: " + idade + "\n" +
            "Endereço: " + endereco + "\n" ;
    }
}
