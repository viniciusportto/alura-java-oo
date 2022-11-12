package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestantoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3  = "Trabalhando com Cursos e Sets";
        String aula4 = ("Aumentando nosso conhecimento");

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);


        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        for(int i = 0; i < aulas.size(); i++){
            System.out.println("aula: " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " + aula);
        });

        System.out.println("Antes da ordenação: " + aulas);
        Collections.sort(aulas);

        System.out.println("Depois da ordenação " + aulas);

    }
}
