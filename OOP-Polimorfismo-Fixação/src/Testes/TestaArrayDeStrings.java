package Testes;

import java.util.Arrays;
import java.util.List;

public class TestaArrayDeStrings {
    public static void main(String[] args) {

        // Lista o String[] com os argumentos do array de strings
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // Atribui a uma lista os argumentos atribuidos em args
        List<String> argumentos = Arrays.asList(args);

        System.out.println("----- List<String> -----");

        for (int i = 0; i < argumentos.size(); i++) {
            System.out.println(argumentos.get(i));
        }
    }
}
