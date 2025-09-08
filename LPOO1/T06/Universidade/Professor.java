package T06.Universidade;

import java.util.List;

public class Professor extends Pessoa {
    private List<Disciplina> disciplinasMinistradas;

    public Professor(String nome, String endereco, int idade ) {
        super(nome, endereco, idade);
    }
    
    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public String removerDisciplinaMinistrada(Disciplina disciplina) {
         if (disciplinasMinistradas.remove(disciplina)) {
            if (disciplina.getProfessor() == this) { 
                disciplina.setProfessor(null);
            }
            return "Disciplina '" + disciplina.getNome() + "' removida do professor " + this.getNome() + ".";
        }
        return "Professor não ministra a disciplina '" + disciplina.getNome() + "'.";
    }

    public String adicionarDisciplinaMinistrada(Disciplina disciplina) {
       if (disciplinasMinistradas.contains(disciplina)) {
            return "Professor já ministra esta disciplina.";
        }
        disciplinasMinistradas.add(disciplina);
        disciplina.setProfessor(this);
        return "Disciplina '" + disciplina.getNome() + "' adicionada ao professor " + this.getNome() + ".";
    }

    @Override
    public String imprime() {
       StringBuilder disciplinas = new StringBuilder();
        if (disciplinasMinistradas.isEmpty()) {
            disciplinas.append("Nenhuma disciplina ministrada.\n");
        } else {
            for (Disciplina disciplina : disciplinasMinistradas) {
                disciplinas.append("- ").append(disciplina.getNome()).append("\n");
            }
        }

        return super.imprime() + 
            "Disciplinas Ministradas:\n" + disciplinas.toString();
    }
}
