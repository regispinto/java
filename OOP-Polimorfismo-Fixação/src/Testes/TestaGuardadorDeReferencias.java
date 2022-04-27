package Testes;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.GuardadorDeReferencias;

public class TestaGuardadorDeReferencias {

    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc1 = new ContaCorrente(22, 11);
        guardador.adiciona(cc1);

        Conta cc2 = new ContaCorrente(22, 522);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();

        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }

}
