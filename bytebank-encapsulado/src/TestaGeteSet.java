public class TestaGeteSet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 2556);
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinicius Porto");
        conta.setTitular(vinicius);
        conta.getTitular().setProfissao("Programador");

        System.out.println(conta.getAgencia());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
    }
}