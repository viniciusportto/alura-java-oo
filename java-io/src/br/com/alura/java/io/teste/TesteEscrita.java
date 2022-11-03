package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("java-io\\lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vel lectus in justo venenatis semper in et erat.");
        bw.newLine();
        bw.newLine();
        bw.write("Nam egestas interdum velit. Proin velit turpis, pharetra a rhoncus et, convallis non turpis.");

        bw.close();

    }
}
