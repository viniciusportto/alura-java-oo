import java.awt.*;

public class testaBanco {

    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.nome = "Vinicius Porto";
        vinicius.cpf = "333.333.333.33";
        vinicius.profissao = "programador";

        Conta contaDoVinicius = new Conta();
        contaDoVinicius.deposita(100);

        contaDoVinicius.titular = vinicius;
        System.out.println(contaDoVinicius.titular.nome);
    }
}
