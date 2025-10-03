import java.util.List;

public interface ContatoDAOI {
    
    void insere(Contato contato);

    void altera(Contato contato);

    void remove(Contato contato);

    List<Contato> lista();
}
