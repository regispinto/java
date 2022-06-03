package br.com.alura.cursos;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando Coleções", 21));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Lista de Alunos Matriculados: ");
        javaColecoes.getAlunos().forEach(a -> System.out.println(a));

        System.out.println("O aluno " + a1 + " está matriculado? " + javaColecoes.estaMatriculao(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado? " + javaColecoes.estaMatriculao(turini));
        System.out.println("O a1 é equals ao Turini? " + a1.equals(turini));
      }
}
