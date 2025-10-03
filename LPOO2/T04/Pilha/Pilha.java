public class Pilha<T> {
    private T[] elementos;
    private int topo;

    public Pilha(){
        elementos = (T[]) new Object[10];
        topo =  -1;
    }

    public void empilha(T elemento){
        if(topo == elementos.length - 1){
            redimensiona();
        }

        elementos[++topo] = elemento;
    }

    public T desempilha() throws Exception {
        if (estaVazia()) {
            throw new Exception("Pilha vazia");
        }
        return elementos[topo--];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    private void redimensiona() {
        T[] novo = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i <= topo; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = topo; i >= 0; i--) {
            sb.append(elementos[i]);
            if (i > 0) {
                sb.append(" , ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }


}
