package Testes;

import Classes.Conta;
import Classes.ContaCorrente;

public class TestaMetodoEhIgual {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 11);
        Conta cc3 = new ContaCorrente(22, 22);
        Conta cc4 = new ContaCorrente(22, 11);

        boolean igual1 = cc1.EhIgual(cc2);
        boolean igual2 = cc3.EhIgual(cc2);
        boolean igual3 = cc4.EhIgual(cc1);

        System.out.println("As contas entre cc1 e cc2 são iguais? " + igual1); // true
        System.out.println("As contas entre cc3 e cc2 são iguais? " + igual2); // false
        System.out.println("As contas entre cc4 e cc1 são iguais? " + igual3); // true
    }
}
