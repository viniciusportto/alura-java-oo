import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        int soma = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(soma);

        Map mapa = cursos
                .stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

        List<Curso> resultados = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toList());


    }
}
