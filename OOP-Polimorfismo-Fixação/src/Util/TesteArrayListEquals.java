package Util;

import Classes.Conta;
import Classes.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(22, 11);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 11);

        // Percorre a lista de contas e verifica se o número da conta do elemento cc3 já existe na lista.
        // Utilizado o método equals sobrescrito na classe Conta
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Object oRef : lista) {
            System.out.println(oRef);
        }
    }
}