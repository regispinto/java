package br.com.alura.io.teste;

import java.io.*;

public class TesteLeituraEscrita {
    public static void main(String[] args) throws IOException {
        LeArquivoTexto();
    }

    public static void LeArquivoTexto() throws IOException {
        // Leitura --
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // Escrita --
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        int i = 1;

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);

            bw.write(linha + " " + i);
            bw.newLine();

            linha = br.readLine();
            i++;
        }

        br.close();
        bw.close();
    }
}
