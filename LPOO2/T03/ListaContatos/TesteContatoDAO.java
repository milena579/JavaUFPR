import java.util.Date;
import java.util.List;

public class TesteContatoDAO {
    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();

        // Criando um novo contato
        Contato novo = new Contato();
        novo.setNome("Maria Silva");
        novo.setEmail("maria@email.com");
        novo.setEndereco("Rua das Flores, 123");
        novo.setDataNascimento(new Date());

        // Inserindo
        System.out.println("Inserindo contato...");
        dao.insere(novo);

        // Listando todos
        System.out.println("\nLista de contatos:");
        List<Contato> contatos = dao.lista();
        for (Contato c : contatos) {
            System.out.println(c);
        }

        if (!contatos.isEmpty()) {
            Contato primeiro = contatos.get(0);
            primeiro.setNome("Maria Souza");
            System.out.println("\nAlterando contato ID " + primeiro.getId());
            dao.altera(primeiro);
        }

        System.out.println("\nLista de contatos após alteração:");
        contatos = dao.lista();
        for (Contato c : contatos) {
            System.out.println(c);
        }

        if (!contatos.isEmpty()) {
            Contato remover = contatos.get(0);
            System.out.println("\nRemovendo contato ID " + remover.getId());
            dao.remove(remover);
        }

        System.out.println("\nLista de contatos após remoção:");
        contatos = dao.lista();
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}
