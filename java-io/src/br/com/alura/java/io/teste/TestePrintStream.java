package br.com.alura.java.io.teste;

import java.io.*;

public class TestePrintStream {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("java-io\\lorem2.txt");

        ps.println("\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vel lectus in justo venenatis semper in et erat.\"");
        ps.println();
        ps.println("Nam egestas interdum velit. Proin velit turpis, pharetra a rhoncus et, convallis non turpis.");

        ps.close();

        System.out.println();

    }

}
