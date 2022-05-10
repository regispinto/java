package Util;

import Classes.Cliente;
import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenandoListas {
    public static void main(String[] args) {
        //
        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 11);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 44);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista1 = new ArrayList<>();
        lista1.add(cc1);
        lista1.add(cc2);
        lista1.add(cc3);
        lista1.add(cc4);

        System.out.println("-- [LISTA PELO NÚMERO DA CONTA] ---------------------------------");
        for (Conta conta: lista1) {
            System.out.println(conta);
        }

        // Classes anônimas
        lista1.sort(new Comparator<Conta>() {
                        @Override
                        public int compare(Conta c1, Conta c2) {
                            return Integer.compare(c1.getNumero(), c2.getNumero());
                        }
                    }
        );

        System.out.println("-- Lista Ordenada pelo número da conta ---------------------------");

        for (Conta conta: lista1) {
            System.out.println(conta);
        }
        //
        System.out.println("-- [LISTA PELO TITULAR DA CONTA] ---------------------------------");
        Conta cc5 = new ContaCorrente(22, 33);
        Cliente clienteCC5 = new Cliente();
        clienteCC5.setNome("Nico");
        cc5.setTitular(clienteCC5);
        cc5.deposita(333.0);

        Conta cc6 = new ContaPoupanca(22, 44);
        Cliente clienteCC6 = new Cliente();
        clienteCC6.setNome("Neco");
        cc6.setTitular(clienteCC6);
        cc6.deposita(444.0);

        Conta cc7 = new ContaCorrente(22, 11);
        Cliente clienteCC7 = new Cliente();
        clienteCC7.setNome("Paulo");
        cc7.setTitular(clienteCC7);
        cc7.deposita(111.0);

        Conta cc8 = new ContaPoupanca(22, 22);
        Cliente clienteCC8 = new Cliente();
        clienteCC8.setNome("Ana");
        cc8.setTitular(clienteCC8);
        cc8.deposita(222.0);

        List<Conta> lista2 = new ArrayList<>();
        lista2.add(cc5);
        lista2.add(cc6);
        lista2.add(cc7);
        lista2.add(cc8);
        //
        for (Conta conta: lista2) {
            System.out.println(conta);
        }

        // Classes anônimas
        lista2.sort(new Comparator<Conta>() {
                        @Override
                        public int compare(Conta c1, Conta c2) {
                            String nomeC1 = c1.getTitular().getNome();
                            String nomeC2 = c2.getTitular().getNome();
                            return nomeC1.compareTo(nomeC2);
                        }
                    }
        );

        System.out.println("-- Lista Ordenada pelo Nome do Titular ---------------------------");

        for (Conta conta: lista2) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
    }
}