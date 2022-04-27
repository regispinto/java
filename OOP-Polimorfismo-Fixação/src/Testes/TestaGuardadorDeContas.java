package Testes;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.GuardadorDeContas;

public class TestaGuardadorDeContas {
    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc1 = new ContaCorrente(22, 11);
        guardador.adiciona(cc1);

        Conta cc2 = new ContaCorrente(22, 522);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();

        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
