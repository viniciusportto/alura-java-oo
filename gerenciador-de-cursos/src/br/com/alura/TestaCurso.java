package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Domindando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 6));
        javaColecoes.adiciona(new Aula("Modelando com coleções",13));



        System.out.println(javaColecoes.getAulas());

    }

}
