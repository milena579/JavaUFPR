/* 2. Escreva a estrutura de uma classe (atributos e métodos) para 
representar uma Pessoa (nome, idade e endereço): 
    a. Compile a classe; 
    b. Crie uma outra classe que utilize um objeto Pessoa. Leia informações de 
    nome, idade e endereço, e mostre todos os dados e a idade da pessoa. O 
    programa deve usar os métodos do objeto. 
    c. Acrescente dois métodos: 
     fazAniversario(): que incrementa a idade da pessoa 
     imprime(): Que imprime de forma legível todos os atributos da pessoa 
    d. Altere o método main (que utiliza a classe pessoa) para que instancie 
    uma pessoa, utilize algumas vezes o método fazAniversario e imprima os 
    atributos do objeto pessoa. 
*/

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void fazAniversario() {
        idade++;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereco: " + endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
