package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,12);
        lista.add(cc2);

        System.out.println("tamanho: " + lista.size());

        Conta ref = lista.get(0);

        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc);

        Conta cc4 = new ContaCorrente(33,312);
        lista.add(cc2);

        for (Conta conta: lista) {
            System.out.println(conta);
        }

    }

}