// 10. (Tarefa 6) Implemente a estrutura de classes representada na figura a seguir, de acordo com as instruções abaixo:
// a. A implementação de operacao1() deve mostrar no console que passou por tal método e o valor dos atributos do objeto;
// b. A implementação de operacao2() deve mostrar no console que passou por tal método;
// c. O construtor C() deve inicializar seus atributos 1 e 2 com “VAZIO”e -999.99f, respectivamente;
// d. O construtor C(String p1, float p2) deve inicializar seus atributos com os valores providos por parâmetro;
// e. Os construtores de C_12 devem chamar os construtores respectivos da superclasse e inicializar a matriz atributo3. Se o construtor for sem parâmetros, a matriz deve ser 2 x
// 2 e seus elementos possuir valor 0. Se o construtor possuir parâmetros, a matriz deve ser 3 x 3 e seus elementos devem possuir valor 1;
// f. O método main deve possuir o código indicado a seguir. Entenda a origem de todas as saídas;

public class C {
    protected String atributo1;
    protected Float atributo2;

    public C() {
        this.atributo1 = "VAZIO";
        this.atributo2 = -999.99f;
    }

    public C(String p1, Float p2) {
        this.atributo1 = p1;
        this.atributo2 = p2;
    }
    
    public String getAtributo1() {
        return atributo1;
    }
    
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }
    
    public Float getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(Float atributo2) {
        this.atributo2 = atributo2;
    }

}
