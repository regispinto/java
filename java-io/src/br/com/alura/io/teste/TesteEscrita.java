package br.com.alura.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        GravarArquivoTexto();
    }

    public static void GravarArquivoTexto() throws IOException {
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        for (int i=1; i<=20; i++ ) {
            bw.write("Sequência de i = " + i);
            bw.newLine();
        }
        bw.close();
    }
}
