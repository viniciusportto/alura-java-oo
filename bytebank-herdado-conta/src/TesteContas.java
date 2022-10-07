public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente cc = new ContaCorrente(11, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(22, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("Conta corrente: " + cc.getSaldo());
        System.out.println("Conta poupança: " + cp.getSaldo());

    }
}