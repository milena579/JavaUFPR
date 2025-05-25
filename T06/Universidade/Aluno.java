package T06.Universidade;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private int periodo;
    private List<Disciplina> disciplinasMatriculadas;
    private final int quantidadeDisciplinasPermitidas;

    public Aluno(String nome, String endereco, int idade, String matricula, String curso, int periodo, int quantidadeDisciplinasPermitidadas) {
        super(nome, endereco, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidadas;
        this.disciplinasMatriculadas = new ArrayList<>();
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

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public int getQuantidadeDisciplinasPermitidadas() {
        return quantidadeDisciplinasPermitidas;
    }

    public String fazMatricula(Disciplina disciplina) {
        if (quantidadeDisciplinasPermitidas == 0) {
            return "Este aluno não pode ser matriculado em nenhuma disciplina. Fale com a secretaria.";
        } else if (disciplinasMatriculadas.size() >= quantidadeDisciplinasPermitidas) {
            return "Quantidade de disciplinas excedida. O limite para este aluno é de " +
                   quantidadeDisciplinasPermitidas + " disciplina(s).";
        } else if (disciplinasMatriculadas.contains(disciplina)) {
            return "Aluno já matriculado nesta disciplina.";
        } else {
            disciplinasMatriculadas.add(disciplina);
            disciplina.adicionarAluno(this);
            return "Matrícula realizada com sucesso na disciplina: " + disciplina.getNome();
        }
    }

    public String cancelarMatricula(Disciplina disciplina) {
        if (disciplinasMatriculadas.remove(disciplina)) {
            disciplina.removerAluno(this); 
            return "Cancelamento da matrícula da disciplina " + disciplina.getNome() + " executado com sucesso.";
        }
        return "Aluno não está matriculado na disciplina " + disciplina.getNome() + ", portanto não é possível cancelar esta matrícula.";
    }

    @Override
    public String imprime() {
        StringBuilder disciplinas = new StringBuilder();

        if (disciplinasMatriculadas.isEmpty()) {
            disciplinas.append("Nenhuma disciplina matriculada.\n");
        } else {
            for (Disciplina disciplina : disciplinasMatriculadas) {
                disciplinas.append("- ").append(disciplina.getNome()).append("\n");
            }
        }

        return super.imprime() + 
               "Matrícula: " + matricula + "\n" +
               "Curso: " + curso + "\n" +
               "Período: " + periodo + "\n" +
               "Qtd disciplinas permitidas: " + quantidadeDisciplinasPermitidas + "\n" +
               "Disciplinas Matriculadas:\n" + disciplinas.toString();
    }

}
