import java.util.function.Consumer;

public class ConsumidorDeStrings implements Consumer<String> {

    public void accept(String s){
        System.out.println(s);
    }

}
