package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//
//        cliente.setNome("Vini Porto");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("789544561");
//
//
//        String nome = "Vini Porto";
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();

        System.out.println(cliente.getCpf());
   }
}
