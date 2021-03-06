package Testes;

import Classes.ContaCorrente;
import Classes.ContaPoupanca;
import Classes.SaldoInsuficienteException;

public class TestaContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111, 456);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(123, 654);
        cp.deposita(200.0);

        cc.transfere(110.0, cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

        Object cc1 = new ContaCorrente(22, 33);
        Object cp1 = new ContaPoupanca(33, 22);

        System.out.println(cc1);
        System.out.println(cp1);
    }
}
