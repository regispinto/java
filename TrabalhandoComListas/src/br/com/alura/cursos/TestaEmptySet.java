package br.com.alura.cursos;

import java.util.*;

public class TestaEmptySet {
    public static void main(String[] args) {
        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
    }
}
