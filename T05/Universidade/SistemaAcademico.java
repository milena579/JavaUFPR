package T05.Universidade;


import java.util.Scanner;

public class SistemaAcademico {
    private static Aluno[] alunos;
    private static int totalAlunos = 0;
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Informe a quantidade de alunos que deseja cadastrar: ");
        int capacidade = s.nextInt();
        s.nextLine(); 
        alunos = new Aluno[capacidade];

        new SistemaAcademico().menu();
    }

    public void menu() {
        int op;
        do {
            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Excluir Aluno");
            System.out.println("3 - Listar Alunos");
            System.out.println("4 - Matricular aluno em disciplina");
            System.out.println("5 - Cancelar matrícula");
            System.out.println("6 - Lista de alunos e disciplinas");
            System.out.println("0 - Sair");
            System.out.print("Digite o número da opção que deseja: ");
            op = s.nextInt();
            s.nextLine(); // limpar buffer

            switch (op) {
                case 1:
                    if (totalAlunos >= alunos.length) {
                        System.out.println("Limite de alunos atingido.");
                        break;
                    }

                    System.out.print("Nome: ");
                    String nome = s.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = s.nextLine();

                    System.out.print("Curso: ");
                    String curso = s.nextLine();

                    System.out.print("Período: ");
                    int periodo = s.nextInt();

                    System.out.print("Idade: ");
                    int idade = s.nextInt();

                    System.out.print("Quantidade de disciplinas permitidas: ");
                    int qtdDisciplinas = s.nextInt();
                    s.nextLine(); // limpar buffer

                    System.out.print("Endereço: ");
                    String endereco = s.nextLine();

                    Aluno novoAluno = new Aluno(nome, matricula, curso, periodo, idade, qtdDisciplinas);
                    novoAluno.setEndereco(endereco);

                    cadastrarAluno(novoAluno);
                    break;

                case 2:
                    System.out.print("Nome do aluno a excluir: ");
                    String nomeExcluir = s.nextLine();
                    excluirAluno(nomeExcluir);
                    break;

                case 3:
                    listarAlunos();
                    break;

                case 4:
                    System.out.print("Nome do aluno: ");
                    String nomeAlunoMat = s.nextLine();
                    Aluno aMat = buscarAlunoPorNome(nomeAlunoMat);

                    if (aMat == null) {
                        System.out.println("Aluno não encontrado.");
                        break;
                    }

                    if (aMat.getDisciplinasMatriculadas() == null) {
                        System.out.print("Quantas disciplinas esse aluno pode ter? ");
                        int q = s.nextInt();
                        s.nextLine(); // limpar buffer
                        aMat.setDisciplinasMatriculadas(new String[q]);
                    }

                    System.out.print("Disciplina a matricular: ");
                    String disc = s.nextLine();
                    System.out.println(matricularAlunoDisciplina(aMat, disc));
                    break;

                case 5:
                    System.out.print("Nome do aluno: ");
                    String nomeCancel = s.nextLine();

                    Aluno aCancel = buscarAlunoPorNome(nomeCancel);
                    if (aCancel == null) {
                        System.out.println("Aluno não encontrado.");
                        break;
                    }

                    System.out.print("Disciplina a cancelar: ");
                    String discCancel = s.nextLine();

                    System.out.println(cancelarMatricula(aCancel, discCancel));
                    break;

                case 6:
                    System.out.println(listaDeAlunoseDisciplinas());
                    break;

                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    public static void cadastrarAluno(Aluno aluno) {
        alunos[totalAlunos++] = aluno;
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void excluirAluno(String nomeAluno) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nomeAluno)) {
                for (int j = i; j < totalAlunos - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }

                alunos[totalAlunos - 1] = null;
                totalAlunos--;
                System.out.println("Aluno excluído com sucesso!");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public static Aluno[] listarAlunos() {
        if (totalAlunos == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return new Aluno[0];  
        } else {
            System.out.println("\n===== Lista de Alunos =====");
            for (int i = 0; i < totalAlunos; i++) {
                Aluno aluno = alunos[i];
                System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula() + " | Curso: " + aluno.getCurso());
            }
            return alunos; 
        }
    }

    public static String matricularAlunoDisciplina(Aluno aluno, String disciplina) {
        return aluno.fazMatricula(disciplina);
    }

    public static String cancelarMatricula(Aluno aluno, String disciplina) {
        return aluno.cancelarMatricula(disciplina);
    }

    public static String listaDeAlunoseDisciplinas() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < totalAlunos; i++) {
            sb.append(alunos[i].imprime()).append("\n");
        }
        return sb.toString();
    }

    public static Aluno buscarAlunoPorNome(String nome) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nome)) {
                return alunos[i];
            }
        }
        return null;
    }
}
