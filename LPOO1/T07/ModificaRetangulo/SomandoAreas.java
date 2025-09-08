package T07.ModificaRetangulo;

// Crie uma classe que contenha um método capaz de efetuar a soma das áreas de elementos de um único vetor contendo objetos do tipo 
//Retangulo, Triangulo e Circunferencia. Construa um programa para testar este método.

public class SomandoAreas {
    public static double Areas(Forma[] formas){

        double soma = 0;

        for (Forma f : formas) {
            soma += f.calcularArea();
        }
        
        return soma;
    }
}
