public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoVini = new Conta();
        contaDoVini.saldo = 100;
        contaDoVini.deposita(50);
        System.out.println(contaDoVini.saldo);

        boolean conseguiuRetirar = contaDoVini.saca(20);
        System.out.println(contaDoVini.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if (contaDaMarcela.transfere(300, contaDoVini)) {
            System.out.println("Transferencia com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoVini.saldo);
    }
}