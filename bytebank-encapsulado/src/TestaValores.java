public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        Conta conta1 = new Conta(2323, 2333);

        Conta conta2 = new Conta(232, 232);

        System.out.println("O total de contas é: " + Conta.getTotal());
    }
}
