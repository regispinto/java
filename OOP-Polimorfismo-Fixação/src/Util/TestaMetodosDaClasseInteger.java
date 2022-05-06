package Util;

import java.util.ArrayList;
import java.util.List;

public class TestaMetodosDaClasseInteger {
    public static void main(String[] args) {
        // Em se tratando de Arrays, existem dois tipo Arrays Primitivos e Arrays de Referência.
        //

        // Array de primitivos onde cada posição guarda o valor primitivo
        int[] idades = new int[5];

        // Utilizando a classe String[] como Arry de Referências, ode cada posição guarda uma refereência
        String[] nomes = new String[5];

        // Variável idade é do tipo primitivo
        int idade = 29; //
        // Internamemte no java, para cada tipo primitivo existe uma clase que o representa na OOP,
        // no exemplo acima o primitivo "int" é representado internamente pela classe Integer
        //Integer idaderef = new Integer(29);

        // O correto é usar da seguinte forma
        Integer idaderef = Integer.valueOf(29); // Autoboxing
        int valor = idaderef.intValue();  // Parse
        System.out.println(idaderef.doubleValue());

        String s = args[0];
        Integer numero1 = Integer.valueOf(s);
        System.out.println(numero1);

        int numero2 = Integer.parseInt(s);
        System.out.println(numero2);

        List<Integer> numeros = new ArrayList<Integer>();

        // O código a seguir, não deveria funcionar porque a variável idade não é uma referência mas sim um primitivo
        // e números é um array de referências
        // A transformação de um primitivo para objeto e vice-versa se chama autoboxing
        numeros.add(29);

        System.out.println(numeros.get(0));
    }
}
