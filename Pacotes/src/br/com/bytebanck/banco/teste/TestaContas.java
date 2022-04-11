package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.*;

public class TestaContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111, 456);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(123, 654);
        cp.deposita(200.0);

        cc.transfere(110.0, cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}
