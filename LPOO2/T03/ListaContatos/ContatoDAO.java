import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements ContatoDAOI {

    private String url = "jdbc:mysql://localhost:3306/banco"; 
    private String user = "root";
    private String pass = "pass";

    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    @Override
    public void altera(Contato contato) {
        String sql = "UPDATE CONTATO SET nome = ?, email = ?, endereco = ?, dataNascimento = ? WHERE id = ?";

        try {
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTime())); 
            stmt.setLong(5, contato.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }

    @Override
    public void insere(Contato contato) {
        String sql = "INSERT INTO CONTATO (nome, email, endereco, dataNascimento) VALUES (?, ?, ?, ?)";

        try {
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }

    @Override
    public List<Contato> lista() {
        String sql = "SELECT * FROM CONTATO";
        List<Contato> contatos = new ArrayList<>();

        try {
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Contato c = new Contato(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("endereco"),
                        rs.getDate("dataNascimento")
                );
                contatos.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
        return contatos;
    }

    @Override
    public void remove(Contato contato) {
        String sql = "DELETE FROM CONTATO WHERE id = ?";

        try {
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, contato.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
}
