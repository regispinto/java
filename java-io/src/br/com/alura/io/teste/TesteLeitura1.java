package br.com.alura.io.teste;

import java.io.*;

public class TesteLeitura1 {
    public static void main(String[] args) throws IOException {
        GravarArquivoTexto1();
    }

    public static void GravarArquivoTexto1() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write( "Teste de Escrita - Linha 1");
        bw.newLine();
        bw.write( "Teste de Escrita - Linha 2");

        bw.close();
    }
}
