package Testes;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {
        int[] idades = new int[5];
/*
        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;
*/
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
            System.out.println(idades[i]);
        }

        int idade4 = idades[3];

        System.out.println("Tamanho do Array: " + idades.length);
        System.out.println("Valor da posição 4: " + idade4);
    }
}