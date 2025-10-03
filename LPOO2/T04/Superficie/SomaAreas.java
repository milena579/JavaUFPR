public class SomaAreas {
    public<T extends Superficie> double calcularArea(T[] formas){ //<T extends Superficie> → Quer dizer: "T pode ser qualquer classe que implemente Superficie".
        double soma = 0.0;
            for (T f : figuras) {
                soma += f.area();
            }
            return soma;
        }
}
