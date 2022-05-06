package Util;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenandoListas {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 11);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 44);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta: lista) {
            System.out.println(conta);
        }

        OrdenaListaDeContas comparator = new OrdenaListaDeContas();
        lista.sort(comparator);

        System.out.println("-- Lista Ordenada ---------------------------");

        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}

class OrdenaListaDeContas implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        if(c1.getNumero() < c2.getNumero()) {
            return -1;
        }

        if(c1.getNumero() > c2.getNumero()) {
            return 1;
        }

        return 0;
    }
}


