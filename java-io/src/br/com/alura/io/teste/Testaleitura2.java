package br.com.alura.io.teste;

import java.io.File;
import java.util.Scanner;

public class Testaleitura2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"));
        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
        scanner.close();
    }
}
