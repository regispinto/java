package br.com.alura.cursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {
    public static void main(String[] args) {
        //Collection<Integer> numeros = new ArrayList<Integer>();
        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);
    }
}
/*
O que é lento?
A inserção dos 50 mil elementos ou as 50 mil buscas? Descubra computando o tempo gasto em cada
for separadamente.

Se você passar de 50 mil para um número maior, como 100 mil, verá que isso inviabiliza por
completo o uso de uma List em casos que quisermos utilizá-la essencialmente para pesquisas.
*/


