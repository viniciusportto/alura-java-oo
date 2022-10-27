package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29);//Autoboxing
        System.out.println(idadeRef.doubleValue());

        int valor = idadeRef.intValue();//Unboxing

        String s = args[0];//"10"

        Integer numero = Integer.parseInt(s);
        System.out.println(numero);


        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing
    }
}