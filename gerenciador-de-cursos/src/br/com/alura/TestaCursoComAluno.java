package br.com.alura;

public class TestaCursoComAluno {

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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno figueiredo = new Aluno("Thiago Figueiredo",34672 );
        System.out.println("E esse Figueiredo, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(figueiredo));

        System.out.println("O a1 é equals ao Figueiredo?");
        System.out.println(a1.equals(figueiredo));


    }

}
