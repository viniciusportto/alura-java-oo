package teste;

public class TesteContas {

    public static void main(String[] args) throws modelo.SaldoInsuficienteException{

        modelo.ContaCorrente cc = new modelo.ContaCorrente(11, 111);
        cc.deposita(100.0);

        modelo.ContaPoupanca cp = new modelo.ContaPoupanca(22, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());

    }
}