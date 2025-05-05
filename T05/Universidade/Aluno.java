// 2. (Tarefa 5) Escreva a estrutura de uma classe (atributos e métodos) para
// representar um aluno (nome, matricula, curso, período,
// disciplinasMatriculadas(array de String) e endereço):

// a. Compile a classe;

// b. Crie um construtor para essa classe com a seguinte assinatura:
// public Aluno(String nome, String matricula, String curso, int periodo, int idade,
// int quantidadeDisciplinasPermitidadas)
// Onde a quantidadeDisciplinasPermitidadas representa a quantidade de
// disciplinas que o aluno pode se matricular. Deve ser utilizada para
// redimensionar o array de Strings.

// c. Acrescente três métodos:
//  String fazMatricula(String disciplina): inclui uma disciplina no array de
// Strings. Se o aluno já ultrapassou a quantidade de disciplinas que
// pode se matricular, então o sistema retorna para este método uma
// string informando: “Quantidade de disciplinas excedida. O limite de
// disciplinas para este aluno é de 2 disciplina(s). Se desejar, cancele a
// matrícula de uma das disciplinas e faça a nova matrícula.”
// Se o aluno não puder ser matriculado em nenhuma disciplina
// (tamanho do array=0), então o método deve retornar: “Este aluno não
// pode ser matriculado em nenhuma disciplina, por favor, fale com a
// secretaria.”
// Se foi matriculado com sucesso a seguinte String é retornada:
// “Matrícula na disciplina “LPOO” executada.”

//  String cancelarMatricula(String disciplina): exclui a disciplina do array
// de Strings. Se o aluno não estiver matriculado na disciplina, o método
// deve retornar: “Aluno não está matriculado na disciplina LPOO,
// portanto não é possível cancelar esta matrícula.”. Se o aluno
// realmente estiver matriculado na disciplina, então o método deve
// retornar “Cancelamento da matrícula da disciplina LPOO executado
// com sucesso.”

//  String imprime(): Método que retorna uma String de forma legível com
// todos os atributos de aluno e as disciplinas matriculadas no seguinte
// formato:
// -----------------------------------------------------------------
// Nome do Aluno: Rafael Romualdo Wandresen
// Matricula: GRR20130101
// Curso: TADS
// Periodo: 4
// Disciplinas Matriculadas: Gestão de Projetos; LPOO
// -----------------------------------------------------------------

