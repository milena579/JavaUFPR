package T06.Universidade;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private Professor professor; 
    private List<Aluno> alunosMatriculados; 

    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setProfessor(Professor professor) {
        if (this.professor != null && this.professor != professor) {
            this.professor.removerDisciplinaMinistrada(this); 
        }

        this.professor = professor;

        if (professor != null && !professor.getDisciplinasMinistradas().contains(this)) {
            professor.adicionarDisciplinaMinistrada(this);
        }
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunosMatriculados.contains(aluno)) {
            alunosMatriculados.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }

    public String imprime() {
        StringBuilder alunos = new StringBuilder();
        if (alunosMatriculados.isEmpty()) {
            alunos.append("Nenhum aluno matriculado.\n");
        } else {
            for (Aluno aluno : alunosMatriculados) {
                alunos.append("- ").append(aluno.getNome()).append(" (Matrícula: ").append(aluno.getMatricula()).append(")\n");
            }
        }

        String professorInfo = (professor != null) ? professor.getNome() : "Não atribuído";

        return "Disciplina: " + nome + "\n" +
               "Código: " + codigo + "\n" +
               "Carga Horária: " + cargaHoraria + "h\n" +
               "Professor: " + professorInfo + "\n" +
               "Alunos Matriculados:\n" + alunos.toString();
    }
}
