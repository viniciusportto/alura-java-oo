package br.com.bytebank.banco.modelo;

/**
 * Class represents the frame of an account
 *
 *@author Vinicius Porto
 *
 */

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Constructor to initialize the object from the agency and number.
     *
     *@param agencia
     *@param numero
     */

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    /**
     *
     *
     *@param valor
     *@throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo <= valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;
        if (this.agencia != outra.agencia) {
            return false;
        }
        if (this.numero != outra.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }

}