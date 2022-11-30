import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorDeStringPorTamanho();
        palavras.sort(comparador);
        System.out.println(palavras);

        Consumer<String> consumidor = new ConsumidorDeStrings();
        palavras.forEach(consumidor);

    }
}