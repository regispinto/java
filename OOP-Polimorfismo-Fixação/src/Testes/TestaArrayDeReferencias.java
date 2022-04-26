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
    }
}
