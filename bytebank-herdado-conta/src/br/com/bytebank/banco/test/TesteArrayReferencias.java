package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Conta[] referencias = new Conta[5];

        ContaCorrente[] contaC = new ContaCorrente[5];

        ContaPoupanca[] contaP = new ContaPoupanca[5];

        ContaCorrente cc1 = new ContaCorrente(22,11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        System.out.println(referencias[0].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());


    }

}
