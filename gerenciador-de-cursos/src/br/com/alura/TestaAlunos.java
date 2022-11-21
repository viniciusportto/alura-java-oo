package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Vinicius Porto");
        alunos.add("Isabela Santos");
        alunos.add("Thiago Figueiredo");
        alunos.add("Bruna Rodrigues");
        alunos.add("Felipe Marques");
        alunos.add("Paulo Silveira");

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno ->{
            System.out.println(aluno);
        });

        System.out.println(alunos);

    }

}
