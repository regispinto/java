package Testes;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

public class TestaArrayDeReferencias {
    public static void main(String[] args) {
        // Array de Referências (Objeto Conta Corrente/Poupança)
        Conta[] contas = new Conta[5];

        // Objeto Conta Corrente
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(33, 44);
        contas[1] = cc2;

        ContaPoupanca referencia = (ContaPoupanca) contas[1]; // Type Cast
        System.out.println(referencia.getNumero());

        // Chamando o método getNumero() da classe ContaPoupanca através do array contas[]
        System.out.println("Numero: " + contas[1].getNumero());
        System.out.println("Agência: " + contas[1].getAgencia());

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
