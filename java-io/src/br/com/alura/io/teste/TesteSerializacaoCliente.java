package br.com.alura.io.teste;

import br.com.alura.io.teste.Cliente;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("Régis Silveira Pinto");
        cliente.setProfissao("Dev");
        cliente.setCpf("39685785582");

        CriaArquivoDeSaida(cliente);

        CriaArquivoDeEntrada(cliente);
    }

    public static void CriaArquivoDeSaida(Cliente cliente) throws IOException {
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oss.writeObject(cliente);
        oss.close();
    }

    public static void CriaArquivoDeEntrada(Cliente cliente) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente1 = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente1.getCpf());
    }
}
