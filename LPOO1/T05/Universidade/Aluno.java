package T05.Universidade;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private int periodo;
    private String[] disciplinasMatriculadas;
    private String endereco;
    private final int idade;
    private final int quantidadeDisciplinasPermitidadas;
    private int contadorDisciplinas = 0;

    public Aluno(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasPermitidadas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.quantidadeDisciplinasPermitidadas = quantidadeDisciplinasPermitidadas;
        this.disciplinasMatriculadas = new String[quantidadeDisciplinasPermitidadas];
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public int getQuantidadeDisciplinasPermitidadas() {
        return quantidadeDisciplinasPermitidadas;
    }

    public String fazMatricula(String disciplina) {
        if (quantidadeDisciplinasPermitidadas == 0) {
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        } else if (contadorDisciplinas >= quantidadeDisciplinasPermitidadas) {
            return "Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de " +
                    quantidadeDisciplinasPermitidadas + " disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.";
        } else {
            disciplinasMatriculadas[contadorDisciplinas] = disciplina;
            contadorDisciplinas++;
            return "Matrícula realizada com sucesso na disciplina: " + disciplina;
        }
    }

    public String cancelarMatricula(String disciplina) {
        for (int i = 0; i < contadorDisciplinas; i++) {
            if (disciplinasMatriculadas[i].equals(disciplina)) {
                for (int j = i; j < contadorDisciplinas - 1; j++) {
                    disciplinasMatriculadas[j] = disciplinasMatriculadas[j + 1];
                }
                disciplinasMatriculadas[contadorDisciplinas - 1] = null;
                contadorDisciplinas--;
                return "Cancelamento da matrícula da disciplina " + disciplina + " executado com sucesso.";
            }
        }
        return "Aluno não está matriculado na disciplina " + disciplina + ", portanto não é possível cancelar esta matrícula.";
    }

    public String imprime() {
        StringBuilder disciplinas = new StringBuilder();
        for (int i = 0; i < contadorDisciplinas; i++) {
            disciplinas.append("- ").append(disciplinasMatriculadas[i]).append("\n");
        }

        return 
            "Aluno: " + nome + "\n" +
            "Idade: " + idade + "\n" +
            "Matrícula: " + matricula + "\n" +
            "Curso: " + curso + "\n" +
            "Período: " + periodo + "\n" +
            "Endereço: " + endereco + "\n" +
            "Qtd disciplinas permitidas: " + quantidadeDisciplinasPermitidadas + "\n" +
            "Disciplinas:\n" + disciplinas.toString();
    }
}
