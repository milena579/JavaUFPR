package T06.Universidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAcademico {
    private static List<Aluno> alunos = new ArrayList<>(); 
    private static List<Professor> professores = new ArrayList<>();
    private static List<Disciplina> disciplinas = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        new SistemaAcademico().menu();
    }

    public void menu() {
        int op;
        do {
            System.out.println("\n===== MENU DO SISTEMA ACADÊMICO =====");
            System.out.println("1  - Cadastrar Aluno");
            System.out.println("2  - Excluir Aluno");
            System.out.println("3  - Listar Alunos");
            System.out.println("4  - Cadastrar Professor");
            System.out.println("5  - Listar Professores");
            System.out.println("6  - Cadastrar Disciplina");
            System.out.println("7  - Listar Disciplinas");
            System.out.println("8  - Atribuir Professor a Disciplina");
            System.out.println("9  - Matricular Aluno em Disciplina");
            System.out.println("10 - Cancelar Matrícula de Aluno");

            System.out.println("0  - Sair");
            System.out.print("Digite o número da opção que deseja: ");
            op = s.nextInt();
            s.nextLine(); // Consome a nova linha

            switch (op) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    excluirAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    cadastrarProfessor();
                    break;
                case 5:
                    listarProfessores();
                    break;
                case 6:
                    cadastrarDisciplina();
                    break;
                case 7:
                    listarDisciplinas();
                    break;
                case 8:
                    atribuirProfessorADisciplina();
                    break;
                case 9:
                    matricularAlunoEmDisciplina();
                    break;
                case 10:
                    cancelarMatriculaAluno();
                    break;
                case 11:
                    listarAlunosComDisciplinas();
                    break;
                case 12:
                    listarProfessoresComDisciplinas();
                    break;
                case 13:
                    listarDisciplinasComDetalhes();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (op != 0);
    }

    // --- Métodos de Cadastro ---
    public void cadastrarAluno() {
        System.out.println("\n--- Cadastrar Novo Aluno ---");
        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("Endereço: ");
        String endereco = s.nextLine();
        System.out.print("Idade: ");
        int idade = s.nextInt();
        s.nextLine(); // Consome a nova linha
        System.out.print("Matrícula: ");
        String matricula = s.nextLine();
        System.out.print("Curso: ");
        String curso = s.nextLine();
        System.out.print("Período: ");
        int periodo = s.nextInt();
        System.out.print("Quantidade de disciplinas permitidas: ");
        int qtdDisciplinas = s.nextInt();
        s.nextLine(); // Consome a nova linha

        Aluno novoAluno = new Aluno(nome, endereco, idade, matricula, curso, periodo, qtdDisciplinas);
        alunos.add(novoAluno);
        System.out.println("Aluno " + nome + " cadastrado com sucesso!");
    }

    public void cadastrarProfessor() {
        System.out.println("\n--- Cadastrar Novo Professor ---");
        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("Endereço: ");
        String endereco = s.nextLine();
        System.out.print("Idade: ");
        int idade = s.nextInt();
        s.nextLine(); // Consome a nova linha
       

        Professor novoProfessor = new Professor(nome, endereco, idade);
        professores.add(novoProfessor);
        System.out.println("Professor " + nome + " cadastrado com sucesso!");
    }

    public void cadastrarDisciplina() {
        System.out.println("\n--- Cadastrar Nova Disciplina ---");
        System.out.print("Nome da Disciplina: ");
        String nome = s.nextLine();
        System.out.print("Código da Disciplina: ");
        String codigo = s.nextLine();
        System.out.print("Carga Horária: ");
        int cargaHoraria = s.nextInt();
        s.nextLine(); // Consome a nova linha

        Disciplina novaDisciplina = new Disciplina(nome, codigo, cargaHoraria);
        disciplinas.add(novaDisciplina);
        System.out.println("Disciplina " + nome + " cadastrada com sucesso!");
    }

    // --- Métodos de Exclusão ---
    public void excluirAluno() {
        System.out.print("Nome do aluno a excluir: ");
        String nomeExcluir = s.nextLine();
        Aluno alunoParaExcluir = buscarAlunoPorNome(nomeExcluir);

        if (alunoParaExcluir == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        // Antes de excluir o aluno, remova-o das disciplinas em que está matriculado
        // Isso é importante para manter a integridade dos dados
        List<Disciplina> disciplinasDoAluno = new ArrayList<>(alunoParaExcluir.getDisciplinasMatriculadas());
        for (Disciplina disc : disciplinasDoAluno) {
            alunoParaExcluir.cancelarMatricula(disc); // Isso também remove o aluno da lista da disciplina
        }

        if (alunos.remove(alunoParaExcluir)) {
            System.out.println("Aluno " + nomeExcluir + " excluído com sucesso!");
        } else {
            System.out.println("Erro ao excluir aluno."); // Deveria ser pego pelo null check
        }
    }

    // --- Métodos de Listagem ---
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("\n===== Lista de Alunos =====");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula() + " | Curso: " + aluno.getCurso());
        }
    }

    public void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }
        System.out.println("\n===== Lista de Professores =====");
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
        }
    }

    public void listarDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }
        System.out.println("\n===== Lista de Disciplinas =====");
        for (Disciplina disciplina : disciplinas) {
            String professorNome = (disciplina.getProfessor() != null) ? disciplina.getProfessor().getNome() : "Não Atribuído";
            System.out.println("Nome: " + disciplina.getNome() + " | Código: " + disciplina.getCodigo() + " | Professor: " + professorNome);
        }
    }

    // --- Métodos de Relacionamento (Matrícula/Atribuição) ---
    public void atribuirProfessorADisciplina() {
        System.out.print("Código da disciplina para atribuir professor: ");
        String codigoDisciplina = s.nextLine();
        Disciplina disciplina = buscarDisciplinaPorCodigo(codigoDisciplina);

        if (disciplina == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        System.out.print("Nome do professor a ser atribuído: ");
        String nomeProfessor = s.nextLine();
        Professor professor = buscarProfessorPorNome(nomeProfessor);

        if (professor == null) {
            System.out.println("Professor não encontrado.");
            return;
        }

        System.out.println(professor.adicionarDisciplinaMinistrada(disciplina)); // O professor gerencia a atribuição
    }

    public void matricularAlunoEmDisciplina() {
        System.out.print("Nome do aluno para matricular: ");
        String nomeAluno = s.nextLine();
        Aluno aluno = buscarAlunoPorNome(nomeAluno);

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Código da disciplina para matricular: ");
        String codigoDisciplina = s.nextLine();
        Disciplina disciplina = buscarDisciplinaPorCodigo(codigoDisciplina);

        if (disciplina == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        System.out.println(aluno.fazMatricula(disciplina));
    }

    public void cancelarMatriculaAluno() {
        System.out.print("Nome do aluno para cancelar matrícula: ");
        String nomeAluno = s.nextLine();
        Aluno aluno = buscarAlunoPorNome(nomeAluno);

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Código da disciplina para cancelar matrícula: ");
        String codigoDisciplina = s.nextLine();
        Disciplina disciplina = buscarDisciplinaPorCodigo(codigoDisciplina);

        if (disciplina == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        System.out.println(aluno.cancelarMatricula(disciplina));
    }

    // --- Métodos de Impressão Detalhada ---
    public void listarAlunosComDisciplinas() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("\n===== Detalhes de Alunos e Suas Disciplinas =====");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.imprime());
            System.out.println("-------------------------------------");
        }
    }

    public void listarProfessoresComDisciplinas() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }
        System.out.println("\n===== Detalhes de Professores e Suas Disciplinas Ministradas =====");
        for (Professor professor : professores) {
            System.out.println(professor.imprime());
            System.out.println("-------------------------------------");
        }
    }

    public void listarDisciplinasComDetalhes() {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }
        System.out.println("\n===== Detalhes de Disciplinas (Professor e Alunos) =====");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.imprime());
            System.out.println("-------------------------------------");
        }
    }


    // --- Métodos de Busca (Auxiliares) ---
    public Aluno buscarAlunoPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public Professor buscarProfessorPorNome(String nome) {
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                return professor;
            }
        }
        return null;
    }

    public Disciplina buscarDisciplinaPorCodigo(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equalsIgnoreCase(codigo)) {
                return disciplina;
            }
        }
        return null;
    }
}