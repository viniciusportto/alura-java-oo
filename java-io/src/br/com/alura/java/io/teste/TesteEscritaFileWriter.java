package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("java-io\\lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vel lectus in justo venenatis semper in et erat.");
        bw.newLine();
        bw.newLine();
        bw.write("Nam egestas interdum velit. Proin velit turpis, pharetra a rhoncus et, convallis non turpis.");

        bw.close();

    }



}
