package br.com.alura.tdd.modelo;

public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(7, 3);
        System.out.println(soma);

        int soma1 = calc.somar(7, 0);
        System.out.println(soma1);

        int soma2 = calc.somar(0, 0);
        System.out.println(soma2);

        int soma3 = calc.somar(3, -1);
        System.out.println(soma3);



    }

}
