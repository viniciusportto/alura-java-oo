package br.com.alura;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Domindando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 6));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 13));

        Aluno a1 = new Aluno("Thiago Figueiredo", 34672);
        Aluno a2 = new Aluno("Guilherme Mattos", 5617);
        Aluno a3 = new Aluno("Alexandre Morais", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 5617?");
        javaColecoes.buscaMatriculado(5617);
        Aluno aluno = javaColecoes.buscaMatriculado(5616);
        System.out.println("Aluno : " + aluno);

    }

}
