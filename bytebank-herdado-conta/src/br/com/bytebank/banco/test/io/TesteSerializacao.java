package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {


        Cliente cliente = new Cliente();

        cliente.setNome("Vini Porto");
        cliente.setProfissao("Dev");
        cliente.setCpf("789544561");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cliente);
        oos.close();
    }
}
