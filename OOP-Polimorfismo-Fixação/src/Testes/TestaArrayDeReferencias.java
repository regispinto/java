package Testes;

import Classes.ContaCorrente;

public class TestaArrayDeReferencias {
    public static void main(String[] args) {
        // Array de Referências (Objeto Conta Corrente)
        ContaCorrente[] contas = new ContaCorrente[5];

        // Objeto Conta Corrente
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;

        ContaCorrente referencia = contas[1];
        System.out.println(referencia.getNumero());

        System.out.println(cc2.getNumero());

        System.out.println(cc2.getNumero());

        // Chamando o getNumero() da classe ContaCorrente através do array contas[]
        System.out.println(contas[1].getNumero());

        // Declaração de arrays de forma Literal, nesse contexto, significa usar valores diretamente,
        // menos burocrático, mais direito
        int[] refs = {1,2,3,4,5};
        System.out.println("refs[0]: " + refs[0]);
        System.out.println("refs[1]: " + refs[1]);
        System.out.println("refs[2]: " + refs[2]);
        System.out.println("refs[3]: " + refs[3]);
        System.out.println("refs[4]: " + refs[4]);

        for (int x = 0; x < refs.length; x++){
            System.out.println("refs[" + x + "]: " + refs[x]);
        }


    }
}
