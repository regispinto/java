package br.com.alura.io.teste;

import java.io.*;
import java.sql.SQLOutput;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        CriaArquivoDeSaida();

        CriaArquivoDeEntrada();
    }

    public static void CriaArquivoDeSaida() throws IOException {
        String nome = "Régis Silveira Pinto";
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oss.writeObject(nome);
        oss.close();
    }

    public static void CriaArquivoDeEntrada() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }
}
